package ch4_auto.beyond;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.Configuration;

class Ex01_02_ExplicitWait {

	@Test
	void test() {
		WebDriver driver = Configuration.createChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 60);

		driver.get(Configuration.ADMIN_URL);
		WebElement userNameTextField = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("log")));
		userNameTextField.sendKeys(Configuration.USER_NAME);
		assertEquals(Configuration.USER_NAME, userNameTextField.getAttribute("value"), "Assert the user name text");

		WebElement pwdTextField = driver.findElement(By.name("pwd"));
		pwdTextField.sendKeys(Configuration.PASSWORD);
		assertEquals(Configuration.PASSWORD, pwdTextField.getAttribute("value"), "Assert the password text");

		WebElement submitButton = driver.findElement(By.id("wp-submit"));
		submitButton.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='WordPress News']")));

		WebElement logOut = driver.findElement(By.xpath("//a[text()='Log Out']"));
		driver.get(logOut.getAttribute("href"));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'logged out')]")));

		driver.quit();
	}

}
