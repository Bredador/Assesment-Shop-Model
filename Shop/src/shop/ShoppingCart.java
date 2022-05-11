package shop;

import java.util.List;

import product.Product;

public abstract class ShoppingCart {
	
	private List<ShoppingCartEntry> shoppingCartEntries;
	
	public abstract Double getTotalPrice();
	
	public abstract ShoppingCartEntry addProcut(Product product, Double quantity);
	
	public abstract void purchaseShoppingCart();
}
