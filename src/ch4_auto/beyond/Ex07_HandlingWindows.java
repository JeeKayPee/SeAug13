package ch4_auto.beyond;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;

import common.BaseTest2;
import common.Configuration;

class Ex07_HandlingWindows extends BaseTest2 {

	@Test
	void test() {

		System.out.println(getDriver().getTitle()); 
		String mainWin = getDriver().getWindowHandle();

		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.open(arguments[0]);", Configuration.BLOG_URL);

		for (String handle : getDriver().getWindowHandles()) {
			if (!handle.equals(mainWin)) {
				getDriver().switchTo().window(handle);
				System.out.println(getDriver().getTitle()); 
				getDriver().close();
				getDriver().quit();
			}
				}
		getDriver().switchTo().window(mainWin);
		System.out.println(getDriver().getTitle()); 
	}

}

// diff between close and quit
// neither takes parameters
// neither has a return value

