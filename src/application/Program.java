package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		char menu;
		
		// Hud 
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
			System.out.println("        Abrindo conta comum        ");
			
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
