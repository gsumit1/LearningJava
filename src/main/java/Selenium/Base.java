package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Base {

	public static WebDriver driver;

	@BeforeSuite
	public void setUp() {
		
		ChromeOptions opt=new ChromeOptions();
		 
		// pass the debuggerAddress and pass the port along with host. Since I am running test on local so using localhost
		opt.setExperimentalOption("debuggerAddress","localhost:18002");
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\jars\\Chromedriver.exe");
		
		// pass ChromeOptions object to ChromeDriver constructor
		driver=new ChromeDriver(opt);
		 
		//driver = new ChromeDriver();

	}

	@AfterSuite
	private void tearDown() {
		// driver.quit();
	}

	// @Test
	public void myTest() throws Exception {
		driver.get("https://jira.xpand-it.com/login.jsp");
		List<WebElement> els = driver.findElements(By.xpath("//body//*[not(self::script) and not(self::style)]"));
		Map<String, byte[]> elementImages = new HashMap();
		Map<String, WebElement> elements = new HashMap();
		String elId;
		for (WebElement el : els) {
			elId = ((RemoteWebElement) el).getId();
			System.out.println(elId);
			elements.put(elId, el);
			try {
				elementImages.put(elId, el.getScreenshotAs(OutputType.BYTES));

				File outputFile = new File(elId + ".jpg");
				try (FileOutputStream outputStream = new FileOutputStream(outputFile)) {
					outputStream.write(elementImages.get(elId));
				}

			} catch (Exception ign) {
			}
		}
		if (elementImages.size() < 1) {
			throw new Exception("Didn't find any leaf node elements with valid screenshots");
		}

	}

	//@Test
	public void myTest1() throws Exception {

		File fi = new File("C:\\workspace\\RestAssured\\proxy\\MyImage\\407.jpg");
		byte[] fileContent = Files.readAllBytes(fi.toPath());

		System.out.println(fileContent.length);

		FileInputStream img_period = new FileInputStream("C:\\workspace\\RestAssured\\proxy\\MyImage\\Period.jpg");
		byte[] im = IOUtils.toByteArray(img_period);
		System.out.println(img_period.available());
		System.out.println(im);
		driver.get("https://flightdeck-ui-test2.kubeodc-test.corp.intranet/#/dashboard");
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("U1155979");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Jiajuri@123");
		driver.findElement(By.xpath("//span[contains(.,'Login')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(.,'Basic Menu')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(.,'Advanced Search')]")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("(//body//*[not(self::script) and not(self::style) and not(self::option) and not(self::li)])[347]")).click();
							//.findElements(By.xpath("//span")).get(2).findElement(By.xpath("//*")).click();
		
		
		
		/*
		List<WebElement> els = driver
				.findElements(By.xpath("//body//*[not(self::script) and not(self::style) and not(self::option)]"));
		System.out.println(els.size());
		Map<String, byte[]> elementImages = new HashMap();
		Map<String, WebElement> elements = new HashMap();
		String elId;
		int i = 1;
		for (WebElement el : els) {
			System.out.println(i);
			elId = ((RemoteWebElement) el).getId();
			System.out.println(elId);
			elements.put(elId, el);
			try {

				byte[] fileContent1 = el.getScreenshotAs(OutputType.BYTES);

				elementImages.put(elId, el.getScreenshotAs(OutputType.BYTES));

				System.out.println(fileContent.length);
				System.out.println(fileContent1.length);

				if (fileContent.length == fileContent1.length) {
					System.out.println("pass");
					Select sl = new Select(el.findElements(By.xpath("//span")).get(2).findElement(By.xpath("//*")));
					sl.deselectByIndex(2);
					break;
				}

				File outputFile = new File(i + "___" + elId + ".jpg");
				try (FileOutputStream outputStream = new FileOutputStream(outputFile)) {
					outputStream.write(elementImages.get(elId));

					i++;
				}

			} catch (Exception ign) {
				System.out.println("catch");
				i++;
			}
		}

		if (elementImages.size() < 1) {
			throw new Exception("Didn't find any leaf node elements with valid screenshots");
		}*/

	}

	// @Test
	public void chain() {
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement e = driver.findElement(By.id("customers")).findElement(By.xpath("tbody"))
				.findElements(By.xpath("tr")).get(2).findElements(By.xpath("td")).get(1);
		System.out.println(e.getText());
	}

}
