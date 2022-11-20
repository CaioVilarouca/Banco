package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	public String name;
	private Long cpf;
	private Integer idade;
	
	public Cliente() {
		
	}

	public Cliente(String name, Long cpf, Integer idade) {
		super();
		this.name = name;
		this.cpf = cpf;
		idade(idade);
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}
	
	/*formatado para tipo simple, depois formatado para String,
	 * depois uma classe invólucro para converte para Interger*/
	public void idade(int nasc) {
		Date data = new Date();
		SimpleDateFormat formatData = new SimpleDateFormat("y");
		String formatDataString = formatData.format(data);
		int formatDataInt =  Integer.parseInt(formatDataString);
		idade = formatDataInt - nasc;
	}
	
	@Override
	public String toString() {
		return "\nNome :" + name 
				+ "\nCPF :" + cpf 
				+ "\nIdade :" + idade;
	}
}
