package Selenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 extends Base {

	@DataProvider(name = "dp")
	public Object[][] data() {

		return new Object[][] { { "sumit", "ghosh" }, { "guddu", "ghosh" } };
	}

	@Test(dataProvider = "dp")
	public void myTest(String s1, String s2) {
		System.out.println(s1 + s2);

	}

}
