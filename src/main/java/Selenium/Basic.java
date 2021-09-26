package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Basic extends Base{

	// @Test(priority = 1)
	public void checkbox() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.className("rct-checkbox"));
		e.click();
		driver.navigate().to("https://demoqa.com/links");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	// @Test(priority = 2, alwaysRun = false)
	public void Link() {
		driver.get("https://demoqa.com/links");
		WebElement e = driver.findElement(By.linkText("Home"));
		e.click();
	}

	// @Test(priority = 3)
	public void PartialLink() {
		driver.get("https://demoqa.com/links");
		WebElement e = driver.findElement(By.partialLinkText("Bad"));
		e.click();
	}

	// @Test(priority = 4)
	public void click() {
		driver.get("https://demoqa.com/buttons");
		WebElement e = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		Actions a = new Actions(driver);
		a.doubleClick(e);
		a.build().perform();
	}

	// @Test(priority = 5)
	public void rightClick() {
		driver.get("https://demoqa.com/buttons");
		WebElement e = driver.findElement(By.id("rightClickBtn"));
		Actions a = new Actions(driver);
		a.contextClick(e).build().perform();
		
	}

	//@Test(priority = 6)
	public void dragDrop() {
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		WebElement dropdown = driver.findElement(By.name("country"));
		
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
		
		
		
		Select s1=new Select(dropdown);
		s1.selectByIndex(2);
		
		
		
		Select s = new Select(dropdown);
		s.selectByVisibleText("ALGERIA");

	}

	@Test(priority=7)
	public static void tooTip() {
		driver.get("https://demoqa.com/tool-tips");
		WebElement e=driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(e).build().perform();
		
		System.out.println(e.getText());
		
		

	}

}
