package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage 
{
	public BookPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='/books']")
	private WebElement bookslink;
	 
	@FindBy(xpath="//a[text()='Fiction']/../..//input")
	private WebElement addtocartinbooks;
	
	@FindBy(xpath="//a[text()='Shopping cart']")
	private WebElement shoppingcartlink;
	
	public WebElement getBookslink()
	{
		return bookslink;
	}
	
	public WebElement getAddtocartinbooks()
	{
		return addtocartinbooks;
	}
	
	public WebElement getShoppingcartlink()
	{
		return shoppingcartlink;
	}
	
	public WebElement getCheckbutton()
	{
		return checkbutton;
	}
	
	@FindBy(id="checkout")
	public WebElement checkbutton;
}
