package com.page.objects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	WebDriver driver;
	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
	}
	public OpenQARegistrationPage getOpenQARegistrationPage() {
		return new OpenQARegistrationPage(driver);
	}
	public FbLoginPage getFbLoginPage() {
		return new FbLoginPage(driver);
	}

}
