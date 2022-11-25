package entitites;

public class Produtos{
	private String nomeProduto;
	private Integer amount;
	private Double valor;
	private Double valorFinal;

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
	
	public Double getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(Double valorFinal) {
		this.valorFinal = valorFinal;
	}

	// Mesma operação, uma retorna para console e a outra para a lista
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

