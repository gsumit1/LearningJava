package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class gaana {

    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

    	System.setProperty("webdriver.chrome.driver", "C:\\Software\\jars\\Chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.get("https://a1.gaana.com/song/radhe-title-track");
        int i=0;
        Thread.sleep(10000);
        while(i<10) {
        try {
        driver.findElement(By.xpath("(//button[@id='playBtn1'])[1]")).click();
        break;
        }
        catch(Exception e) {
        	Thread.sleep(3000);
        	i++;
        }
        }
        System.out.println("jkwjegkg");
      
        /* driver.quit(); */
        System.out.println(driver.findElement(By.id("bottomplayer")).getText());
    }
}
