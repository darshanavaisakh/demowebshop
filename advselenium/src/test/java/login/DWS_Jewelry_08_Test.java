package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import genericUtility.BaseClass;
import genericUtility.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)
public class DWS_Jewelry_08_Test extends BaseClass
{
	
	@Test
	public void emailaFriendandCheckErrorMessage()
	{
	  jewelrypage.getJewelrylink().click();
	  logger.log(Status.INFO,"user clicked the jewelry link");
	  jewelrypage.getJewelryitem().click();
	  logger.log(Status.INFO,"user clicked the jewelry product");
	  jewelrypage.getEmailafriend().click();
	  logger.log(Status.INFO,"user clicked the Email a friend button");
	  jewelrypage.getFriendmail().sendKeys("asdfghjkl@gmail.com");
	  logger.log(Status.INFO,"user entered the data into friend email textfield");
	  jewelrypage.getMymail().sendKeys("darshana.therur@gmail.com");
	  logger.log(Status.INFO,"user entered the data into your email textfield");
	  jewelrypage.getSendemailbutton().click();
	  logger.log(Status.INFO,"user clicked the send mail button");
	  
	  String expectedmsg="only registered customers can use email a friend feature";
	  WebElement errormsg=driver.findElement(By.xpath("//div[@class='validation-summary-errors']/..//li"));
	  if(errormsg.getText().equals(expectedmsg))
	  {
		  System.out.println("Testcase is passed and error message is displayed");
	  }
	}
}
