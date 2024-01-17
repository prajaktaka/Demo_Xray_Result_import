package Pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Home_page 
{
	
	WebDriver driver;
	@FindBy(linkText="iPhone")
	WebElement e3;
		
	public Home_page(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	public void Click_On_Fashion() 
	{
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		e3.click();
		
		return;
	}
}
