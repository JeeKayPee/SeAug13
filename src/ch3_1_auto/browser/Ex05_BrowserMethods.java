package ch3_1_auto.browser;

import org.openqa.selenium.WebDriver;

import common.Configuration;

public class Ex05_BrowserMethods {

	public static void main(String[] args) throws Exception {
		WebDriver driver = Configuration.createChromeDriver();

		driver.manage().window().maximize();
		driver.get(Configuration.BLOG_URL);
		driver.navigate().to(Configuration.BLOG_URL);
		Thread.sleep(3000);
		// This is a very bad way of waiting. We will learn better ways later
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);

		System.out.println("Windows Handle: " + driver.getWindowHandle());

		for (String win : driver.getWindowHandles()) {
			System.out.println("H: " + win);

		}
		driver.quit();
	}
}
/*
 * What are the different types of Navigation in Selenium 
 * navigate().back()
 * navigate().forward() 
 * navigate().refresh() 
 * navigate().to(URL)
 * 
 * What is the difference between driver.get and driver.navigate.to
 */
