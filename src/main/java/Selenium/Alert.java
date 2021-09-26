package Selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Alert extends Base {
	@Test(priority = 2, alwaysRun = true)
	public void Link() {
		//driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		driver.switchTo().alert().sendKeys("Hello");
		driver.switchTo().alert().accept();

	}

}
