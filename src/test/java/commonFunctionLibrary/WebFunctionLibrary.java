package commonFunctionLibrary;

import java.io.FileReader;
import java.time.Duration;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebFunctionLibrary{

	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();
	public String browserName;
	public String url;
	public String testEnv;
	

	public WebDriver initialize_driver(){
		browserName=System.getProperty("BrowserName");
		url=System.getProperty("Url");
		testEnv=System.getProperty("TestEnv");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		tdriver.set(driver);
		return getDriver();
	}
	public static synchronized WebDriver getDriver(){
		return tdriver.get();
	}


	public void launchApplication() {
		getDriver().get(url);	
	}


	public void clickAction(By objectProperty) {

		getDriver().findElement(objectProperty).click();
	}

	public WebElement getElement(By objectProperty) {

		return getDriver().findElement(objectProperty);
	}


	public void hover(By objectProperty) throws Exception {

		WebElement element =getDriver().findElement(objectProperty);
		Actions action = new Actions(getDriver());
		action.moveToElement(element).perform();

	}
	
	public JSONObject getTestData(String jsonFileName, String recordName, int dataArrayNumber ) throws Exception {
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader(getCurrentWorkingDir()+"\\src\\test\\resources\\testData\\"+jsonFileName+"_"+testEnv+".json");


		Object obj = jsonParser.parse(reader);
		JSONObject userloginJsonobj=(JSONObject)obj;
		JSONArray userloginArray = (JSONArray)userloginJsonobj.get(recordName);
		JSONObject users= (JSONObject)userloginArray.get(dataArrayNumber);
		return users;
	}

	public String getCurrentWorkingDir() {
		return System.getProperty("user.dir");
	}


}
