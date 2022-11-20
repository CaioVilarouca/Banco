package entities;

public class Cliente {
	public String name;
	private Long cpf;
	private Integer nasc;
	
	public Cliente() {
		
	}

	public Cliente(String name, Long cpf, Integer nasc) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.nasc = nasc;
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

	@Override
	public String toString() {
		return "Cliente [name=" + name + ", cpf=" + cpf + ", nasc=" + nasc + "]";
	}
}
