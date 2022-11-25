package entitites;

public class Produtos{
	private String nomeProduto;
	private Integer amount;
	private Double valor;
	private Double valorFinal;

	public Produtos(){
		super();
	}
	
	public Produtos(String nomeProduto, Integer amount, Double valor, Double valorFinal) {
		this.nomeProduto = nomeProduto;
		this.amount = amount;
		this.valor = valor;
		this.valorFinal= valorFinal;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Double getValor() {
		return valor;
	}
		
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public Double getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(Double valorFinal) {
		this.valorFinal = valorFinal;
	}
	
	public void printSum(int amount, double valor) {
		this.valor = amount *  valor;
		System.out.printf("[ Valor Final é ....[%s] R$:%.2f \n", nomeProduto, this.valor);
	}
	
	@Override
	public String toString() {
		return String.format("\n X  Nome do produto .......: %s"
				+ "\n X  Quantidade pedida .....: [%d]"
				+ "\n X  Preço .............. R$: %.2f"
				+ "\n X  -----------------------------------", nomeProduto, amount, valor);
	}
}

