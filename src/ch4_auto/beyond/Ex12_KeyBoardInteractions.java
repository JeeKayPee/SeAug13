package ch4_auto.beyond;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import common.BaseTest2;

class Ex12_KeyBoardInteractions extends BaseTest2 {

	/*
	 * Sending a sequence of keys with Keys Chord
	 */
	@Test
	void test01() {

		String title = "sample";
		WebElement postTitle = getDriver().findElement(By.name("post_title"));
		postTitle.sendKeys(Keys.chord(Keys.SHIFT, title));
		assertEquals(title.toUpperCase(), postTitle.getAttribute("value"), "Assert title");

	}

	/*
	 * Hold and release a key while other keystrokes are simulated
	 */
	@Test
	void test02() {
		String title = "sample";
		WebElement postTitle = getDriver().findElement(By.name("post_title"));

		Actions action = new Actions(getDriver());
		action.keyDown(Keys.SHIFT).sendKeys(postTitle, title).keyUp(Keys.SHIFT).build().perform();

		assertEquals(title.toUpperCase(), postTitle.getAttribute("value"), "Assert title");

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
