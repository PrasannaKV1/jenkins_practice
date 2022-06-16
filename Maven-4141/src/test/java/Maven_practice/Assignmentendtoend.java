package Maven_practice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Assignmentendtoend extends BaseTest {
	@Test
	public void Browser1()
	{
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("prasannakv936@gmail.com");
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("kalavathi");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}

}
