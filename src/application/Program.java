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
		
		String nomeProduto, continueAdicionar;
		int amount, amountFinal;
		double valor, valorFinal;
		boolean adicionarMaisCompras;
		
		//char continueCompras;
		
		//List<Cliente> dadosDoCliente = new ArrayList<>();
		List<Produtos> listDeProdutos = new ArrayList<>();
		
		System.out.print("[-=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=-]\n"
				+ "[               SETOR DE COMPRAS              ]\n"
				+ "[-=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=-]\n"
				+ "[ Comprovante fiscal                          ]\n"
				+ "[---------------------------------------------]\n"
				+ "[ Exemplo:                                    ]\n"
				+ "[ Preço do Produto   R$:XX.XX                 ]\n"
				+ "[ Nome do Produto      :Produto X             ]\n"
				+ "[ Quantidade           :X                     ]\n"
				+ "[-=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=-]\n");
		
		try {
			do {
				System.out.printf("[ Nome do produto..: ");
				nomeProduto = scanner.nextLine();
				System.out.printf("[ Quantidade de.....[%s]   : x", nomeProduto);
				amount = scanner.nextInt();
				//amountFinal = amount;
				System.out.printf("[ Valor do produto..[%s] R$:", nomeProduto);
				valor = scanner.nextDouble();
				//valorFinal = valor;
				
				// Adicionado produtos a lista genérica
				Produtos produtos = new Produtos(nomeProduto, amount, valor);
				listDeProdutos.add(produtos);
				
				// Somando quantidade e o valor do 
				produtos.printSum(amount, valor);
				//produtos.sum(amountFinal, valorFinal);

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

				url.write("\n X  Data do debito :\n X  Valor total :");
				
				/*for (Cliente x : dadosDoCliente) {
					url.write(""+ x);
				}*/
				// estanciando objeto
				for (Produtos x : listDeProdutos) {
					url.write(""+ x);
				}
				
				
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
	
	/*Cliente da valor final / pagamento pendente / dia do pagamento / hora do pagamento*/
}
