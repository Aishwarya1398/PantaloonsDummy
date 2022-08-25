package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.qa.utility.TestUtil;

public class TestBase {

	public WebDriver driver;
//	public static staticDriver;
	public static Properties prop;
	
	
	public TestBase() {
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\User\\Documents\\Automation1\\pantaloons\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	@BeforeClass
	public void beforeConfig() throws InterruptedException  
	{
//		String browserName= prop.getProperty("browser");
//		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\Automation\\Drivers\\chromedriver.exe");
//			ChromeOptions opt = new ChromeOptions();
//			opt.addArguments("--disable-notifications");
			driver = new ChromeDriver();
//		}
//			staticDriver = driver;
//			driver.
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			Reporter.log("Browser opened" , true);
			Thread.sleep(3000);
			Alert alt=driver.switchTo().alert();
			alt.accept();
	}
	
	@AfterClass
	public void cnfigAC()
	{
		driver.quit();
		Reporter.log("Browser closed" , true);
	}
}
		//else if(browserName.equals("FF")) {
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Documents\\Automation\\Drivers\\geckodriver.exe");
			//driver = new FireFoxDriver();
		//}
		