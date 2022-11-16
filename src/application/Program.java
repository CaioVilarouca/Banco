package application;
import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		// Var locais 
		char menu;
		String name;
		Integer number;
		Double saldo;
		Boolean status = false;
	
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
			System.out.println();
			
			System.out.print("Nome do usuário :");
			name = scanner.next();
			System.out.print("Número da conta :#");
			number = scanner.nextInt();
			System.out.print("Deposita       R$:");
			saldo = scanner.nextDouble();
			
			Conta conta = new Conta(name, number, saldo);
			conta.deposit(saldo);
			conta.statusConta(status = true);
			
			
			System.out.println();
			System.out.println(conta);
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
