package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Cliente;
import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name, produtos;
		long cpf;
		int idade, amount = 0, saldoFinal;
		char menu, continueCompras;
		
		List<Cliente> dadosDoCliente = new ArrayList<>();
		List<Produto> listDeProdutos = new ArrayList<>();
		
		System.out.print("\n----=-=-== Loja de 9.99 ==-=-=----"// Hud
				+ "\n	Vamos as compras!"
				+ "\n"
				+ "\n   [Y] Ir as compra ou [N] Não ir as compras"
				+ "\n Opção :");
		
		menu = scanner.next().charAt(0);
		System.out.println("Vamos as compras..........\n");
		if(menu == 'y' || menu == 'Y'){// Validação para ir as compras 
			// Add compras no carrinho
			do {
				System.out.print("Nome do produto :");
				amount++;
				scanner.nextLine();
				produtos = scanner.nextLine();
				System.out.println("Produto custa R$9.99");
				
				Produto produto = new Produto(produtos, amount, 10);
				listDeProdutos.add(produto);
				saldoFinal = produto.getSaldo();
				
				System.out.println("Quer continuar as compras [Y] ou [N]");
				continueCompras = scanner.next().charAt(0);
				
			}while(continueCompras == 'y' || continueCompras == 'Y');
			scanner.nextLine();
			System.out.println("Compras finalizada!"
					+ "\nPrecisamos de alguns dados seus para emitir sua nota fiscal."
					+ "\n------------------------------------------------------------");

			try {// Tratando erro do usuário 
				// Dados pessoais 
				System.out.print("Nome :");
				name = scanner.nextLine();
				System.out.print("CPF :");
				cpf = scanner.nextLong();
				System.out.print("Data de nascimento (ex 0000) :");
				idade = scanner.nextInt();
		
				Cliente cliente = new Cliente(name, cpf, idade);
				dadosDoCliente.add(cliente);
				
				if(cliente.getIdade() >= 18){ //Validação de idade
					try {
						BufferedWriter url = new BufferedWriter(new FileWriter("./Nota-Fiscal/Comprovante.txt"));
						url.write(" X                                                  "
								+ "\n X                                                  "
								+ "\n X                   Wilton Fiscal                  "
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
		scanner.close();
	}
	 // Desenvolvedor Caio Vilarouca
}
