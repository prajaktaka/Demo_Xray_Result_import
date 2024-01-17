package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.*;

import Pages.Clothing;
import Pages.Fashion;
import Pages.Home_page;
import Pages.Quantity;
import Pages.Twitter;
import Pages.View_cart;

public class Main
{
	static WebDriver browser;
		WebDriver driver;
		
		@FindBy(xpath="//*[@id=\"input-quantity\"]")
		WebElement e1;
		
		@FindBy(xpath="//*[@id=\"button-cart\"]")
		WebElement e2;
		
		Home_page homePage;
		Fashion fash;
		Clothing clothing;
		Twitter twitter;
		Quantity quantity;
		View_cart view;
		
		@BeforeTest
		public void TestSetUp() throws InterruptedException
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			
			
			
			driver.get("https://www.amazon.com/");	
			driver.manage().window().maximize();
		
		}
		
		@Test
	    public void Testng() throws InterruptedException 
	    {	
			driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("Laptop");
			driver.findElement(By.id("nav-search-submit-button")).click();
			driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		}
		
	/*	@Test
		public void Test2() throws InterruptedException 
		{
			e1.clear();
			e1.sendKeys("2");
			e2.click();
			
		}*/
		
}