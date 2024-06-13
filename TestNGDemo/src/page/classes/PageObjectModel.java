package page.classes;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageObjectModel {
	
	// Search for buses in RedBus site using page object model	
	private WebDriver driver;
	private String baseurl;
	//private JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		
        driver = new ChromeDriver();
        
        ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		//
		
		//js = (JavascriptExecutor)driver;
		
        baseurl = "https://www.redbus.in/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	

	@Test
	public void test() {
		
		driver.get(baseurl);
		
		
		//Actions action = new Actions(driver);

		SearchPage.ClickOnBusTab(driver);
		SearchPage.fillorigin(driver, "Chennai");
		SearchPage.clickfromlist(driver);
		SearchPage.filldestination(driver, "Madurai");
		SearchPage.clicktolist(driver);
		SearchPage.ClickOnCalendar(driver);
		SearchPage.ClickOnDate(driver);
		SearchPage.ClickOnSearchButton(driver);
		System.out.println("Search button is clicked");
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * 
		 * options.addArguments("--disable-notifications");
		 * 
		 * action.doubleClick(SearchPage.SearchButton(driver)).perform();;
		 * 
		 * js.executeScript("arguments[0].click", SearchPage.SearchButton(driver)) ;
		 */
		
		/*
		 * WebElement searchbuses =
		 * driver.findElement(By.xpath("//button[text()='SEARCH BUSES']"));
		 * searchbuses.click();
		 */
		
		
		
	}

	

	@After
	public void tearDown() throws Exception {
		
		Thread.sleep(10000);
		driver.quit();
	}

}
