package ch3_2_auto.page;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import common.Configuration;

class Ex05_JUnitVerityTitle {

	@Test
	void testSiteTitle() {
		WebDriver driver = Configuration.createChromeDriver();
		driver.get(Configuration.BLOG_URL);
		String expectedTitle = "dummy";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle);
		driver.quit();
	}

}
