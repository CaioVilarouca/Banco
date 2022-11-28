package entitites;

public class Purchase {
	private Integer amountPurchase;
	private Product product;
	
	public Purchase() {
		super();
	}

	public Purchase(Integer amountPurchase, Product product) {
		super();
		this.amountPurchase = amountPurchase;
		this.product = product;
	}

	public Integer getAmountPurchase() {
		return amountPurchase;
	}

	public void setAmountPurchase(Integer amountPurchase) {
		this.amountPurchase = amountPurchase;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Double getTotalValueOfProduct() {
		return amountPurchase *  product.getValueProduct();
	}

	@Override
	public String toString() {
		return "Purchase [amountPurchase=" + amountPurchase + ", product=" + product + "]";
	}
}
