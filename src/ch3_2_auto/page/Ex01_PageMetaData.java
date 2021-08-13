package ch3_2_auto.page;

import org.openqa.selenium.WebDriver;

import common.Configuration;

public class Ex01_PageMetaData {

	public static void main(String[] args) {
		WebDriver driver = Configuration.createChromeDriver();
		driver.get(Configuration.BLOG_URL);

		System.out.println("URL: " + driver.getCurrentUrl());
		System.out.println("Title: " + driver.getTitle());
		System.out.println("Page Source: " + driver.getPageSource());
		driver.quit();
	}
}
//what is the practical purpose of getPageSource
