package login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import genericUtility.BaseClass;
import genericUtility.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_Login_01_Test extends BaseClass
{
	 @Test
  public void Login_to_application_with_valid_credentials()
  {
	  loginpage.getLoginLink().click();
	  logger.log(Status.INFO,"user clicked on login link");
	  loginpage.getEmailTF().sendKeys(property.readingDataFromPropertyFile("username"));
	  logger.log(Status.INFO,"user entered email address");
	  loginpage.getPasswordTF().sendKeys(property.readingDataFromPropertyFile("pwd"));
	  logger.log(Status.INFO,"user entered password");
	  loginpage.getLoginButton().click();
  }
}
