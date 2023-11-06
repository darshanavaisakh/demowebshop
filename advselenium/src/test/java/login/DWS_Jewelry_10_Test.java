package login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import genericUtility.BaseClass;
import genericUtility.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)
public class DWS_Jewelry_10_Test extends BaseClass
{
   @Test
   public void AddProductToWishlistandRemov()
   {
	   jewelrypage.getJewelrylink().click();
		 logger.log(Status.INFO,"user clicked the jewelry link");
		 jewelrypage.getJewelryitem().click();
		 logger.log(Status.INFO,"user clicked the jewelry product");
		 jewelrypage.getAddwishlistbutton().click();
		 logger.log(Status.INFO,"user clicked the Add wishlist");
		 jewelrypage.getwishlistlink().click();
		 logger.log(Status.INFO,"user clicked the wishlist link");
		 jewelrypage.getRemovecheck().click();
		 jewelrypage.getUpdateTheWishList().click();
		 logger.log(Status.INFO,"user remove the product from wishlist");
		 
		 if(jewelrypage.getMessage().isDisplayed())
		 {
			 System.out.println("Product is removed from the wishlist");
			 
		 }
   }
}
