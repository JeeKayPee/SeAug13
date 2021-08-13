package common;

import org.openqa.selenium.WebElement;

public class SeleniumUtils {

	public static void printElementInfo(String name, WebElement element) {

		String marker = "--------------------------------------";

		System.out.println(marker);
		System.out.println("Element Meta data: " + name);
		System.out.println(marker);
		System.out.println("WebElement Object" + element);

		System.out.println("OuterHTML:: " + element.getAttribute("outerHTML"));
		System.out.println("InnerHTML:: " + element.getAttribute("innerHTML"));

		System.out.println("Text:: " + element.getText());
		System.out.println("Value:: " + element.getAttribute("value"));
		System.out.println("Tag:: " + element.getTagName());

		System.out.println("Displayed?:: " + element.isDisplayed());
		System.out.println("Selected?:: " + element.isSelected());
		System.out.println("Enabled?:: " + element.isEnabled());
		System.out.println(marker);
	}

}
