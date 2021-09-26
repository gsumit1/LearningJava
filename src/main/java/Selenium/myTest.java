package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class myTest {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		// pass the debuggerAddress and pass the port along with host. Since I am
		// running test on local so using localhost
		System.setProperty("webdriver.chrome.verboseLogging", "true");
		opt.addArguments("--headless");
		opt.setExperimentalOption("debuggerAddress", "0.0.0.0:9222");
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\jars\\Chromedriver.exe");

		// pass ChromeOptions object to ChromeDriver constructor
		WebDriver driver = new ChromeDriver(opt);
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		driver.switchTo().alert().sendKeys("Hello");
		driver.switchTo().alert().accept();

	}

}
