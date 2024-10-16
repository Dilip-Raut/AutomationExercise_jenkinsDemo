package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.utils.ExtentManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;

public class TestBase {

	// declaring all variables
	public static Properties prop;
	public static InputStream fileInputStream;

	public static WebDriver driver;
	public JavascriptExecutor js;
	public ExtentReports rep=ExtentManager.getInstance();
	public static ExtentTest test;

	@BeforeSuite
	public void setup() {
		// this method will run Before each @Test method we will have

		try {
			// read properties file
			String propFilePath = "D:\\OpenTech\\AutomationExercise\\src\\main\\resources\\com\\config\\config.properties";
			System.out.println(propFilePath);
			fileInputStream = new FileInputStream(propFilePath);

			// load properties file in Properties
			prop = new Properties();
			prop.load(fileInputStream);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}

		// read which browser is required for test from config file
		String browser = prop.getProperty("browser").toUpperCase();

		// use WebDriverManager to automatically setup driver of the browser
		WebDriverManager.getInstance(DriverManagerType.valueOf(browser)).clearDriverCache().setup();
		WebDriverManager.getInstance(DriverManagerType.valueOf(browser)).clearResolutionCache().setup();
		WebDriverManager.getInstance(DriverManagerType.valueOf(browser)).setup();

		// launch appropriate browser
		switch (browser) {
		case "CHROME":
			driver = new ChromeDriver();
			break;
		case "FIREFOX":
			driver = new FirefoxDriver();
			break;
		case "SAFARI":
			driver = new SafariDriver();
			break;
		case "EDGE":
			driver = new EdgeDriver();
			break;
		case "IEXPLORER":
			driver = new InternetExplorerDriver();
			break;
		}
		Reporter.log("======Launch Browser======", true);

		// navigate to application and set the pace of script
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(prop.getProperty("url"));

	}

	
	  
	public static String takesScreenshot(String testMethodName, WebDriver driver) throws IOException {
		File SourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destinationFilePath = System.getProperty("user.dir") + "/Screenshots/" + testMethodName + ".png";
		FileUtils.copyFile(SourceFile, new File(destinationFilePath));

		return destinationFilePath;
	}
	 
	@AfterSuite
	public void tearDown() {

		if (driver != null) {
			driver.quit();
		}
		Reporter.log("======Browser Closed======");
	}

}
