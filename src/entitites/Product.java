package entitites;

public class Product{
	private String nameProduct;
	private Double valueProduct;
	
	public Product() {
		super();
	}

	public Product(String nameProduct, Double valueProduct) {
		super();
		this.nameProduct = nameProduct;
		this.valueProduct = valueProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public Double getValueProduct() {
		return valueProduct;
	}

	public void setValueProduct(Double valueProduct) {
		this.valueProduct = valueProduct;
	}

	@Override
	public String toString() {
		return "Product [nameProduct=" + nameProduct + ", valueProduct=" + valueProduct + "]";
	}
}

