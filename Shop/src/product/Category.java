package product;

import java.util.List;

public abstract class Category {

	private String name;
	//One to many
	//Mapped by category_id in Product
	private List<Product> products;
	private List<Category> childCategories;
}
