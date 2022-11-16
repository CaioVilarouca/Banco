package application;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char menu;
		System.out.print("*-*-*-*-*-*-*- BANCO -*-*-*-*-*-*-*\n"
				+ ""
				+ "Abri uma conta ?\n"
				+ "	[A] Conta comum\n"
				+ "	[B] Conta empresarial\n"
				+ "	[E] Exit\n"
				+ "Digite aqui:");
		
		menu = scanner.next().charAt(0);
		// Tratando erro possíveis
		menu = menu == 'A' ?'a':menu;
		menu = menu == 'B' ?'b':menu;
		menu = menu == 'E' ?'e':menu;

		switch (menu){
		case 'a':
			System.out.println("Abrindo conta comum.");
			break;
		case 'b':
			System.out.println("Abrindo conta empresarial.");
			break;
		case 'e':
			System.out.println("Programa fechado!");
			break;
		default:
			System.out.println("ERRO, tente novamente mais tarde.");
		}
		/*tipo-poupança ou corrente

		 * 
		 * Classe
		 * 	NumberConta-public
		 * 	dono
		 * 	saldo
		 * 	status
		 * 
		 * Metodos
		 * 	abrirConta-boolean-30P-50C
		 * 	FechaConta-não pode fecha com dinheiro na conta
		 * 	Deposit
		 * 	Sacar
		 * 	PagarMensal-12.5P-50C*/
	}
	//Caio Vilarouca
}
