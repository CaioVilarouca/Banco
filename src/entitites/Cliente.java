package entitites;

public class Cliente {
	private String name;
	private Long cpf;
	private Integer idade;
	private Integer nasc;
	
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

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Integer getNasc() {
		return nasc;
	}

	public void setNasc(Integer nasc) {
		this.nasc = nasc;
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