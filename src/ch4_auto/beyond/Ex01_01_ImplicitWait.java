package ch4_auto.beyond;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.Configuration;

class Ex01_01_ImplicitWait {

	@Test
	void test() {
		WebDriver driver = Configuration.createChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get(Configuration.ADMIN_URL);
		WebElement userNameTextField = driver.findElement(By.name("log"));
		userNameTextField.sendKeys(Configuration.USER_NAME);

		WebElement pwdTextField = driver.findElement(By.name("pwd"));
		pwdTextField.sendKeys(Configuration.PASSWORD);
		pwdTextField.submit();

		boolean dashBoardLoaded = driver.findElement(By.id("wpadminbar")).isDisplayed();
		assertTrue(dashBoardLoaded, "Assert that dashboard is loaded");

		WebElement logOut = driver.findElement(By.xpath("//a[text()='Log Out']"));
		driver.get(logOut.getAttribute("href"));

		WebElement logOutMsg = driver.findElement(By.xpath("//*[contains(text(), 'logged out')]"));
		assertTrue(logOutMsg.isDisplayed(), "Assert successfull logout");

		driver.quit();
	}

}
