package entitites;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Purchase> listPurchase = new ArrayList<Purchase>();
	
	public void addPurchase(Purchase purchase) {
		listPurchase.add(purchase);
	}
	
	public Double getValueTotalPurchase() {
		double valueTotal = 0;
		for (Purchase purchase : listPurchase) {
			valueTotal+= purchase.getTotalValueOfProduct();
		}
		return valueTotal;
	}
	
	public void listPurchase() {
		for (Purchase purchase : listPurchase) {
			System.out.println(purchase);
			
		}
	}
}
