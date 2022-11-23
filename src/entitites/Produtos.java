package entitites;

public class Produtos{
	private String nomeProduto;
	private Integer amount ;
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



	/*
	// Somando compra
	public void sum(int saldo) {
		this.saldo = amount * saldo;
	}
	*/
	@Override
	public String toString() {
		return    "\n X   Produto.........: " +"[" + amount + "]:" 
				+ "\n X   Valores das compras R$" +".00";
	}
}
