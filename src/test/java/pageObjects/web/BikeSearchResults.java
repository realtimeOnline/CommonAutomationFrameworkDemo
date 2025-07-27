package pageObjects.web;

import org.openqa.selenium.By;

public class BikeSearchResults {
	
	public By CheckBoxInStockOnlineQA = By.xpath("//div[@class='filter-and-sort__filters-and-products']//li[@data-filterval='In Stock Online QA']");
	public By linkFirstProduct = By.xpath("(//div[@class='filter-and-sort__products-group__products']//img[@class='product-card__image product-card__main-image'])[1]");


}
