package entidades;

public class Conta {
	public String name;
	private Integer number;
	private Double saldo;
	private Boolean status;
	
	public Conta() {
		super();
	}

	public Conta(String name, Integer number, Double saldo) {
		this.name = name;
		this.number = number;
		this.saldo = saldo;
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
	
	// Status de conta
	public void statusConta(boolean status) {
		this.status = status; 
	}
	
	// Depositar dinheiro
	public void deposit(double quantidade) {
		saldo += quantidade;
	}
	
	// Retirada
	public void retirada(double quantidade) {
		saldo += quantidade - 5.0;
	}
	
	@Override
	public String toString() {
		return "Usuário da conta :" +name+
				"\nNúmero da conta :#"+number+
				"\nSaldo da conta R$:"+saldo+
				"\nStatus da conta :"+status;
	}
	
}
