package login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import genericUtility.BaseClass;
import genericUtility.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_Cart_03_Test extends BaseClass
{
	@Test
	public void addProductToCart() throws InterruptedException
	{
		cartpage.getAddtocartbutton().click();
		logger.log(Status.INFO,"user able to add the product to cart");
		 
		cartpage.getShoppingcartlink().click();
		Thread.sleep(3000);
		logger.log(Status.INFO,"user able to add the product to cart");
		
		if(cartpage.getcheckoutbutton().isDisplayed())
		{
			System.out.println("product is added to cart");
		}
		
	}
	

}
