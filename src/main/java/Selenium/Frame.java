package Selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Frame extends Base{
	@Test(priority = 2, alwaysRun = true)
	public void Link() {
		driver.get("https://demoqa.com/nestedframes");
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		System.out.println(driver.findElement(By.tagName("body")).getText());
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		System.out.println(driver.findElement(By.tagName("body")).getText());
		driver.switchTo().defaultContent();
	}


}
