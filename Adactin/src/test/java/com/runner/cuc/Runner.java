package com.runner.cuc;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.base.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//Adactin//feature",
glue = "com.Adactin.stepdef")

public class Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void Setup() {

		driver = Base_Class.getdriver("chrome");
	}
	
	@AfterClass
	public static void close() {
		driver.close();
	}

}

