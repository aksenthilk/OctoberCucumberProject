package com.sen.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	static FileInputStream fis;
	public static WebDriver driver;
	static Properties prop;
	static XSSFWorkbook wb;
	static XSSFSheet sh;

	public static void initialization() {

		try {
			fis = new FileInputStream(TestUtil.PROPERTIESFILE_PATH);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String Browser = prop.getProperty("browser");

		if (Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromePath"));
			driver = new ChromeDriver();
		}
		/*
		 * else{ if(Browser.equalsIgnoreCase("FF")){
		 * System.setProperty("webdriver.gecko.driver", "G:\\geckodriver.exe");
		 * driver = new FirefoxDriver();
		 * 
		 * }
		 */
		driver.manage().timeouts().implicitlyWait(TestUtil.WAIT, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));

		// System.out.println(prop.getProperty("url"));

	}

	public static String getExcelData(int sheet, int row, int col) throws IOException {

		FileInputStream fil;

		fil = new FileInputStream(prop.getProperty("excelFilePath"));
		wb = new XSSFWorkbook(fil);

		sh = wb.getSheetAt(sheet);
		String data = sh.getRow(row).getCell(col).getStringCellValue();
		return data;

	}
}
