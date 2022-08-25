package com.qa.utility;

import org.openqa.selenium.WebDriver;

public class TestUtil {

	public static long PAGE_LOAD_TIMEOUT=30;
	public static long IMPLICIT=10;

	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
		}	
}
