package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Base.Base_Class;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = "src\\test\\java\\com\\Feature\\Resort.feature",
glue = "com.Step_defnition")//in features we have to copy path from "src" from feature file //in glue we have to give the full package name of step definition//
// this all below is syntax
@RunWith(Cucumber.class)
public class Test_Runner {
	public static WebDriver driver;
	@BeforeClass
	public static void startup() {
		driver = Base_Class.browser_open();;
	}
	@AfterClass
	public static void Close() {
		driver.close();

	}
}
