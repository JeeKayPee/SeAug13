package ch3_2_auto.page;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import common.Configuration;

class Ex06_JUnitVerityTitleWithAPurpose {

	@Test
	void testSiteTitle() {
		WebDriver driver = Configuration.createChromeDriver();
		driver.get(Configuration.BLOG_URL);
		String expectedTitle = "dummy";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle, "Verify Site Title");
		driver.quit();

	}
}
