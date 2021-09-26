package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Syncronization1 extends Base {

	//@Test(priority=1)
	public void myTest() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/dynamic-properties");
		WebElement e = driver.findElement(By.xpath("//button[@id='visibleAfter']"));
		System.out.println(e.getText());
	}
	
	@Test(priority=1)
	public void myTest2() {
		driver.get("https://demoqa.com/dynamic-properties");
		WebDriverWait wait=new WebDriverWait(driver, 10);
	//	wait.until(ExpectedConditions.titleContains("Hello"));
	//	WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='colorChange']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
	}
	
	public void m3() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}

}
