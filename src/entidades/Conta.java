package entidades;

public class Conta {
	private Integer number;
	private Double saldo;
	private Boolean status;
	
	public Conta() {
		super();
	}

	public Conta(Integer number, Double saldo, Boolean status) {
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

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
}
