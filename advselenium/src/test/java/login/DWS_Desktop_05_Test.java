package login;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import genericUtility.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_Desktop_05_Test extends BaseClass
{
	@Test
	
	public void addDesktopToCart()
	{
		WebElement computers=computerpage.getComputerlink();
		Actions action=webDriverUtility.actionsReference();
		action.moveToElement(computers).perform();
		
		computerpage.getDesktoplink().click();
		logger.log(Status.INFO,"user navigate to the desktop module");
		
		computerpage.getProduct1().click();
		computerpage.getComparebutton().click();
		logger.log(Status.INFO,"user added product to compare list");
		driver.navigate().back();
		driver.navigate().back();
		computerpage.getProduct2().click();
		computerpage.getComparebutton().click();
		logger.log(Status.INFO,"user added product to comapare list");
		
		List<WebElement> remove=driver.findElements(By.xpath("//input[@value='Remove']"));
		if(remove.size()==2)
		{
			System.out.println("product is in compare");
		}
		
	}
 }
