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
		emprestimo = saldo - quantidade;
	}
	
	// status da conta
	public void statusSaldo() {
		if(saldo > 0) {
			System.out.println("Status da sua conta esta POSITIVO é " + saldo);
		}else {
			System.out.println("Status da sua conta esta NEGATIVO é " + saldo);
		}
	}
	
	@Override
	public String toString() {
		return "Usuário da conta :" +name+
				"\nNúmero da conta :#"+number+
				"\nSaldo da conta R$:"+saldo+
				"\nStatus da conta :"+status+
				"\n"+
				"\nEmprestimo :R$"+ emprestimo ;
	}
}
