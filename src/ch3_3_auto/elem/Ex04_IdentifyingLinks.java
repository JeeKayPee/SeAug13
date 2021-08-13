package ch3_3_auto.elem;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.SeleniumUtils;

class Ex04_IdentifyingLinks extends BaseTest1 {

	/*
	 * Identify Lost you password link with FULL text
	 */
	@Test
	void test01() {
		WebElement element = getDriver().findElement(By.linkText("Lost your password?"));
		SeleniumUtils.printElementInfo("Lost Password link", element);
	}

	/*
	 * Identify Lost you password link with PARTIAL text Contains <- and the name of
	 * the blog changes with blog
	 */
	@Test
	void test02() {
		WebElement element = getDriver().findElement(By.partialLinkText("Back to"));
		SeleniumUtils.printElementInfo("Back to blog link", element);
	}

}
