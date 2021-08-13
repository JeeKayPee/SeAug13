package ch4_auto.beyond;

import java.io.File;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import common.BaseTest2;
import common.Configuration;

class Ex10_TakingScreenshots extends BaseTest2 {

	@Test
	public void takeScreenShot() {
		TakesScreenshot camera = (TakesScreenshot) getDriver();

		File sFile = camera.getScreenshotAs(OutputType.FILE);

		String path = String.format("%s%s-%s.png", Configuration.SCREENSHOT_DIR, "dashboard",
				System.currentTimeMillis());
		sFile.renameTo(new File(path));

	}

}
