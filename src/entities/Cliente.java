package entities;

public class Cliente {
	private String name;
	private Long cpf;
	private Byte nasc;
	
	public Cliente() {
		
	}

	public Cliente(String name, Long cpf, Byte nasc) {
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

	public Byte getNasc() {
		return nasc;
	}

	
}
