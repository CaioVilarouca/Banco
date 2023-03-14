package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entitites.Product;
import entitites.Purchase;
import entitites.ShoppingCart;

public class UI {
	Scanner scanner = new Scanner(System.in);
	ShoppingCart shoppingCart = new ShoppingCart();

	private String[] menu = { "Adicionar produto", "Valor total", "Sair" };
	private int option, optionVerification, amountPurchase, optionVerificationExit;
	protected double valueProduct, getTotalValueOfProduct;
	private boolean verification, verificationExit = true;

	public void systemUI() {
		do {
			option = JOptionPane.showOptionDialog(null, "Menu de opções", "Menu " + shoppingCart.datePerchase() + "",
					JOptionPane.DEFAULT_OPTION, 3, null, menu, menu[0]);

			switch (option) {
			case 0:
				systemAddProduct();
				break;
			case 1:
				valueTotallyCart();
				break;
			default:
				optionVerificationExit = JOptionPane.showConfirmDialog(null, "Sair da Carrinho ?", "Sair", 0);
				verificationExit = optionVerificationExit == 1 ? true : false;
				break;
			}
		} while (verificationExit);
	}

	public void systemAddProduct() {

		// Add product
		do {
			Product product = new Product();
			product.setNameProduct(JOptionPane.showInputDialog(null, "Nome do Produto :", "Carrinho", 3));
			try {
				product.setValueProduct(valueProduct = Double.parseDouble((String) JOptionPane.showInputDialog(null,
						"Produto [" + product.getNameProduct() + "] R$:", "Preço", 3)));
				amountPurchase = Integer.parseInt((String) JOptionPane.showInputDialog(null,
						"Quantidade de " + product.getNameProduct() + " R$:[" + product.getValueProduct() + "] ?",
						"Preço", 3));
			} catch (Exception e) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "Esse campo só aceita números.", "ERRO", 0, null);
				break;
			}

			// Add no carrinho
			Purchase purchase = new Purchase(amountPurchase, product);
			shoppingCart.addPurchase(purchase);

			// Resultado de quantidade + valor do produto
			getTotalValueOfProduct = purchase.getTotalValueOfProduct();
			JOptionPane.showMessageDialog(null, "Preço R$:[" + getTotalValueOfProduct + "], Produto ["
					+ product.getNameProduct() + "], quatidade [" + amountPurchase + "]", "Valor final", 1);

			// Verificação
			optionVerification = JOptionPane.showConfirmDialog(null, "Adicionar mais produtos ?", "Sair", 0);
			verification = optionVerification == 0 ? true : false;
		} while (verification);
		valueTotallyCart();
		WriteCart();
	}

	public void valueTotallyCart() {
		// Valor final do carrinho
		if (shoppingCart.getValueTotallyPurchase() == 0) {
			JOptionPane.showMessageDialog(null, "Carrinho esta vazio!", "Carrinho", 2);
		} else {
			JOptionPane.showMessageDialog(null, "Valor final R$:[" + shoppingCart.getValueTotallyPurchase() + "]",
					"Valor final " + shoppingCart.datePerchase() + "", 1);
		}

	}

	public void WriteCart() {
		// Print no bloco de notas
		try {
			BufferedWriter url = new BufferedWriter(new FileWriter("./Nota-Fiscal/Comprovante.txt"));
			url.write(String.format(" X  Valor do debito :[R$%.2f] \n X  Data do debito  :%s",
					shoppingCart.getValueTotallyPurchase(), shoppingCart.datePerchase()));

			for (Purchase list : shoppingCart.getListPurchase()) {
				url.write("\n X  " + list);
			}

			url.close();

		} catch (Exception e) {
			
		}
	}
}