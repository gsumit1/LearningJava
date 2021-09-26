package Selenium_EvenFiring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class programMain {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Software\\jars\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
         EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);

		EventHandler handler = new EventHandler();
		eventDriver.register(handler);
		eventDriver.get("https://www.google.com/");
		
		
		WebElement element = eventDriver.findElement(By.xpath("(//input[@type='submit'])[4]"));
		element.click();

	}

}

