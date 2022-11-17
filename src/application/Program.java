package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		char menu;
		
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
			System.out.println("Abrindo conta comum");
			
		}else if(menu == 'b' || menu == 'B') {
			System.out.println("Abrindo conta para empresa");
			
		}else if(menu == 'e' || menu == 'E') {
			System.out.println("Programa encerrado .Volte sempre!");
		}else {
			System.out.println("Erro 404, tente novamente mais tarde.");
		}
		
		// Cliente 
		/*name
		 *cpf
		 *nasc
		 *renda miníma*/
		
		// Conta comum
		/*number
		 *saldo atual
		 *status de conta - boolean
		 *-----------------
		 *retirada com limite e juros 3.5 reais
		 *Status de conta()
		 *deposit()
		 *retirada()*/
		
		// Conta empresa
		/*number
		 *saldo atual
		 *status de conta - boolean 
		 *emprestimo
		 *-----------------
		 *retirada sem limite e juros 5 reais
		 *Status de conta()
		 *deposit()
		 *retirada()
		 *emp emprestimo so pode acontecer se valor pedido for 
		 *25 do valor na conta*/
		
		// Painel de Menu de cadastra
	}
	// Caio Vilarouca
}
