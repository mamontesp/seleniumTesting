/**
 * 
 */
package ebayTesting;

import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;


/**
 * @author andreamontes
 *
 */
public class TestCustomEbay {
	
	//protected String driverPath = "/media/andreamontes/DATA/Personal/AplicacionBelatrix/drivers/geckodriver";
	//protected String driverPath = "./drivers/geckodriver";
	protected WebDriver driver;
	String URL = "http://google.in";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void startBrowser() throws Exception {
		//System.setProperty("webdriver.gecko.driver", driverPath);
		//FirefoxOptions capabilities = new FirefoxOptions();
		//capabilities.setCapability("marionette", true);
		driver = new FirefoxDriver();
    	driver.get("http://google.in");
	}
	
	@Test
	public void navigateToUrl() {
		 driver.get("http://google.in");
		 String expectedTitle = "Google";
		 String actualTitle = driver.getTitle();
		 System.out.println("Before assertion " + expectedTitle + actualTitle);
		 assertEquals(expectedTitle, actualTitle);
		 System.out.println ("Title matched");
	}
	
	@After
	public void endTest() throws Exception {
		driver.quit();
	}
}
