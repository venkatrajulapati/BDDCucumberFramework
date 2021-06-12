package com.app.testbase;

import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import com.app.libs.common.commonUtils;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testbase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;
	
	
	
	
	public static WebDriver getDriver() {
		
		log.info("initializing Log ......... ");
		String browser="";
		browser = commonUtils.getPropertyValue("./config/application.properties", "browser");
		if(browser.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "./server/chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			options.addArguments("--disable-web-security");
			options.addArguments("--allow-insecure-localhost");
			options.addArguments("--ignore-urlfetcher-cert-requests");
			options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
			//options.setExperimentalOption("useAutomationExtension", false);
			driver = new ChromeDriver(options);
		}
		//driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("end configuration");
		return driver;
	}
	
	
	public void cleanup() {
		driver.quit();
	}

}
