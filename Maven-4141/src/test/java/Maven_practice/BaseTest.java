package Maven_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	WebDriver driver;
	//@Test
	@BeforeClass
	public void openBrowser(){
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	}
  @AfterClass
  public void closeBrowser()
  {
	  driver.close();
  }
  
}
