package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String[] name = {"Caio", "Bianca", "Giovanna"};
			try {
				BufferedWriter url = new BufferedWriter(new FileWriter("C:/Users/Public/Desktop/NotaFiscal.txt"));
				url.write("ADOTADO");
				url.write("\nCaio Vilarouca \n");
				
				for (String x : name) {
					url.write("\n "+ x);
				}
				
				url.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	
		System.out.println("Executado com sucesso!");		
		/*Notal Fical
		 * 
		 * Class
		 * Cliente
		 * 	Name
		 * 	Cpf
		 * 	nasc
		 * 	Validadeidade()// So pode maior de idade
		 * Produto
		 * 	NameProduto
		 * 	Valor
		 * 	Quantidade
		 * sum() // Somar o valores do produtos
		 * 	DataCompra()// Data da compra e hora
		 * Status()// PRO ou REC
		 **/
	}

}
