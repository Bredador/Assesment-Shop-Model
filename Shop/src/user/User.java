package user;

import java.util.List;

import product.ProductEvent;
import shop.ShoppingCart;

public class User {

	private String name;
	private String address;
	private ShoppingCart shoppingCart;
	
	private List<ProductEvent> subscribedProductEvents;
	
}
