package entitites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	private String name;
	private Long cpf;
	private Integer idade;
	public String DayOfPagamento;
	
	public Cliente() {
		
	}

	public Cliente(String name, Long cpf, Integer idade) {
		super();
		this.name = name;
		this.cpf = cpf;
		idade(idade);
		diaDoPagamento();
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
	
	public void diaDoPagamento(){
		Date data = new Date();
		SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");
		DayOfPagamento = formatData.format(data);
	}
	
	@Override
	public String toString() {
		return"\n X   Nome.........: " + name 
				+ "\n X   CPF..........: " + cpf 
				+ "\n X   Idade........: " + idade
				+ "\n X"
				+ "\n X   Pagamento realizado na data :" + DayOfPagamento
				+ "\n X"
				+ "\n X";
	}
	
}
