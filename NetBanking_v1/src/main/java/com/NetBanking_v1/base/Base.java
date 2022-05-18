package com.NetBanking_v1.base;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public String url = "https://demo.guru99.com/V4/index.php";
	public String userName = "mngr407311";
	public String password = "razehad";
	public static WebDriver driver;

	public static Logger logger;

	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		logger = Logger.getLogger("NetBanking");
		PropertyConfigurator.configure("log4j.properties");
		logger.info(url);
		driver.get(url);
		driver.manage().window().maximize();

	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

//	public void browserIntialization(WebDriver driver) {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get(url);
//		driver.manage().window().maximize();
//
//	}
//
//	public void closeTheDriver(WebDriver driver) {
//		driver.close();
//	}
}
