package application;
import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;
import entidades.ContaEmpresa;
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		// Var locais 
		char menu, emp;
		String name;
		Integer number;
		Double saldo, emprestimo = null;
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
			System.out.println();
			
			System.out.print("Nome do usuário :");
			name = scanner.next();
			System.out.print("Número da conta :#");
			number = scanner.nextInt();
			System.out.print("Deposita       R$:");
			saldo = scanner.nextDouble();
			
			System.out.print("Quer empresta dinheiro S|N ?");
			emp = scanner.next().charAt(0);
			emp = emp == 'S' ? 's':emp;
			emp = emp == 'N' ? 'n':emp;
			
			System.out.println();
			if(emp == 's') {
				System.out.println("Quanto você quer emprestar ? ");
				emprestimo = scanner.nextDouble();
			}else if (emp == 'n') {
				System.out.println("Não fazer emprestimo!");
			}else {
				System.out.println("ERRO, tente novamente mais tarde !");
			}
			
			ContaEmpresa contaEmpresa = new ContaEmpresa(name, number, saldo, emprestimo);
			contaEmpresa.deposit(saldo);
			contaEmpresa.statusConta(status = true);
			contaEmpresa.emp(emprestimo);
			
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
