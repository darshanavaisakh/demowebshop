package login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import genericUtility.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_Book_04_Test extends BaseClass  
{
	@Test
	public void addBookToCart()
	{
		bookpage.getBookslink().click();
		logger.log(Status.INFO,"user navigate to books link");
		 
		bookpage.getAddtocartinbooks().click();
		logger.log(Status.INFO,"user add book to cart");
		
		bookpage.getShoppingcartlink().click();
		
		if(cartpage.getcheckoutbutton().isDisplayed())
		{
			System.out.println("Book is added to the cart");
		}
		
	}
	
	

}
