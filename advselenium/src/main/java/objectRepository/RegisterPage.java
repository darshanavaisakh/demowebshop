package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage
{
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="Register")
	private WebElement registerlink;
	
	@FindBy(xpath="//input[@type='radio'and@value='M']")
	private WebElement malebutton;
	
	@FindBy(id="FirstName")
	private WebElement FirstNameTF;
	
	@FindBy(id="LastName")
	private WebElement LastNameTF;
	
	@FindBy(id="Email")
	private WebElement emailTF;
	
	@FindBy(id="Password")
	private WebElement passwordTF;
	
	public WebElement getRegisterlink()
	{
		return registerlink;
	}
	
	public WebElement getmalebutton()
	{
		return malebutton;
	}
	
	public WebElement getFirstNameTF()
	{
		return FirstNameTF;
	}
	
	public WebElement getLastNameTF()
	{
		return LastNameTF;
	}
	
	public WebElement getEmailTF()
	{
		return emailTF;
	}
	
	public WebElement getPasswordTF()
	{
		return passwordTF;
	}
	
	public WebElement getConfirmPwdTF()
	{
		return confirmPwdTF;
	}
	
	public WebElement getRegisterbutton()
	{
		return registerbutton;
	}
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPwdTF;
	
	@FindBy(id="register-button")
	private WebElement registerbutton;
}
	
	
	

