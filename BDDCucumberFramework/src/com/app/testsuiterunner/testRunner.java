package com.app.testsuiterunner;

import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;

import com.app.libs.common.commonUtils;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@CucumberOptions(features = "./Features",
				 glue= {"stepDefinitions"},
				 dryRun=false,
				 plugin = {"pretty","html:target/cucumber_report.html"},
				 monochrome = true
				)
public class testRunner extends AbstractTestNGCucumberTests { 
	

	
	
}
