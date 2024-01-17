package Pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Twitter 
{
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div[3]/div[2]/div[3]/div[2]/div/span[2]")
	WebElement e7;
	
	public Twitter(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	public void Click_On_Twit() 
	{
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		e7.click();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		String parent=driver.getWindowHandle();

    	Set<String>s=driver.getWindowHandles();

    	Iterator<String> I1= s.iterator();

    	while(I1.hasNext())
    	{

    	String child_window=I1.next();


    	if(!parent.equals(child_window))
    	{
    		driver.switchTo().window(child_window);
    		
    		driver.close();
    		
    	}
    	driver.switchTo().window(parent);
    	}
		return;
	}
	
}



