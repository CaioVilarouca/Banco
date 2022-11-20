package entities;

public class Produto{
	private String produtos;
	private Integer amount ;
	
	public Produto(){
		
	}

	public Produto(String produtos, Integer amount) {
		super();
		this.produtos = produtos;
		this.amount = amount;
	}


	public String getProdutos() {
		return produtos;
	}

	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}

	public Integer getAmount() {
		return amount;
	}

	
	@Override
	public String toString() {
		return    "\n X   Produto.........: " +"[" + amount + "]:" + produtos
				+ "\n X   Valor do produto:";
	}
}
