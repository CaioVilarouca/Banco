package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//import entitites.Caixa;
//import entitites.Cliente;
import entitites.Produtos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		String nomeProduto, continueAdicionar;
		int amount;
		double valor;
		boolean adicionarMaisCompras;
		
		//char continueCompras;
		
		//List<Cliente> dadosDoCliente = new ArrayList<>();
		List<Produtos> listDeProdutos = new ArrayList<>();
		//List<Caixa> carrinho = new ArrayList<>();
		
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
				System.out.printf("[ Valor do produto..[%s] R$:", nomeProduto);
				valor = scanner.nextDouble();
				
				// Adicionado produtos a lista genérica
				Produtos produtos = new Produtos(nomeProduto, amount, valor);
				listDeProdutos.add(produtos);
				
				// Somando quantidade e o valor do produto
				produtos.printSum(amount, valor);
				System.out.println("[-=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=-]");
				
				// Estrutura de decisão para sair do loop de add lista de compras 
				System.out.print("Adicionar mais compras [S|N] :");
				continueAdicionar = scanner.next();
				System.out.println("--------------------------------");
				adicionarMaisCompras = continueAdicionar.equals("s") || continueAdicionar.equals("S")? true: false;
				
				scanner.nextLine();
			}while(adicionarMaisCompras == true);
			System.out.print("\nLista de compras finalizada.");
			
		}catch (Exception erroGeral) {
			System.out.println("Dados inserido incorretamente!\nComprovante fiscal não foi gerado.");
		}
				
		// Write no bloco de notas
		try {
			BufferedWriter url = new BufferedWriter(new FileWriter("./Nota-Fiscal/Comprovante.txt"));
			url.write(" X                                                  "
					+ "\n X                                                  "
					+ "\n X              BANK Wilton - Brasília              "
					+ "\n X                                                  "
					+ "\n X                Wilton Comprovante                "
					+ "\n X                                                  "
					+ "\n X   Comprovante de pagamento                       "
					+ "\n X                                                  "
					+ "\n X                     Pagador                      "
					+ "\n X ");
			
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
		System.out.println("Fim do programa, volte sempre !");
		scanner.close();
		/*	
			try {// Tratando erro do usuário 
				// Dados pessoais 
				System.out.print("Nome :");
				name = scanner.nextLine();
				System.out.print("CPF :");
				cpf = scanner.nextLong();
				System.out.print("Data de nascimento (ex 0000) :");
				idade = scanner.nextInt();
		
				//Cliente cliente = new Cliente(name, cpf, idade);
			    //dadosDoCliente.add(cliente);
				
				if(cliente.getIdade() >= 18){ //Validação de idade
					try {
						BufferedWriter url = new BufferedWriter(new FileWriter("./Nota-Fiscal/Comprovante.txt"));
						url.write(" X                                                  "
								+ "\n X                                                  "
								+ "\n X              BANK Wilton - Brasília              "
								+ "\n X                                                  "
								+ "\n X                Wilton Comprovante                "
								+ "\n X                                                  "
								+ "\n X   Comprovante de pagamento                       "
								+ "\n X                                                  "
								+ "\n X                     Pagador                      "
								+ "\n X ");
						
						for (Cliente x : dadosDoCliente) {
							url.write(""+ x);
						}
						for (Produto x : listDeProdutos) {
							url.write(""+ x);
						}
						url.write("\n X\n X----------------------------------------"
								+ "\n X O Valor total a pagar é R$"+saldoFinal+".00\n X ....");
						url.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.println("Execultado com sucesso!");
				}else {
					System.out.println("Não foi possível imprimir a nota fiscal.\nMenor de idade " + cliente.getIdade());
				}
			}catch (Exception x){
				System.out.println("ERRO, dados digitado errado!\nNão foi possível gera nota fiscal.");	
			}
		}else {
			System.out.println("Loja encerrada, volte sempre!");			
		}
		*/
	}
	 // Desenvolvedor Caio Vilarouca
}
