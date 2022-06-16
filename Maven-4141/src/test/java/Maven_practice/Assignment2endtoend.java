package Maven_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Assignment2endtoend extends BaseTest{
	@Test
	public void browser() {
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("prasannakv936@gmail.com");
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("kalavathi");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("(//a[@href='/books'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		WebElement product=driver.findElement(By.xpath("//a[@class='product-name']"));
		if(product.isDisplayed()){
			System.out.println("PASS");
		}
		else{
			System.out.println("FAIL");
		}
			driver.findElement(By.className("ico-logout")).click();
	}
	
}
	


