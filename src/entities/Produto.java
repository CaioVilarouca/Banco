package entities;

public class Produto extends Cliente{
	private String nameProduto;
	private Double valor;
	private Integer amount;
	
	public Produto() {
		
	}

	public Produto(String nameProduto, Double valor, Integer amount) {
		super();
		this.nameProduto = nameProduto;
		this.valor = valor;
		this.amount = amount;
	}

	public String getNameProduto() {
		return nameProduto;
	}

	public void setNameProduto(String nameProduto) {
		this.nameProduto = nameProduto;
	}

	public Double getValor() {
		return valor;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	
}
