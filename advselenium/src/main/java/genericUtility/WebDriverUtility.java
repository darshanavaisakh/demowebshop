package genericUtility;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility
{
	    WebDriver driver; 
	    JavascriptExecutor js;
		public WebDriverUtility(WebDriver driver)
		{
			this.driver=driver;
			js=(JavascriptExecutor)driver;
			
		}
		/**
		 * This method is used to clicking on elements using Javascript Executor
		 * @param WebElement
		 * @param void
		 */
		public void clickingonElementJS(WebElement element)
		{
			js.executeScript("arguments[0].click();",element);
			
		}
		/**
		 * This method is used to enter the data using javascript executor
		 * @param element
		 * @param data
		 */
		public void enteringDataIntoElement(WebElement element,String data)
		{
			js.executeScript("arguments[0].value='"+data+"'",element);
		}
		/**
		 * This method returns the reference for webdriverwait to achieve explicit
		 * @param time to wait
		 * @return
		 */
		public WebDriverWait explicitWaitReference(int time)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
			return wait;
		}
	     /**
	      * This method return the actions class reference
	      * @return
	      */
		public Actions actionsReference()
		{
			Actions action=new Actions(driver);
			return action;
		}
		public void handlingDropdown(WebElement element,String value)
		{
			Select select=new Select(element);
			try {
				select.selectByVisibleText(value);
			}catch(Exception e)
             {
				try {
					
				select.selectByValue(value);
             }catch(Exception e1)
			  {
                int val=Integer.parseInt(value);
                select.selectByIndex(val);
			   }
             }
			
		    }
		public void scrollToAction(int x,int y)
		{
			js.executeScript("window.scrollTo("+x+","+y+")");
	    }
		/**
		 * This method is used to perform scrollby action
		 * @param x
		 * @param y
		 */
		public void scrollByAction(int x,int y)
		{
			js.executeScript("window.scrollBy("+x+","+y+")");
			
		}
		/**
		 * This method is used to scroll to the element to increase the element visibility
		 * If the status is true then window will scroll until the element reaches the top of the webpage
		 * If the status is false then the window will scroll until the element reaches bottom of the page
		 * @param element
		 * @param status 
		 */
		public void scrollIntoviewAction(WebElement element,Boolean status)
		{
			js.executeScript("argument[0].scrollIntoView("+status+")",element);
		}
		public void switchingToFrame(int index)
		{
			driver.switchTo().frame(index);
		}
		public void switchingToFrame(String name)
		{
			driver.switchTo().frame(name);
		}
		/**
		 * 
		 * @param element
		 */
		public void switchingToFrame(WebElement element)
		{
			driver.switchTo().frame(element);
		}
		/**
		 * This method is used to switch the driver control from frame to window
		 */
		public void switchingBackToWindow()
		{
			driver.switchTo().defaultContent();
		}
		/**
		 * This method is returning the alert reference
		 * @return
		 */
		public Alert returnAlertRefrenece()
		{
			return driver.switchTo().alert();
		}
		/**
		 * This method is used to switch the driver control from one window to another
		 * @param allWindowId
		 * @param expectedTitle
		 * @param parentId
		 */
		public void switchingToWindow(Set<String> allWindowId,String expectedTitle,String parentId)
		{
			allWindowId.remove(parentId);
			for(String id:allWindowId)
			{
				driver.switchTo().window(id);
				if(expectedTitle.equalsIgnoreCase(driver.getTitle())) {
					break;
				}
			}
		}
		/**
		 * This method is used to switch the control back to parent window
		 * @param parentId
		 */
		public void switchingBackToMainWindow(String parentId)
		{
			driver.switchTo().window(parentId);
		}

}
