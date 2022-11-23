package entitites;

public class Produto{
	private String produtos;
	private Integer amount ;
	private Integer saldo;
	
	public Produto(){
		
	}

	public Produto(String produtos, Integer amount, Integer saldo) {
		super();
		this.produtos = produtos;
		this.amount = amount;
		this.saldo = saldo;
		sum(saldo);
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
	
	public Integer getSaldo() {
		return saldo;
	}
	
	// Somando compra
	public void sum(int saldo) {
		this.saldo = amount * saldo;
	}
	
	@Override
	public String toString() {
		return    "\n X   Produto.........: " +"[" + amount + "]:" + produtos
				+ "\n X   Valores das compras R$"  +saldo+".00";
	}
}
