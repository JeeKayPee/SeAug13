package ch4_auto.beyond;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

import common.BaseTest2;

class Ex08_HandlingAlerts extends BaseTest2 {

	@Test
	void test() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("alert('cse');");
		
		Alert alert = this.getWaiter().until(ExpectedConditions.alertIsPresent());
		alert.accept();
	}
}
// >> Browser Based Alerts

//accept
//dismiss
//getText
//sendkeys



//Windows
//using 3rd party tools - auto it and robot