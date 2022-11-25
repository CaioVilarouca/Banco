package entitites;

public class Cliente {
	private String name;
	private Long cpf;

	public Cliente() {
		super();
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


	/*formatado para tipo simple, depois formatado para String,
	 * depois uma classe invólucro para converte para Interger
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
	*/
	@Override
	public String toString() {
		return"";
	}
}
