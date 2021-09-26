package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class windows extends Base {

	@Test(priority = 2, alwaysRun = true)
	public void Link() {
		driver.get("https://demoqa.com/browser-windows");
		String s = driver.getWindowHandle();
		WebElement e = driver.findElement(By.xpath("//button[@id='windowButton']"));
		e.click();
		
		
		Set<String> handles1=driver.getWindowHandles();
		
		
		Iterator<String> i1t=handles1.iterator();
		while(i1t.hasNext()) {
			String p=i1t.next();
			
			if(!p.equalsIgnoreCase(s)) {
				driver.switchTo().window(p);
				System.out.println(driver.getTitle());
			}
		}
		
		driver.switchTo().defaultContent();
		
		
		
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while (it.hasNext()) {
			String p = it.next();
			if (!p.equalsIgnoreCase(s)) {
				System.out.println(p);
				driver.switchTo().window(p);
			}
		}
		System.out.println(driver.findElement(By.id("sampleHeading")));
		driver.switchTo().window(s);

	}

}
