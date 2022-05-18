package com.NetBanking_v1.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.NetBanking_v1.base.Base;

public class LoginPage extends Base {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='uid']")
	public WebElement userIdField;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement passwordField;

	@FindBy(xpath = "//input[@name='btnLogin']")
	public WebElement loginButton;

	public void loginTestcase(String username, String password) {
		userIdField.sendKeys(username);
		logger.info("Entered username");
		passwordField.sendKeys(password);
		logger.info("Entered password");
		System.out.print(driver.getCurrentUrl());
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}
		loginButton.click();

	}

}
