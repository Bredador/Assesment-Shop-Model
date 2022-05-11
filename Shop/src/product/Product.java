package product;

import java.net.URL;
import java.util.List;

public abstract class Product {
	
	private String name;
	
	private String articleNumber;
	
	private List<Double> prices;
	
	private List<URL> pictures;
	
	private Category category;
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArticleNumber() {
		return articleNumber;
	}
	public void setArticleNumber(String articleNumber) {
		this.articleNumber = articleNumber;
	}
	public List<Double> getPrices() {
		return prices;
	}
	public void setPrices(List<Double> prices) {
		this.prices = prices;
	}
	public List<URL> getPictures() {
		return pictures;
	}
	public void setPictures(List<URL> pictures) {
		this.pictures = pictures;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}
