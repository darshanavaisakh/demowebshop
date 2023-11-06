package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage 
{
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='14.1-inch Laptop']/../..//input")
	private WebElement Addtocartbutton;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoppingcartlink;
	
	@FindBy(id="checkout")
	private WebElement checkoutbutton;
	
	public WebElement getAddtocartbutton()
	{
		return Addtocartbutton;
	}

	public WebElement getShoppingcartlink()
	{
		return shoppingcartlink;
	}
	
	public WebElement getcheckoutbutton()
	{
	 return checkoutbutton;
	}
}
	
	
