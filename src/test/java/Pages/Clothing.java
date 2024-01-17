package Pages;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Clothing 
{
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div[3]/div/div/div[3]/ul/li[1]/div/div[1]/a/img")
	WebElement e1;
	
	public Clothing(WebDriver driver)
	{
		this.driver=driver;
		
		//This initElements method will create all WebElements

        PageFactory.initElements(driver, this);
	}

	public void Click_On_Firstprod() 
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		e1.click();
		
		/*String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Boyfriend T-Shirt with Chest Logo";
		Assert.assertEquals(ExpectedTitle, ActualTitle);*/
		return;
	}
}

