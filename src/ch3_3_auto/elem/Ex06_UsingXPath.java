package ch3_3_auto.elem;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.SeleniumUtils;

class Ex06_UsingXPath extends BaseTest1 {

	/*
	 * Identify User Name text field with Absolute XPath (tag name) DO NOT USE THIS
	 * in PROFESSIONAL WORK Absolute XPath are evil :_>
	 */
	@Test
	void test00() {
		WebElement element = getDriver().findElement(By.xpath("/html/body/div[1]/form/p[1]/label/input"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}

	/*
	 * Now onwards we stick with relative XPath as Absolute XPath are brittle
	 * Identify User Name text field with XPath (tag name)
	 */
	@Test
	void test01() {
		WebElement element = getDriver().findElement(By.xpath("//input"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}

	/*
	 * Identify User Name text field with XPath (tag name with attribute)
	 */
	@Test
	void test02() {
		WebElement element = getDriver().findElement(By.xpath("//input[@type]"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}

	/*
	 * Identify Password text field with XPath (tag name, attribute and value)- type
	 */
	@Test
	void test03_01() {
		WebElement element = getDriver().findElement(By.xpath("//input[@type='password']"));
		SeleniumUtils.printElementInfo("Password text field", element);
	}

	/*
	 * Identify User Name text field with XPath Variant of test03_01 - ID
	 */
	@Test
	void test03_02() {
		WebElement element = getDriver().findElement(By.xpath("//input[@id='user_login']"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}

	/*
	 * Identify User Name text field with XPath Variant of test03_01 - Class
	 */
	@Test
	void test03_03() {
		WebElement element = getDriver().findElement(By.xpath("//input[@class='input']"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}

	/*
	 * Identify User Name text field with XPath Variant of test03_01 - Name
	 */
	@Test
	void test03_04() {
		WebElement element = getDriver().findElement(By.xpath("//input[@name='log']"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}

	/*
	 * Identify User Name text field with XPath Variant of test03_01 - Any tag
	 */
	@Test
	void test03_05() {
		WebElement element = getDriver().findElement(By.xpath("//*[@name='log']"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}

	/*
	 * Identify Lost your password link with XPath - text
	 */
	@Test
	void test04() {
		WebElement element = getDriver().findElement(By.xpath("//*[text()='Lost your password?']"));
		SeleniumUtils.printElementInfo("Lost you password link", element);
	}

	/*
	 * Identify User Name text field with XPath - Relationships - Child
	 */
	@Test
	void test05_01() {
		WebElement element = getDriver().findElement(By.xpath("//label/input"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}

	/*
	 * Identify User Name text field with XPath - Relationships - Following sibling
	 */
	@Test
	void test05_02() {
		WebElement element = getDriver().findElement(By.xpath("//br/following-sibling::input"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}

	/*
	 * Identify User Name text field with XPath - Partial Match - Attribute value
	 * Contains
	 */
	@Test
	void test06_01() {
		WebElement element = getDriver().findElement(By.xpath("//input[contains(@id,'er_l')]"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}

	/*
	 * Identify User Name text field with XPath - Partial Match - Attribute value
	 * Starts-with
	 */
	@Test
	void test06_02() {
		WebElement element = getDriver().findElement(By.xpath("//input[starts-with(@id,'user_')]"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}

	/*
	 * Identify User Name text field with XPath - Partial Match - ends-with
	 * ends-with is not supported in current browsers. As it requires XPath 2.0,
	 * however all browsers use XPath v1
	 */
	@Test
	void test06_03() {
		WebElement element = getDriver().findElement(By.xpath("//input[ends-with(@id,'_login')]"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}

	/*
	 * Identify Lost your password link with XPath - Partial Match - Text Contains
	 */
	@Test
	void test06_04() {
		WebElement element = getDriver().findElement(By.xpath("//a[contains(text(), 'Lost')]"));
		SeleniumUtils.printElementInfo("Lost your password link", element);
	}

	/*
	 * Identify Lost your password link with XPath - Partial Match - Text
	 * starts-with
	 */
	@Test
	void test06_05() {
		WebElement element = getDriver().findElement(By.xpath("//a[starts-with(text(), 'Lost')]"));
		SeleniumUtils.printElementInfo("Lost your password link", element);
	}

	/*
	 * Identify User Name text field with XPath - Logical OR: using the or keyword
	 */
	@Test
	void test07_01() {
		WebElement element = getDriver().findElement(By.xpath("//input[@class='input' or @id='user_pass'] "));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify Password text field with XPath - Logical OR: using the or keyword
	 */
	@Test
	void test07_02() {
		WebElement element = getDriver().findElement(By.xpath("//input[@class='input' and @id='user_pass'] "));
		SeleniumUtils.printElementInfo("Password text field", element);
	}

	/*
	 * Identify Password text field with XPath - Logical OR: using the or keyword
	 */
	@Test
	void test07_03() {
		WebElement element = getDriver().findElement(By.xpath("//input[@class='input' and not(@name='log')]"));
		SeleniumUtils.printElementInfo("Password text field", element);
	}

	/*
	 * Identify Login Form with XPath - Hierarchy (Axis) - Parent
	 */
	@Test
	void test08_01() {
		WebElement element = getDriver().findElement(By.xpath("//label/../.."));
		SeleniumUtils.printElementInfo("Login form", element);
	}

	/*
	 * Identify Login Form with XPath - Hierarchy (Axis) - Descendant Using //
	 * instead of / between form and input
	 */
	@Test
	void test08_02() {
		WebElement element = getDriver().findElement(By.xpath("//form//input"));
		SeleniumUtils.printElementInfo("Login form", element);
	}

	/*
	 * Identify Login Form with XPath - Hierarchy (Axis) - Ancestor (using
	 * /ancestor)
	 */
	@Test
	void test08_03() {
		WebElement element = getDriver().findElement(By.xpath("//input/ancestor::form"));
		SeleniumUtils.printElementInfo("Login form", element);
	}

	/*
	 * Identify Login Form with XPath - Hierarchy (Axis) - Preceding sibling
	 * starting from submit paragraph
	 */
	@Test
	void test08_04() {
		WebElement element = getDriver().findElement(By.xpath("//p[@class='submit']/preceding-sibling::p//input"));
		SeleniumUtils.printElementInfo("Login form", element);
	}

	/*
	 * Identify User name text field with XPath - Hierarchy (Axis) - Index Index
	 * uses Human counting This variant looks at children of the same parent this is
	 * the reason //input[2] does not point to the password field
	 */
	@Test
	void test09_01() {
		WebElement element = getDriver().findElement(By.xpath("//input[1]"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User name text field with XPath - Hierarchy (Axis) - Index Index
	 * uses Human counting This variant looks at elements across the DOM this is the
	 * reason (//input)[2] would point to the password field
	 */
	@Test
	void test09_02() {
		WebElement element = getDriver().findElement(By.xpath("(//input)[1]"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User name text field with XPath - Multiple attributes
	 */
	@Test
	void test10_01() {
		WebElement element = getDriver().findElement(By.xpath("//input[@name and @type]"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify Password text field with XPath - Multiple attributes with values
	 */
	@Test
	void test10_02() {
		WebElement element = getDriver().findElement(By.xpath("//input[@name='pwd' and @type='password']"));
		SeleniumUtils.printElementInfo("Password text field", element);
	}

}
