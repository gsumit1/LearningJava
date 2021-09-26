 package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities1 extends Base {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\jars\\Chromedriver.exe");
		
	      ChromeOptions options = new ChromeOptions();
	      options.addArguments("start-maximized");
	      options.addArguments("--incognito");
	      //DesiredCapabilities capabilities = new DesiredCapabilities();
	      //capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	      //options.merge(capabilities);
	      ChromeDriver driver = new ChromeDriver(options);
	      driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	      System.out.println(driver.getTitle());
	      //driver.manage().window().maximize();
	      //driver.quit();
	}

}
