package com.sen.stepDefinition;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import com.cucumber.listener.Reporter;
import com.sen.pages.FeaturesPage;
import com.sen.pages.HomePage;
import com.sen.pages.PricingPage;
import com.sen.util.TestBase;
import com.sen.util.TestUtil;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class stepDefs extends TestBase {
	HomePage hp;
	FeaturesPage fp;
	PricingPage pp;

	Scenario scenario;

	@Before
	public void setUp() {
		TestBase.initialization();
	}

	@When("^User clicks on Features link$")
	public void user_clicks_on_Features_link() throws Throwable {
		hp = new HomePage();
		Thread.sleep(3000);
		hp.clickOnFeatures();
	}

	@Then("^User navigates to Features page$")
	public void user_navigates_to_Features_page() throws Throwable {
		Assert.assertEquals(TestUtil.FEATURESPAGE_TITLE, driver.getTitle());

	}

	@Then("^User clicks on the Free CRM Logo$")
	public void user_clicks_on_the_Free_CRM_Logo() throws Throwable {
		Thread.sleep(3000);
		fp = new FeaturesPage();
		fp.clickOnHomeLink();

	}

	@Then("^User lands on the HP$")
	public void user_lands_on_the_HP() throws Throwable {
		Assert.assertEquals(TestUtil.HOMEPAGE_TITLE, driver.getTitle());

	}

	@When("^User clicks on Pricing link$")
	public void user_clicks_on_Pricing_link() throws Throwable {
		Thread.sleep(3000);
		hp = new HomePage();
		hp.clickOnPricing();
		Thread.sleep(3000);

	}

	@Then("^User navigates to Pricing page$")
	public void user_navigates_to_Pricing_page() throws Throwable {
		Assert.assertEquals(TestUtil.PRICINGPAGE_TITLE, driver.getTitle());

	}

	@Then("^User clicks HomePage link$")
	public void user_clicks_HomePage_link() throws Throwable {
		pp = new PricingPage();
		pp.clickOnHomeLink();
		Thread.sleep(3000);

	}

	/***********************************************************/

	@Given("^User is on the Free CRM HP$")
	public void user_is_on_the_Free_CRM_HP() throws Throwable {

		Assert.assertEquals(TestUtil.HOMEPAGE_TITLE, driver.getTitle());

	}

	@When("^User submits valid user name and password$")
	public void user_submits_valid_user_name_and_password() throws IOException {
		hp = new HomePage();
		String name = TestBase.getExcelData(0, 1, 0);
		String password = TestBase.getExcelData(0, 1, 1);

		hp.enterName(name);
		hp.enterPwd(password);

		WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);

	}

	@Then("^User navigates to Dashboard page$")
	public void user_navigates_to_Dashboard_page() throws Throwable {
		Assert.assertEquals(TestUtil.DASHBOARDPAGE_TITLE, driver.getTitle());

	}

	/******************************************************/

	@Then("^Closes the HP$")
	public void closes_the_HP() {

	}

	@After
	public void tearDown(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");

			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//File dest = new File("report/" + src.getName());
			
			//File dest = new File("src/test/resource//com/sen/reports/" + src.getName());
			File dest = new File("output/" + src.getName());
			

			FileUtils.copyFile(src, dest);

			Reporter.addScreenCaptureFromPath(dest.getName());

		}

		driver.close();
		// driver.quit();
	}

}
