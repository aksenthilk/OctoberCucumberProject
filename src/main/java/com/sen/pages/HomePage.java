package com.sen.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.sen.util.TestBase;

public class HomePage extends TestBase {

	@FindBy(how = How.XPATH, using = "//a[text()='Features']")
	WebElement featuresLink;
	// @CacheLookup

	@FindBy(how = How.NAME, using = "username")
	WebElement userName;

	@FindBy(how = How.NAME, using = "password")
	WebElement password;

	@FindBy(how = How.XPATH, using = "//input[@value='Login']")
	WebElement loginBtn;

	@FindBy(how = How.XPATH, using = "//a[text()='Pricing']")
	WebElement pricingLink;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public FeaturesPage clickOnFeatures() {
		featuresLink.click();
		return new FeaturesPage();
	}

	public PricingPage clickOnPricing() {
		pricingLink.click();
		return new PricingPage();
	}

	public void enterName(String name) {
		userName.clear();
		userName.sendKeys(name);
	}

	public void enterPwd(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}

	public DashBoardPage clickOnLogin() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].click()", loginBtn);
		return new DashBoardPage();

	}

}
