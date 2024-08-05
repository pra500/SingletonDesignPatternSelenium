package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Base {
	
	
	public static WebDriver driver=null;	
	
	 
	
	public static void initialization()
	{
		
	if(driver==null)
	{
		if(Constants.browsername.equalsIgnoreCase("chrome"))
		{
			 driver=new ChromeDriver();	
		}
		else if(Constants.browsername.equalsIgnoreCase("firefox"))
		{
			 driver=new FirefoxDriver();
		}
		else if(Constants.browsername.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
			
	}		
	
	
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");

}	
	
	
	public static void quitbrowser()
	{
		
		System.out.println("quitting the browser");
		driver.quit();
		driver=null;
		
		
	}
	
	public static void  closebrowser()
	{
		System.out.println("closing the browser");
		driver.close();
		driver=null;
		
		
	}
	
}