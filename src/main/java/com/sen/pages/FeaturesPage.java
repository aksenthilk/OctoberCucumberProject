package com.sen.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.sen.util.TestBase;

public class FeaturesPage extends TestBase {

	@FindBy(how = How.XPATH, using = "//a[text()='Home']")
	WebElement homeLink;

	public FeaturesPage() {
		PageFactory.initElements(driver, this);
	}

	public HomePage clickOnHomeLink() {
		homeLink.click();
		return new HomePage();
	}

}
