package Maven_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice1Test {
	@Test
	public void selection() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		Thread.sleep(2000);
		WebElement elf=driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Thread.sleep(2000);
		elf.sendKeys(Keys.ENTER);
		elf.sendKeys(Keys.ARROW_DOWN);
		elf.sendKeys(Keys.ENTER);
		
		
		
		
	}

}
