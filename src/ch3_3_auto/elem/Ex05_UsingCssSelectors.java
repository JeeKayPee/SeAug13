package ch3_3_auto.elem;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.SeleniumUtils;

class Ex05_UsingCssSelectors extends BaseTest1 {

	/*
	 * Identify User Name text field with CSS Selectors (tag name)
	 */
	@Test
	void test01() {
		WebElement element = getDriver().findElement(By.cssSelector("input"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}

	/*
	 * Identify User Name text field with CSS Selectors (Tag name with a given
	 * attribute)
	 */
	@Test
	void test02() {
		WebElement element = getDriver().findElement(By.cssSelector("input[type]"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}

	/*
	 * Identify Password text field with CSS Selectors (Tag name, attribute and
	 * value)
	 */
	@Test
	void test03_01() {
		WebElement element = getDriver().findElement(By.cssSelector("input[type='password']"));
		SeleniumUtils.printElementInfo("Password text field", element);
	}

	/*
	 * Identify User Name text field with CSS Selectors (ID - variant of test03)
	 */
	@Test
	void test03_02() {
		WebElement element = getDriver().findElement(By.cssSelector("input[id='user_login']"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User Name text field with CSS Selectors (class - variant of test03)
	 */
	@Test
	void test03_03() {
		WebElement element = getDriver().findElement(By.cssSelector("input[class='input']"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User Name text field with CSS Selectors (name - variant of test03)
	 */
	@Test
	void test03_04() {
		WebElement element = getDriver().findElement(By.cssSelector("input[name='log']"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User Name text field with CSS Selectors (special symbols - # - ID)
	 */
	@Test
	void test04_01() {
		WebElement element = getDriver().findElement(By.cssSelector("#user_login"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User Name text field with CSS Selectors (special symbols - . -
	 * class)
	 */
	@Test
	void test04_02() {
		WebElement element = getDriver().findElement(By.cssSelector(".input"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User Name text field with CSS Selectors (special symbols - * - any
	 * tag)
	 */
	@Test
	void test04_03() {
		WebElement element = getDriver().findElement(By.cssSelector("*[name='log']"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}
	/*
	 * Identify User Name text field with CSS Selectors 
	 * (Relationships (parent>child). Denoted > tag)
	 */
	@Test
	void test05_01() {
		WebElement element = getDriver().findElement(By.cssSelector("label>input"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}
	/*
	 * Identify User Name text field with CSS Selectors 
	 * (Relationships (sibling). Denoted + tag)
	 */
	@Test
	void test05_02() {
		WebElement element = getDriver().findElement(By.cssSelector("br+input"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User Name text field with CSS Selectors - Partial Match 
	 * Contains.. *=
	 */
	@Test
	void test06_01() {
		WebElement element = getDriver().findElement(By.cssSelector("input[id*='er_l']"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}
	/*
	 * Identify User Name text field with CSS Selectors - Partial Match 
	 * Starts with.. ^=
	 */
	@Test
	void test06_02() {
		WebElement element = getDriver().findElement(By.cssSelector("input[id^='user_']"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}
	/*
	 * Identify User Name text field with CSS Selectors - Partial Match 
	 * Ends with.. $=
	 */
	@Test
	void test06_03() {
		WebElement element = getDriver().findElement(By.cssSelector("input[id$=_login]"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}
	/*
	 * Identify User Name text field with CSS Selectors - Partial Match 
	 * Contains Word ~=
	 */
	@Test
	void test06_04() {
		WebElement element = getDriver().findElement(By.cssSelector("input[value~='In']"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}
	
	/*
	 * Identify User Name text field with CSS Selectors - Logical OR , 
	 */
	@Test
	void test07_01() {
		WebElement element = getDriver().findElement(By.cssSelector("input, *[name='log']"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}
	/*
	 * Identify User Name text field with CSS Selectors - Logical AND . 
	 */
	@Test
	void test07_02() {
		WebElement element = getDriver().findElement(By.cssSelector("input.input"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}
	/*
	 * Identify Password text field with CSS Selectors - Logical AND #
	 */
	@Test
	void test07_03() {
		WebElement element = getDriver().findElement(By.cssSelector("input#user_pass"));
		SeleniumUtils.printElementInfo("Password text field", element);
	}
	
	/*
	 * Identify Password text field with CSS Selectors - Using the not() function
	 */
	@Test
	void test07_04() {
		WebElement element = getDriver().findElement(By.cssSelector("input:not([name='log'])"));
		SeleniumUtils.printElementInfo("Password text field", element);
	}
	/*
	 * Identify User Name text field with CSS Selectors - Multiple Attributes
	 */
	@Test
	void test08_01() {
		WebElement element = getDriver().findElement(By.cssSelector("input[type][name]"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify Password text field with CSS Selectors - Multiple Attributes with values
	 */
	@Test
	void test08_02() {
		WebElement element = getDriver().findElement(By.cssSelector("input[type='text'][name='log']"));
		SeleniumUtils.printElementInfo("Password text field", element);
	}
}
