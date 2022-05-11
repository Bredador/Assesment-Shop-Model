package user;

import java.util.List;

import product.DigitalProduct;
import product.ProductEvent;
import shop.ShoppingCart;

public class User {

	private String name;
	private String address;
	private String mailAddress;
	private ShoppingCart shoppingCart;
	
	private List<ProductEvent> subscribedProductEvents;
	
}
