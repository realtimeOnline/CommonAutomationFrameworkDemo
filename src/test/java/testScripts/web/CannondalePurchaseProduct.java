package testScripts.web;

import org.json.simple.JSONObject;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import commonFunctionLibrary.WebFunctionLibrary;
import helperClasses.WebAllureListener;
import pageObjects.web.BikeSearchResults;
import pageObjects.web.Checkout;
import pageObjects.web.HomePage;
import pageObjects.web.LoginPage;
import pageObjects.web.PDPPage;

@Listeners({ WebAllureListener.class })
public class CannondalePurchaseProduct extends WebFunctionLibrary {

	public HomePage homePageObjects = PageFactory.initElements(getDriver(), HomePage.class);
	public LoginPage loginPageObjects = PageFactory.initElements(getDriver(), LoginPage.class);
	public Checkout checkoutPageObjects = PageFactory.initElements(getDriver(), Checkout.class);
	public PDPPage pDPageObjects = PageFactory.initElements(getDriver(), PDPPage.class);
	public BikeSearchResults bikeSearchResults = PageFactory.initElements(getDriver(), BikeSearchResults.class);
	public JSONObject jsonDataObj;

	@BeforeClass
	public void setup() throws Exception {

		initialize_driver();
		launchApplication();	
	}

	@Test	
	public void test1234() throws Exception{
		jsonDataObj= getTestData("testdata", "OrderDetails", 0);
		clickAction(homePageObjects.buttonconfirm);
		hover(homePageObjects.linkElectricBikes);
		clickAction(homePageObjects.linkAdventureNeo);		

	}

	@AfterClass
	public void closeBrowser() throws Exception {

		getDriver().quit();
	}

}
