package entidades;

public class ContaEmpresa extends Conta{
	 private Double emprestimo;

	public ContaEmpresa(String name, Integer number, Double saldo, Double emprestimo) {
		super(name, number, saldo);
		this.emprestimo = emprestimo;
	}



	public Double getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(Double emprestimo) {
		this.emprestimo = emprestimo;
	}
	
	//empresta dinheiro
	public void emp(double quantidade) {
		saldo -= quantidade;
	}
	
	@Override
	public String toString() {
		return "";
	}
}
