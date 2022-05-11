package user;

import product.DigitalProduct;
import product.NormalProduct;
import product.Product;

public abstract class Seller extends User{
	
	private abstract DigitalProduct createProduct(DigitalProduct product);
	private abstract NormalProduct createProduct(NormalProduct product);
}
