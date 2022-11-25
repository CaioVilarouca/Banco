package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//import entitites.Cliente;
import entitites.Produtos;


public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		String nomeProduto = "", continueAdicionar;
		int amount;
		double valor, valorProduto, valorFinal = 0;
		boolean adicionarMaisCompras;
				
		//List<Cliente> dadosDoCliente = new ArrayList<>();
		List<Produtos> listDeProdutos = new ArrayList<>();
				
		System.out.print("[-=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=-]\n"
				+ "[               SETOR DE COMPRAS              ]\n"
				+ "[-=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=-]\n"
				+ "[ Comprovante fiscal                          ]\n"
				+ "[---------------------------------------------]\n"
				+ "[ Exemplo:                                    ]\n"
				+ "[ Nome do Produto      : Produto X            ]\n"
				+ "[ Quantidade do produto: xX                   ]\n"
				+ "[ Preço do Produto   R$: XX.XX                ]\n"
				+ "[-=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=-]\n");

		// Tudo dentro do try catch		
		try{			

			do {
				// Get de dados
				System.out.printf("[ Nome do produto..: ");
				nomeProduto = scanner.nextLine();
				System.out.printf("[ Quatidade ........[%s] : x", nomeProduto);
				amount = scanner.nextInt();
				System.out.printf("[ Valor do produto..[%s] R$:", nomeProduto);
				valor = scanner.nextDouble();
				
				// Adicionado produtos a lista genérica
				Produtos produtos = new Produtos(nomeProduto, amount, valor);
				listDeProdutos.add(produtos);
				
				// Soma de quantidade mais valor e atribuido numa var acomulativo
				produtos.sum(amount, valor);
				valorProduto = produtos.sum(amount, valor);
				valorFinal  += produtos.sum(amount, valor);
				System.out.printf("[ Valor Final é ....[%s] R$:%.2f \n",nomeProduto, valorProduto);
				System.out.println("[-=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=-]");
				
				// Estrutura de decisão para sair do loop de add lista de compras 
				System.out.print("Adicionar mais compras [S|N] :");
				continueAdicionar = scanner.next();
				System.out.println("--------------------------------");
				adicionarMaisCompras = continueAdicionar.equals("s") || continueAdicionar.equals("S")? true: false;
				scanner.nextLine();

			}while(adicionarMaisCompras == true);
			System.out.print("\nLista de compras finalizada.");
			// Write no bloco de notas
			
			try {
				BufferedWriter url = new BufferedWriter(new FileWriter("./Nota-Fiscal/Comprovante.txt"));
				url.write(" X                                                  "
						+ "\n X             BANK WILTON -- BRASÍLIA              "
						+ "\n X                                                  "
						+ "\n X      RECIBO DE PAGAMAENTO - CODIGO DE BARRAS     "
						+ "\n X             PARA SIMPLES CONFERENCIA             "
						+ "\n X                                                  "
						+ "\n X   Agencia:0000  Terminal:0000  Conta:00000000-0  "
						+ "\n X                Wilton Comprovante                "
						+ "\n X                                                  "                                             
						+ "\n X ");


				// estanciando objeto
				for (Produtos x : listDeProdutos) {
					url.write(""+ x);
				}
				url.write(String.format("\n X  Valor do debito: R$[%.2f]", valorFinal));
				
			url.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}catch (Exception erroGeral) {
			System.out.println("Dados inserido incorretamente!\nComprovante fiscal não foi gerado.");
		}
		System.out.println("Fim do programa, volte sempre !");
		scanner.close();
	}
	 // Desenvolvedor Caio Vilarouca
}
