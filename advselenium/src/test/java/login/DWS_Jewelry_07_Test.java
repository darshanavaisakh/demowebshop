package login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import genericUtility.BaseClass;
import genericUtility.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_Jewelry_07_Test extends BaseClass 
{
 @Test
 public void filterTheProductandCheck()
 {
	jewelrypage.getJewelrylink().click();
	logger.log(Status.INFO,"user naviagate to jewelry module");
	jewelrypage.getFilteroption().click();
	logger.log(Status.INFO,"user clicked filter options "); 
	List<WebElement> price=driver.findElements(By.xpath("//span[@class='price actual-price']"));
	for(WebElement p:price)
	{
		String pr=p.getText().substring(0,2);
		if(Integer.parseInt(pr)<=500)
		{
			System.out.println("Testcase will be passed");
		}
	}
	logger.log(Status.INFO,"user checked the products displayed are according to filter option");
 }

}
