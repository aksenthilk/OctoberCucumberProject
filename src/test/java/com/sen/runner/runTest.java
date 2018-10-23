package com.sen.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/*import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;*/

/*@RunWith(ExtendedCucumber.class)

@ExtendedCucumberOptions(jsonReport="target/cucumber.json",
                         retryCount = 3,
                         detailedReport = true,
                         detailedAggregatedReport = true,
                         overviewReport = true,
                         coverageReport = true,
                         jsonUsageReport = "target/cucumber-usage.json",
                         usageReport = true,
                         toPDF = true,
                       //  includeCoverageTags = {"@Chrome"},
                         outputFolder = "target")*/

@RunWith(Cucumber.class)
/*@CucumberOptions(features = "G:\\SeleniumCucumberWorkSpace\\OctoberCucumber\\src\\main\\java\\com\\sen\\feature", glue = {
		"com\\sen\\stepDefinition" }, strict = true, dryRun = false, plugin = { "html:com\\sen\\reports\\result",
				"rerun:target\\rerun.txt", "com.cucumber.listener.ExtentCucumberFormatter:src/test/resource//com/sen/reports/ExtentSen.html" })
                     */    
@CucumberOptions(features = "G:\\SeleniumCucumberWorkSpace\\OctoberCucumber\\src\\main\\java\\com\\sen\\feature", glue = {
"com\\sen\\stepDefinition" }, strict = true, dryRun = false, plugin = { "html:output\\result.html",
		"rerun:output\\rerun.txt", "com.cucumber.listener.ExtentCucumberFormatter:output\\ExtentSen.html" })
             //**/target/myreport/index.html,**/output/report.html,**/target/myreport/embedded0.png,**/target/myreport/embedded1.png

public class runTest {

	// static WebDriver driver;
	// static Scenario scenario;*/

	/*
	 * @BeforeClass public static void setUp(){
	 * 
	 * System.setProperty("webdriver.chrome.driver","G:\\Chromedriver.exe");
	 * driver = new ChromeDriver();
	 * driver.get("https://www.freecrm.com/index.html");
	 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 * driver.manage().window().maximize();
	 * 
	 * }
	 */

	/*
	 * @AfterClass public static void tearDown(){ if(scenario.isFailed()){
	 * scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES
	 * ), "image/png"); }
	 * 
	 * driver.close(); }
	 */
}
