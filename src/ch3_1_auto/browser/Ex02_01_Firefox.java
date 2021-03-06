package ch3_1_auto.browser;

import java.io.File;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex02_01_Firefox {

	public static void main(String[] args) throws Exception {

		String driverPath = System.getProperty("user.dir") 
				+ File.separator 
				+ "drivers" 
				+ File.separator
				+ "geckodriver"; //add .exe for windows
		System.setProperty("webdriver.gecko.driver", driverPath);
		FirefoxDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.quit();
	}
}
