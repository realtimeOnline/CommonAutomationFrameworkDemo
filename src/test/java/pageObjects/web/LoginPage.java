package pageObjects.web;

import org.openqa.selenium.By;

public class LoginPage {
	
	public By inputGuestCheckoutEmail = By.xpath("//input[@id='GuestCheckoutViewModel_Email']");
	public By buttonCheckoutAsGuest = By.xpath("//button[text()='Checkout as guest']");
	
	
}
