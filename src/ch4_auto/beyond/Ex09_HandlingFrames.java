package ch4_auto.beyond;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import common.BaseTest2;

class Ex09_HandlingFrames extends BaseTest2 {

	@Test
	void test() {
		getDriver().findElement(By.linkText("Posts")).click();
		getDriver().findElement(By.linkText("Add New")).click();
		
		WebElement publish = getWaiter().until(ExpectedConditions.presenceOfElementLocated(By.id("publish")));
		WebElement titleBox = getDriver().findElement(By.name("post_title"));
		String title = "Sample Text";
		titleBox.sendKeys(title);
		assertEquals(title, titleBox.getAttribute("value"), "assert post title");
		
		getDriver().switchTo().frame("content_ifr");
		String text = "Dummy text";
		WebElement content = getDriver().findElement(By.id("tinymce"));
		content.sendKeys(text);
		assertEquals(text, content.getText(), "assert post content");
		
		//once an iframe is handled, switch back to default content (dom root)
		getDriver().switchTo().defaultContent();
		publish.click();
		
		getWaiter().until(ExpectedConditions.visibilityOfElementLocated(By.linkText("View post")));

	}

}


