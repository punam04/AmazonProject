package com.Amazon.TestClasses;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Amazon.POMClasses.LoginPOMClass;

public class TC_001VerifyLoginFunctionality extends TestBaseClass
{
	@Test
	public void VerifyLoginFunctionality()
	{
		LoginPOMClass x=new LoginPOMClass(driver);
		x.singin();
		x.Username();
		x.Continue();
		x.password();
		x.Signinbutton();
		
		String ActualResult=x.VerifyHomePage();
		System.out.println(ActualResult);
		String ExpectedResult="https://www.amazon.com/ap/signin";
		Assert.assertEquals(ActualResult, ExpectedResult);
		
	}
}
