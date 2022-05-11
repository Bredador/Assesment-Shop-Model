package shop;

import product.Product;

public class ShoppingCartEntry {
	
	private Product product;
	private Double quantity;
	private Double pricePerQauntity;
	
	
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	public Double getPricePerQauntity() {
		return pricePerQauntity;
	}
	public void setPricePerQauntity(Double pricePerQauntity) {
		this.pricePerQauntity = pricePerQauntity;
	}
}
