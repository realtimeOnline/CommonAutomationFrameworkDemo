package pageObjects.web;

import org.openqa.selenium.By;

public class Checkout {
	
	public By inputFirstName = By.xpath("//input[@id='FirstName_Contact']");
	public By inputLastName = By.xpath("//input[@id='LastName_Contact']");
	public By inputPhone = By.xpath("//input[@id='Phone_Contact']");
	public By inputZipCode = By.xpath("//input[@id='Zip_Contact']");
	public By buttonContinueToShipping = By.xpath("//a[text()='Continue to Shipping']");
	public By pickupBikeShop1 = By.xpath("(//div[@class='bike-configuration__retailers-list__item-details'])[1]");
	public By pickupBikeShop1Selected = By.xpath("//li[@class='bike-configuration__retailers-list__item checkout__retailers-list__item checkout-selected']");
	public By buttonContinueToPayment = By.xpath("//a[@id='shippingSubmit']");
	public By formPaymentPage = By.xpath("//form[@id='CheckoutPayment']");	
	
}
