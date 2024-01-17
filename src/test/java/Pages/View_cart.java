package Pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

public class View_cart
{
	WebDriver driver;
	
	public View_cart(WebDriver driver)
	{
		this.driver=driver;
	}

	public void Click_On_View() 
	{
		
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		String parent=driver.getWindowHandle();

    	Set<String>s=driver.getWindowHandles();

    	Iterator<String> I1= s.iterator();

    	while(I1.hasNext())
    	{

    	String child_window=I1.next();


    	if(!parent.equals(child_window))
    	{
    		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
    	/*	driver.switchTo().window(child_window);
    		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div[1]/div[2]/div[5]/a[1]/span")).click();
    		*/
    	}
    	}
		return;
	}
}

