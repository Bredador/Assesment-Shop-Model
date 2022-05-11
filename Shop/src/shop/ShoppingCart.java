package shop;

import java.util.List;

public abstract class ShoppingCart {
	
	private List<ShoppingCartEntry> shoppingCartEntries;
	
	public abstract Double getTotalPrice();
	
}
