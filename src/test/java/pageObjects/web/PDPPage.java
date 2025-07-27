package pageObjects.web;

import org.openqa.selenium.By;

public class PDPPage {
	
	public By producsize1 = By.xpath("(//div[@class='bike-configuration__size-list']//li/span)[1]");
	public By buttonAddToCartDisabled = By.xpath("//a[@id='AddToCartButton' and @class='button inverted add-to-cart-button bike-configuration__add-to-cart disabled']");
	public By buttonAddToCart = By.xpath("//a[@id='AddToCartButton' and @class='button inverted add-to-cart-button bike-configuration__add-to-cart']");
	public By buttonCheckout = By.xpath("//a[@id='mcCheckoutLink' and text()='Proceed to Checkout']");
	
			
			

			


}
