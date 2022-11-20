package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import entidades.ContaComum;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
				
		char menu;
		String name;
		long cpf;
		int nasc;
		double renda;

		// Hud OBS: Esse hud era para ser  swing
		System.out.print("\n"
				+ "│*-*-*-*-*-*-*-BANCO-*-*-*-*-*-*-*│\n"
				+ "│---------------------------------│\n"
				+ "│[A] Abri uma conta comum.........│\n"
				+ "│[B] Abri uma conta para empresa..│\n"
				+ "│[E] Fecha o aplicativo...........│\n"
				+ "│---------------------------------│\n"
				+ "│Opção :");
		menu = scanner.next().charAt(0);
		System.out.println();
		if(menu == 'a' || menu == 'A') {
			// Cleinte 
			System.out.println("              Abrindo conta comum             ");
			System.out.println("│--------------------------------------------│");		
				System.out.print("│Nome completo :");
				name = scanner.nextLine();
				scanner.nextLine();
				System.out.print("│CPF :");
				cpf = scanner.nextLong();
				System.out.print("│Data de nascimento :");
				nasc = scanner.nextInt();
				System.out.print("│Sua renda atual R$");
				renda = scanner.nextDouble();
				Cliente cliente = new Cliente(name, cpf, nasc, renda);
			System.out.println("│--------------------------------------------│");
			cliente.idade(nasc);
			System.out.println(cliente);
			
		}else if(menu == 'b' || menu == 'B') {
			System.out.println("     Abrindo conta para empresa    ");

			
		}else if(menu == 'e' || menu == 'E') {
			System.out.println(" Programa encerrado .Volte sempre! ");
		}else {
			System.out.println("ERRO 404, tente novamente mais tarde.");
		}
		scanner.close();
	}
	// Caio Vilarouca
}
