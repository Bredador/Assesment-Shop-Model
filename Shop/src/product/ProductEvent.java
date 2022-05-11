package product;

import java.util.List;

import user.Customer;
import user.Seller;

public abstract class ProductEvent {
	
	private Product product;

	private List<Seller> subscribedSellers;
	
	private List<Customer> subscribedCustomers;
	
	public abstract void informSubscribedSellers(String stockUpdateInformation);
	
	public abstract void informSubscribedCustomers(String priceUpdateInformation);
	
	
}
