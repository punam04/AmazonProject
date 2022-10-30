package com.Amazon.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBaseClass 
{
WebDriver driver;
@BeforeMethod
public void setUp()
{
	System.setProperty("webdriver.chrome.driver","./DriverFiles\\chromedriver.exe" );
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https:\\www.amazon.com");

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}

@AfterMethod()
public void tearDown()
{
	driver.close();
}

	
	
	
}


