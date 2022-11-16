package entidades;

public class Conta {
	public String name;
	private Integer number;
	private Double saldo;
	private Boolean status = false;
	
	public Conta() {
		super();
	}

	public Conta(String name,Integer number, Double saldo, Boolean status) {
		this.name = name;
		this.number = number;
		this.saldo = saldo;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	// Conta aberta
	public void statusAberta() {
		status = true; 
	}
	
	// Conta fechada
	public void statusFechada(){
		status = false;
	}
	
}
