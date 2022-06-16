package Maven_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice4Test {
	@Test
	public void sel()
	{
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.close();
	}

}
