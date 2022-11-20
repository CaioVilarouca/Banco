package entidades;

public class Cliente {
	
	protected String name;
	protected Long cpf;
	protected Integer nasc;
	protected Double renda;// Renda miníma
	
	public Cliente(String name, Long cpf, Integer nasc, Double renda) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.nasc = nasc;
		this.renda = renda;
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

	public Integer getNasc() {
		return nasc;
	}

	public void setNasc(Integer nasc) {
		this.nasc = nasc;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}
	
	// Maior de idade
	public void idade(int nasc) {
		this.nasc = nasc - 2022;
	}
}
