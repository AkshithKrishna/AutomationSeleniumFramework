package com.NetBanking_v1.Suites;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.NetBanking_v1.base.Base;
import com.NetBanking_v1.webpages.LoginPage;

public class LoginSuite extends Base {
	@Test
	public void loginTest() {
		
		LoginPage lp = new LoginPage(driver);
		lp.loginTestcase(userName, password);
	}

}
