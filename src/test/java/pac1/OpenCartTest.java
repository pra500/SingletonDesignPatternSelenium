package pac1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class OpenCartTest {
	
	//naveen: https://www.youtube.com/watch?v=2bi6efhcNLQ 

	@BeforeMethod
	public void beforeMethod() {
		
		
		Base.initialization();
	}

	
	@Test(priority = 0)
	public void verifyTitleTest() {
		
	String title=Base.driver.getTitle();
	Assert.assertEquals(title, "Your Store");
	
	}

	@Test(priority = 1)
	public void verifyLogoTest() {
		
		boolean b=Base.driver.findElement(By.xpath("//img[@title='naveenopencart']")).isDisplayed();
		Assert.assertTrue(b);
		
		
	}

	
	@AfterMethod
	public void afterMethod() {
		
		Base.closebrowser();
	}

}
