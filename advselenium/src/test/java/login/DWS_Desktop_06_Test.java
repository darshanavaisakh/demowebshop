package login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import genericUtility.BaseClass;
import genericUtility.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)
public class DWS_Desktop_06_Test extends BaseClass
{
  @Test
  public void  addProductToCompareandRemove()
  {
	 WebElement computers=computerpage.getComputerlink();
	 Actions action=webDriverUtility.actionsReference();
	 action.moveToElement(computers).perform();
	 computerpage.getDesktoplink().click();
	 logger.log(Status.INFO,"user naviagate to desktop module");
	 computerpage.getProduct1().click();
	 computerpage.getComparebutton().click();
	 logger.log(Status.INFO,"user added product to compare list");
	 driver.navigate().back();
	 driver.navigate().back();
	 computerpage.getProduct2().click();
	 computerpage.getComparebutton().click();
	 logger.log(Status.INFO,"user added product to comapare list");
	 computerpage.getRemovebutton().click();
	 logger.log(Status.INFO,"user removed product from compare list");
	 computerpage.getRemovebutton().click();
	 logger.log(Status.INFO,"user removed product from compare list");
		
  }

}
