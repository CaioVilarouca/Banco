package application;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class UI {
	Scanner scanner = new Scanner(System.in);

	String[] menu = { "Adicionar produto", "Valor total", "Sair" };
	int option;

	public void systemUI(){
		option = JOptionPane.showOptionDialog(null, "Menu de opções", "Menu", JOptionPane.DEFAULT_OPTION, 3, null, menu, menu[0]);
		
		switch (option) {
		case 0:
			systemAddProduct();
			break;
		case 1:
			break;
		case 2:
			break;
		default:
			break;
		}
	}

	public void systemAddProduct() {
	}
}
/*
 * try{ do { // Get de produtos System.out.printf("[ Nome do produto....: ");
 * nameProduct = scanner.nextLine();
 * System.out.printf("[ Valor do produto....[%s] R$:", nameProduct);
 * valueProduct = scanner.nextDouble(); // Add produtos Product product = new
 * Product(nameProduct, valueProduct);
 * System.out.printf("[ Quatidade produto...[%s] : x", nameProduct);
 * amountPurchase = scanner.nextInt(); // Add produtos mais quantidades Purchase
 * purchase = new Purchase (amountPurchase, product); getTotalValueOfProduct =
 * purchase.getTotalValueOfProduct();
 * System.out.printf("[ O valor total do(a).[%s] R$%.2f \n",
 * nameProduct,getTotalValueOfProduct);
 * System.out.print("[-=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=-]\n"); // Add
 * na compras no carrinho shoppingCart.addPurchase(purchase);
 * 
 * // Estrutura de decisão para sair do loop de add lista de compras
 * System.out.print("Adicionar mais compras [S|N] :"); continueAdd =
 * scanner.next().charAt(0);
 * System.out.println("--------------------------------"); addMorePurchases =
 * continueAdd =='s' || continueAdd == 'S'? true: false; scanner.nextLine();
 * 
 * }while(addMorePurchases == true);
 */