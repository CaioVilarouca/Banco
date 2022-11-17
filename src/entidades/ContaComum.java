package entidades;

public class ContaComum {
	protected Integer number; // Id da conta
	protected Double saldo;
	protected Boolean status;
	
	public ContaComum(Integer number, Double saldo, Boolean status) {
		super();
		this.number = number;
		this.saldo = saldo;
		this.status = status;
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

	/*public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}*/
	
	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	// Deposito
	public void deposit(double saldo) {
		this.saldo = saldo;
	}
	
	// Retirada
	public void retirada(double saldo) {
		// Limite de retirada de R$300
		if (saldo < 150.0) {
			this.saldo = saldo - 3.5f;
		}
	}
}
