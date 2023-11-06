package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.BookPage;
import objectRepository.CartPage;
import objectRepository.ComputersPage;
import objectRepository.JewelryPage;
import objectRepository.LoginPage;
import objectRepository.RegisterPage;

public class BaseClass implements IAutoConstants
{
	public static WebDriver driver;
	public static PropertyUtility property;
	public static TakeScreenshotutility screenshot;
	public static WebDriverUtility webDriverUtility;
	DatabaseUtility dbUtility;
	JavaUtility javaUtility;
	public static LoginPage loginpage;
	public static CartPage cartpage;
	public static BookPage bookpage;
	public static RegisterPage registerpage;
	public static JewelryPage jewelrypage;
	public static ComputersPage computerpage;
	public static ExtentTest logger;
	
	@BeforeClass(alwaysRun=true)
	/**
	 * This method is used to launch the browser,it is the precondition
	 * for @Test and navigate to the application and initialise utility variables
	 */
	public void launchingBroswerAndNavigateToApp()
	{
		property=new PropertyUtility();
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		driver = new ChromeDriver(options);
		}else
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(property.readingDataFromPropertyFile("url"));
	    webDriverUtility = new WebDriverUtility(driver);
		dbUtility = new DatabaseUtility();
	    javaUtility = new JavaUtility();
		
		
	}
	@BeforeMethod(alwaysRun=true)
	/**
	 * This method is used to log in to the application.
	 * it is the precondition to the @Test 
	 */
	public void loginToApplication()
	{
		loginpage=new LoginPage(driver);
		cartpage=new CartPage(driver);
		bookpage=new BookPage(driver);
		registerpage=new RegisterPage(driver);
		jewelrypage=new JewelryPage(driver);
		computerpage=new ComputersPage(driver);
		screenshot=new TakeScreenshotutility(driver);
		System.out.println("logged in to application");
	}
	
	@AfterMethod(alwaysRun=true)
	/**
	 * This method is used to log out from application.
	 * it is the post condition to the @Test
	 */
	public void logoutFromApplication()
	{
		System.out.println("log out from application");
	}
	
	@AfterClass(alwaysRun=true)
	/**
	 * This method is used to close the browser
	 * it is the post condition to the @Test 
	 */
	public void teardownTheBrowser()
	{
		driver.quit();;
	}
}