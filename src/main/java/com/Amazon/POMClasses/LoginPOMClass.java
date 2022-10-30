package com.Amazon.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPOMClass 
{
WebDriver driver;

@FindBy(xpath="//a[text()='Sign in securely']")
WebElement SignIn;

public void singin()
{
	SignIn.click();
}

@FindBy(xpath="//input[@id='ap_email']")
WebElement Username;

public void Username()
{
	Username.sendKeys("8830096286");
}

@FindBy(xpath="//input[@id='continue']")
WebElement Continue;

public void Continue()
{
	Continue.click();
	
}

@FindBy(xpath="//input[@id='ap_password']")
WebElement password;

public void password()
{
	password.sendKeys("Punam93#");
}
@FindBy(xpath="//input[@id='signInSubmit']")
WebElement SignInButton;

public void Signinbutton()
{
	SignInButton.click();
}

public String VerifyHomePage()
{
	String actualUrl=driver.getCurrentUrl();
	return actualUrl;
}
public LoginPOMClass(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	
	
	
	
	
}

