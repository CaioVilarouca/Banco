package entitites;

public class Cliente {
	private String name;
	private Long cpf;

	public Cliente() {
		super();
	}
	
	public Cliente(String name, Long cpf) {
		super();
		this.name = name;
		this.cpf = cpf;
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

	@Override
	public String toString() {
		return "\n X  Nome.......: " +name
				+ "\n X  CPF   .....: " +cpf;
	}

	
}
