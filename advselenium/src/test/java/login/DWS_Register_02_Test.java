package login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import genericUtility.BaseClass;
import genericUtility.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_Register_02_Test extends BaseClass
{
	@Test
	public void userRegisteration()
	{
		registerpage.getRegisterlink().click();
		logger.log(Status.INFO,"user click on Register link");
		
		registerpage.getmalebutton().click();
		
		//RegisterPage.getGender().click();
		registerpage.getFirstNameTF().sendKeys("Vainika");
		logger.log(Status.INFO,"user sends details to firstName");
		
		registerpage.getLastNameTF().sendKeys("Gopi");
		logger.log(Status.INFO,"user sends details to lastName");
		
		registerpage.getEmailTF().sendKeys("vainika@gmail.com");
		logger.log(Status.INFO,"user sends details to email");
		
		registerpage.getPasswordTF().sendKeys("thanku");
		
		registerpage.getConfirmPwdTF().sendKeys("thanku");
		logger.log(Status.INFO,"user sends details to password");
		
		registerpage.getRegisterbutton().click();
	}
}