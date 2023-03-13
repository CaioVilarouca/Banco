package application;

import java.util.Scanner;

import javax.swing.JOptionPane;

import entitites.Product;
import entitites.Purchase;

public class UI {
	Scanner scanner = new Scanner(System.in);

	String[] menu = { "Adicionar produto", "Valor total", "Sair" };
	int option, optionVerification, amountPurchase;
	double valueProduct, getTotalValueOfProduct;
	boolean verification;

	public void systemUI() {
		option = JOptionPane.showOptionDialog(null, "Menu de opções", "Menu", JOptionPane.DEFAULT_OPTION, 3, null, menu,
				menu[0]);

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
		
		// Add product 
		do {
			Product product = new Product();
			product.setNameProduct(JOptionPane.showInputDialog(null, "Nome do Produto :", "Carrinho", 3));
			try {
				product.setValueProduct(valueProduct = Double.parseDouble((String) JOptionPane.showInputDialog(null,"Produto [" + product.getNameProduct() + "] R$", "Preço", 3)));
				amountPurchase = Integer.parseInt((String) JOptionPane.showInputDialog(null,"Quantidade de " + product.getNameProduct() + " R$[" + product.getValueProduct()+"] ?", "Preço", 3));
			} catch (Exception e) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "Esse campo só aceita números.", "ERRO", 0, null);
			}
			
			// Add no carrinho
			Purchase purchase = new Purchase(amountPurchase, product); 

			// Resultado de quantidade + valor do produto
			getTotalValueOfProduct = purchase.getTotalValueOfProduct();
			JOptionPane.showMessageDialog(null, "Preço R$["+getTotalValueOfProduct+"], Produto ["+ product.getNameProduct()+"], quatidade ["+amountPurchase+"]", "Valor final", 1);

			
			// Verificação
			optionVerification = JOptionPane.showConfirmDialog(null, "Adicionar mais produtos ?", "Sair", 0);
			verification = optionVerification == 0 ? true : false;
		} while (true == verification);
	}
}

/*
 * Locale.setDefault(Locale.US); Scanner scanner = new Scanner(System.in);
 * 
 * ShoppingCart shoppingCart = new ShoppingCart();
 * 
 * String nameProduct; int amountPurchase; double valueProduct,
 * getTotalValueOfProduct; boolean addMorePurchases; char continueAdd;
 */

/*
 * try{ do { // Get de produtos System.out.printf("[ Nome do produto....: ");
 * nameProduct = scanner.nextLine();
 * 
 * System.out.printf("[ Valor do produto....[%s] R$:", nameProduct);
 * valueProduct = scanner.nextDouble();
 * 
 * // Add produtos Product product = new Product(nameProduct, valueProduct);
 * System.out.printf("[ Quatidade produto...[%s] : x", nameProduct);
 * amountPurchase = scanner.nextInt();
 * 
 * // Add produtos mais quantidades 
 * Purchase purchase = new Purchase(amountPurchase, product); 
 * getTotalValueOfProduct = purchase.getTotalValueOfProduct();
 * 
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
 * System.out.println("\n	Lista de compras finalizada.");
 * System.out.printf("\nCompra deu total de [R$%.2f] \nData da compra :%s",
 * shoppingCart.getValueTotalPurchase(), shoppingCart.datePerchase());
 * 
 * // Write no bloco de notas try { BufferedWriter url = new BufferedWriter(new
 * FileWriter("./Nota-Fiscal/Comprovante.txt"));
 * url.write(" X                                                  " +
 * "\n X             BANK WILTON -- BRASÍLIA              " +
 * "\n X                                                  " +
 * "\n X      RECIBO DE PAGAMAENTO - CODIGO DE BARRAS     " +
 * "\n X             PARA SIMPLES CONFERENCIA             " +
 * "\n X                                                  " +
 * "\n X   Agencia:0000  Terminal:0000  Conta:00000000-0  " +
 * "\n X                Wilton Comprovante                " +
 * "\n X                                                  " +
 * "\n X                                                  " +
 * "\n X                      Pagador                     " +
 * "\n X                                                  " +
 * "\n X   Nome: Caio Vilarouca                           " +
 * "\n X   CPF : 197.346.285                              " +
 * "\n X                                                  " + "\n X ");
 * 
 * url.write(String.
 * format(" Valor do debito :[R$%.2f] \n X  Data do debito  :%s",
 * shoppingCart.getValueTotalPurchase(), shoppingCart.datePerchase()));
 * 
 * for (Purchase list : shoppingCart.getListPurchase()){ url.write("\n X  "+
 * list); }
 * 
 * url.close(); } catch (IOException e) { e.printStackTrace(); } }catch
 * (Exception erroGeral) { System.out.
 * println("Dados inserido incorretamente!\nComprovante fiscal não foi gerado."
 * ); } scanner.close();
 */
// Desenvolvedor Caio Vilarouca