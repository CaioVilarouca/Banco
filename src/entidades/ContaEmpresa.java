package entidades;

public class ContaEmpresa extends ContaComum{
	private Double emprestar;

	public ContaEmpresa(Integer number, Double saldo, Boolean status, Double emprestar) {
		super(number, saldo, status);
		this.emprestar = emprestar;
	}

	public Double getEmprestar() {
		return emprestar;
	}

	public void setEmprestar(Double emprestar) {
		this.emprestar = emprestar;
	}
	
	public void retirada(double saldo) {
		this.saldo = saldo - 5.0f;
	}
}
