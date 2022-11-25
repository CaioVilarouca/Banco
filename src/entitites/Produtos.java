package entitites;

public class Produtos{
	private String nomeProduto;
	private Integer amount;
	private Double valor;

	public Produtos(){
		super();
	}
	
	public Produtos(String nomeProduto, Integer amount, Double valor) {
		this.nomeProduto = nomeProduto;
		this.amount = amount;
		this.valor = valor;
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
	
	public double printSum(int amount, double valor) {
		return amount * valor;
	}
	
	public double sum(int amount, double valor){
		this.valor = amount * valor;
		return amount * valor;
	}
	
	@Override
	public String toString() {
		return String.format("\n X  Nome do produto .......: %s"
				+ "\n X  Quantidade pedida .....: [x%d]"
				+ "\n X  Preço .............. R$: %.2f"
				+ "\n X  -----------------------------------", nomeProduto, amount, valor);
	}
}

