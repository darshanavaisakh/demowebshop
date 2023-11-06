package login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import genericUtility.BaseClass;
import genericUtility.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)
public class DWS_jewelry_09_Test extends BaseClass
{
	@Test
	public void addProductToWishlistandCheck()
	{
		 jewelrypage.getJewelrylink().click();
		 logger.log(Status.INFO,"user clicked the jewelry link");
		 jewelrypage.getJewelryitem().click();
		 logger.log(Status.INFO,"user clicked the jewelry product");
		 jewelrypage.getAddwishlistbutton().click();
		 logger.log(Status.INFO,"user clicked the Add wishlist");
		 jewelrypage.getwishlistlink().click();
		 logger.log(Status.INFO,"user clicked the wishlist link");
		 
		 if(jewelrypage.getJewelryitem().isDisplayed())
		 {
			 System.out.println("product is added to wishlist");
		 }
	}
}
