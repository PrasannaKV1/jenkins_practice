package Maven_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice5Test {
@Test
public void disp() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://itera-qa.azurewebsites.net/home/automation");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
	Thread.sleep(2000);
	
	
}
}
