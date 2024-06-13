package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	
	public static WebElement element = null;
	
	
	
	// Navigate to bus tab
	
	public static void ClickOnBusTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//li[@id='bus_tickets_vertical']"));
		element.click();
		
	}

	
	// Return the origin text box element
	
	public static WebElement origintextbox(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='src']"));
		return element;
		
	}
	
	public static void fillorigin(WebDriver driver, String origin ){
		element = origintextbox(driver);
		element.sendKeys(origin);
		
	}
	
	public static WebElement fromlist(WebDriver driver) {
		element = driver.findElement(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']//text"));
		return element;
		
	}

	public static void clickfromlist(WebDriver driver){
		element = fromlist(driver);
		element.click();
	
	}
	// destination text box
	public static WebElement destinationtextbox(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='dest']"));
		return element;
		
	}
	
	public static void filldestination(WebDriver driver, String destination){
		element = destinationtextbox(driver);
		element.sendKeys(destination);	
	}
	
	
	public static WebElement tolist(WebDriver driver) {
		element = driver.findElement(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']//text"));
		return element;
		
	}

	public static void clicktolist(WebDriver driver){
		element = tolist(driver);
		element.click();
	
	}
	// calendar 
	public static void ClickOnCalendar(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='onwardCal']"));
        element.click();
		
	}
	
	// date to select
	
	public static WebElement datetoselect(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='DatePicker__MainBlock-sc-1kf43k8-1 hHKFiR']//span[text()='28']"));
		return element;
		
	}
	
	public static void ClickOnDate(WebDriver driver) {
		
		element = datetoselect(driver);
		element.click();
	}
	
	
	
	// search button
	public static WebElement SearchButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[text()='SEARCH BUSES']"));
		return element;
		
	}
	
	//click on search button
	public static void ClickOnSearchButton(WebDriver driver) {
		element = SearchButton(driver);
		element.click();
	}
}
	
	
	
	
	


