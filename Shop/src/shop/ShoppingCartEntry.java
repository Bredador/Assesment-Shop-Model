package shop;

import product.Product;

public abstract class ShoppingCartEntry {
	
	private Product product;
	private Double quantity;
	private Double pricePerQauntity;
	
	public abstract void changeQuantity();
}
