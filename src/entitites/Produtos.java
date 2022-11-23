package entitites;

public class Produtos{
	private String nomeProduto;
	private Integer amount ;
	protected Double valor;
	
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
		
	public void printSum(int amount, double valor) {
		this.valor = amount * valor;
		System.out.printf("[ O valor total.....[R$:%.2f] do(a) %s\n",this.valor, nomeProduto);
	}

	public String toString() {
		return String.format("\n X Nome do produto .......: %s"
				+ "\n X Quantidade ............: [%d]"
				+ "\n X Preço ...............R$: %.2f"
				+ "\n X ---------------------------------", nomeProduto, amount, valor);

	}
}
