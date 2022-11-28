package application;

//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entitites.Product;
import entitites.Purchase;
import entitites.ShoppingCart;


public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		ShoppingCart shoppingCart = new ShoppingCart();
		
		String nameProduct;
		int amountPurchase;
		double valueProduct, getTotalValueOfProduct;
		boolean addMorePurchases;
		char continueAdd;
		
		System.out.print("[-=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=-]\n"
				+ "[               SETOR DE COMPRAS              ]\n"
				+ "[-=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=-]\n"
				+ "[ Comprovante fiscal                          ]\n"
				+ "[---------------------------------------------]\n"
				+ "[ Exemplo:                                    ]\n"
				+ "[ Nome do Produto      : Produto X            ]\n"
				+ "[ Preço do Produto   R$: XX.XX                ]\n"
				+ "[ Quantidade do produto: xX                   ]\n"
				+ "[-=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=-]\n");
		
		try{			
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
			System.out.println("	Lista de compras finalizada.");
			System.out.println(shoppingCart.getValueTotalPurchase());
			shoppingCart.listPurchase();
	
	}catch (Exception erroGeral) {
		System.out.println("Dados inserido incorretamente!\nComprovante fiscal não foi gerado.");
	}
		scanner.close();
		/*		CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

		for (int i = 1; i <= 3; i++) {
			Produto produto = new Produto(20.0, "Carrinho");
			Compra compra = new Compra(i, produto);
			System.out.println(compra.getTotalCompra());
			carrinhoCompras.adicionarCompra(compra);
		}

		carrinhoCompras.listarCompras();
		System.out.println(carrinhoCompras.getValorTotal());
*/
		
		
		
		//Locale.setDefault(Locale.US);
		//
		
		/*String nomeProduto, todyPayDay, name;
		char continueAdicionar, cpfNota;
		int amount;
		long cpf;
		double valor, valorProduto, valorFinal = 0;
		boolean adicionarMaisCompras;*/
		
		// Data do pagamento
		/*Date data = new Date();
		SimpleDateFormat  format = new SimpleDateFormat("dd/MM/yyyy");
		todyPayDay = format.format(data);*/
		
		//List<Cliente> dadosDoCliente = new ArrayList<>();
		//List<Produtos> listDeProdutos = new ArrayList<>();

		// Tudo dentro do try catch		
		//try{			

			//do {
				// Get de dados
				/*System.out.printf("[ Nome do produto..: ");
				nomeProduto = scanner.nextLine();
				System.out.printf("[ Quatidade ........[%s] : x", nomeProduto);
				amount = scanner.nextInt();
				System.out.printf("[ Valor do produto..[%s] R$:", nomeProduto);
				valor = scanner.nextDouble();*/
				
				// Adicionado produtos a lista genérica
				/*Produtos produtos = new Produtos(nomeProduto, amount, valor);
				listDeProdutos.add(produtos);*/
				
				// Soma de quantidade mais valor e atribuido numa var acomulativo
				/*produtos.sum(amount, valor);
				valorProduto = produtos.sum(amount, valor);
				valorFinal  += produtos.sum(amount, valor);
				System.out.printf("[ Valor Final é ....[%s] R$:%.2f \n",nomeProduto, valorProduto);
				System.out.println("[-=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=--=*=-]");*/
				
				// Estrutura de decisão para sair do loop de add lista de compras 
				/*System.out.print("Adicionar mais compras [S|N] :");
				continueAdicionar = scanner.next().charAt(0);
				System.out.println("--------------------------------");
				adicionarMaisCompras = continueAdicionar =='s' || continueAdicionar == 'S'? true: false;
				scanner.nextLine();*/

			//}while(adicionarMaisCompras == true);
			//System.out.print("\n	Lista de compras finalizada.");
			
			// Dados do cliente
			/*System.out.print("\nDigite seu nome completo :");
			name = scanner.nextLine();
			System.out.print("CPF na nota :");
			cpf = scanner.nextLong();
			Cliente cliente = new Cliente(name, cpf);
			dadosDoCliente.add(cliente);*/
			
			// Write no bloco de notas
			/*			try {
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
						+ "\n X ");
				for (Cliente x : dadosDoCliente) {
					url.write(""+ x);
				}

				for (Produtos x : listDeProdutos) {
					url.write(""+ x);
				}
				url.write(String.format("\n X  Data do debito :%s\n X  Valor do debito: R$%.2f",todyPayDay, valorFinal));
				
			url.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}catch (Exception erroGeral) {
			System.out.println("Dados inserido incorretamente!\nComprovante fiscal não foi gerado.");
		}
		System.out.println("\n 	Volte Sempre! "+ todyPayDay);
		System.out.println(" Fim do programa. ");
		scanner.close();*/
	}
	 // Desenvolvedor Caio Vilarouca
}
