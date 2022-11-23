package entitites;

public class Caixa extends Produtos{
	private Double total;
	private Integer payDay;
	private Boolean statusPay;
	
	public Caixa() {
		super();
	}


	public Double getTotal() {
		return total;
	}

	public Integer getPayDay() {
		return payDay;
	}

	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}

	public Boolean getStatusPay() {
		return statusPay;
	}

	public void setStatusPay(Boolean statusPay) {
		this.statusPay = statusPay;
	}
	
	public void sum() {
		total += valor;
	}
	
	@Override
	public String toString() {
		return "O valor total é R$:"+total;
	}
}
