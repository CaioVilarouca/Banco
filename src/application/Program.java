package application;

/*import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import entitites.Product;
import entitites.Purchase;
import entitites.ShoppingCart;*/


public class Program {
	public static void main(String[] args) {
		UI ui = new UI();
		ui.systemUI();
		/*Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		ShoppingCart shoppingCart = new ShoppingCart();
		
		String nameProduct;
		int amountPurchase;
		double valueProduct, getTotalValueOfProduct;
		boolean addMorePurchases;
		char continueAdd;
		*/
		/*	System.out.print("[-=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=-]\n"
				+ "[               SETOR DE COMPRAS              ]\n"
				+ "[-=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=-]\n"
				+ "[ Comprovante fiscal                          ]\n"
				+ "[---------------------------------------------]\n"
				+ "[ Exemplo:                                    ]\n"
				+ "[ Nome do Produto      : Produto X            ]\n"
				+ "[ Preço do Produto   R$: XX.XX                ]\n"
				+ "[ Quantidade do produto: xX                   ]\n"
				+ "[-=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=-]\n");*/
		
		
		/*try{			
			do {
				// Get de produtos
				System.out.printf("[ Nome do produto....: ");
				nameProduct = scanner.nextLine();
				System.out.printf("[ Valor do produto....[%s] R$:", nameProduct);
				valueProduct = scanner.nextDouble();
				// Add produtos
				Product product = new Product(nameProduct, valueProduct);
				System.out.printf("[ Quatidade produto...[%s] : x", nameProduct);
				amountPurchase = scanner.nextInt();
				// Add produtos mais quantidades
				Purchase purchase = new Purchase (amountPurchase, product);		
				getTotalValueOfProduct = purchase.getTotalValueOfProduct();
				System.out.printf("[ O valor total do(a).[%s] R$%.2f \n", nameProduct,getTotalValueOfProduct);
				System.out.print("[-=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=-]\n");
				// Add na compras no carrinho
				shoppingCart.addPurchase(purchase);
				
				// Estrutura de decisão para sair do loop de add lista de compras 
				System.out.print("Adicionar mais compras [S|N] :");
				continueAdd = scanner.next().charAt(0);
				System.out.println("--------------------------------");
				addMorePurchases = continueAdd =='s' || continueAdd == 'S'? true: false;
				scanner.nextLine();
				
			}while(addMorePurchases == true);
			System.out.println("\n	Lista de compras finalizada.");
			System.out.printf("\nCompra deu total de [R$%.2f] \nData da compra :%s", shoppingCart.getValueTotalPurchase(), shoppingCart.datePerchase());
			
			// Write no bloco de notas
			try {
				BufferedWriter url = new BufferedWriter(new FileWriter("./Nota-Fiscal/Comprovante.txt"));
				url.write(" X                                                  "
					+ "\n X             BANK WILTON -- BRASÍLIA              "
					+ "\n X                                                  "
					+ "\n X      RECIBO DE PAGAMAENTO - CODIGO DE BARRAS     "
				    + "\n X             PARA SIMPLES CONFERENCIA             "
					+ "\n X                                                  "
					+ "\n X   Agencia:0000  Terminal:0000  Conta:00000000-0  "
					+ "\n X                Wilton Comprovante                "
					+ "\n X                                                  "   
					+ "\n X                                                  "                                             
					+ "\n X                      Pagador                     "   
					+ "\n X                                                  "                                             
			        + "\n X   Nome: Caio Vilarouca                           "                                             
					+ "\n X   CPF : 197.346.285                              "    
					+ "\n X                                                  "                                             
					+ "\n X ");
				
					url.write(String.format(" Valor do debito :[R$%.2f] \n X  Data do debito  :%s", shoppingCart.getValueTotalPurchase(), shoppingCart.datePerchase()));
					
					for (Purchase list : shoppingCart.getListPurchase()){
						url.write("\n X  "+ list);
					}
					
					url.close();
					} catch (IOException e) {
						e.printStackTrace();
					}	
	}catch (Exception erroGeral) {
		System.out.println("Dados inserido incorretamente!\nComprovante fiscal não foi gerado.");
	}
	scanner.close();
	*/
	 // Desenvolvedor Caio Vilarouca
	}
}
