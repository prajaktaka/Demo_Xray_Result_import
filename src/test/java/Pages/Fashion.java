package Pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Fashion 
{
	
	WebDriver driver;
	
	@FindBy(linkText="Fashion")
	WebElement fash;	
	
	@FindBy(xpath="//*[@id=\"sidebar-first\"]/div/div/div[1]/div/ul/li[1]/ul/li[1]/a/span")
	WebElement e2;
	
	public Fashion(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	public void Click_On_Fashion() 
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Actions actionProvider = new Actions(driver);
	    actionProvider.moveToElement(fash).build().perform();
	    e2.click();
	}
}
