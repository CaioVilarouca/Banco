package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitites.Cliente;
import entitites.Produtos;


public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		String nomeProduto, todyPayDay, name;
		char continueAdicionar, cpfNota;
		int amount;
		long cpf;
		double valor, valorProduto, valorFinal = 0;
		boolean adicionarMaisCompras;
		
		// Data do pagamento
		Date data = new Date();
		SimpleDateFormat  format = new SimpleDateFormat("dd/MM/yyyy");
		todyPayDay = format.format(data);
		
		List<Cliente> dadosDoCliente = new ArrayList<>();
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
				continueAdicionar = scanner.next().charAt(0);
				System.out.println("--------------------------------");
				adicionarMaisCompras = continueAdicionar =='s' || continueAdicionar == 'S'? true: false;
				scanner.nextLine();

			}while(adicionarMaisCompras == true);
			System.out.print("\n	Lista de compras finalizada.");
			
			// Dados do cliente
			System.out.print("\nDigite seu nome completo :");
			name = scanner.nextLine();
			System.out.print("CPF na nota :");
			cpf = scanner.nextLong();
			Cliente cliente = new Cliente(name, cpf);
			dadosDoCliente.add(cliente);
			
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
						+ "\n X                                                  "                                             
						+ "\n X                      Pagador                     "                                             
						+ "\n X ");
				// estanciando objeto
				for (Cliente x : dadosDoCliente) {
					url.write(""+ x);
				}

				// estanciando objeto
				for (Produtos x : listDeProdutos) {
					url.write(""+ x);
				}
				url.write(String.format("\n X  Data do debito :%s\n X  Valor do debito: R$%.2f",todyPayDay, valorFinal));
				
			url.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}catch (Exception erroGeral) {
			System.out.println("Dados inserido incorretamente!\nComprovante fiscal não foi gerado.");
		}
		System.out.println("\n 	Volte Sempre! "+ todyPayDay);
		System.out.println(" Fim do programa. ");
		scanner.close();
	}
	 // Desenvolvedor Caio Vilarouca
}
