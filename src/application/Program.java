package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Cliente;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String name;
		Long cpf;
		int idade;
		
		List<Cliente> dadosDoCliente = new ArrayList<>();
		
		try {
			// Dados pessoais 
			System.out.print("Nome :");
			name = scanner.nextLine();
			System.out.print("CPF :");
			cpf = scanner.nextLong();
			System.out.print("Data de nascimento (ex 0000) :");
			idade = scanner.nextInt();
	
			Cliente cliente = new Cliente(name, cpf, idade);
			dadosDoCliente.add(cliente);
			
			if(cliente.getIdade() >= 18) {
				try {
					BufferedWriter url = new BufferedWriter(new FileWriter("C:/Users/Public/Desktop/NotaFiscal.txt"));
					url.write("\n X                                                  "
							+ "\n X                                                  "
							+ "\n X                   Wilton Bank                    "
							+ "\n X                                                  "
							+ "\n X   Comprovante de pagamento                       "
							+ "\n X                                                  "
							+ "\n X                     Pagador                      "
							+ "\n X ");
					
					for (Cliente x : dadosDoCliente) {
						url.write(""+ x);
					}
					url.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Execultado com sucesso!");
			}else {
				System.out.println("Não foi possível imprimir a nota fiscal.\nMenor de idade " + cliente.getIdade());
			}
		}catch (Exception x){
			System.out.println("ERRO, dados digitado errado!\nNão foi possível gera nota fiscal.");	

		}
		scanner.close();
		/*Notal Fical
		 * 
		 * Class
		 * Cliente
		 * 	Name
		 * 	Cpf
		 * 	nasc
		 * 	Validadeidade()// So pode maior de idade
		 * Produto
		 * 	NameProduto
		 * 	Valor
		 * 	Quantidade
		 * sum() // Somar o valores do produtos
		 * 	DataCompra()// Data da compra e hora
		 * Status()// PRO ou REC
		 **/
	}

}
