package application;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path url = Paths.get("C:/Users/Public/Desktop/NotaFical.txt");
		String txt = "NOTA FISCAL";
		byte[] txtByte = txt.getBytes();
		try {
			Files.write(url, txtByte);
		}catch(Exception erro){
			System.out.println("ERRO, tente novamente mais tade!");
		}
		System.out.println("Fim do programa!");
		
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
		 * 	DataCompra()// Data da compra e hora
		 * Status()// PRO ou REC
		 **/
	}

}
