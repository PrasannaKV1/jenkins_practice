package Maven_practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DatadrivenMavenTest  {
	@Test(dataProvider="Test Data")
	public void LoginTestCase(String Email,String Password) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(Email);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(Password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		if(driver.findElement(By.xpath("//a[@class='ico-logout']")).isDisplayed())
		{
			System.out.println("PASS:testcase is passed");
		}
		driver.close();
	}
	
	@DataProvider(name="Test Data", parallel=true)
	public Object[][] dataP() throws EncryptedDocumentException, IOException
	{

		return DataDrivenTest.test("Login");
		
}

}
