package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	public WebDriver driver ; // global driver
	
	   By username = By.id("login1");  //these are the page objects . we have to define these on page objects only. To run this we have to use test case.
	    By password = By.name("passwd");
	    By submit = By.name("proceed");


	    
	    
	    public LoginPageObjects(WebDriver driver) // constructor
	    {
	        this.driver = driver; //local driver
	    }

	    public void enterusername(String usernamevalue)    // these are the methods to be defined in this page object class.
	    {
	        driver.findElement(username).sendKeys(usernamevalue);
	    }
	    
	    public void enterpassword(String passwordValue)
	    {
	        driver.findElement(password).sendKeys(passwordValue);  // these are the methods
	    }

	  
    public WebElement ClickonSubmit()
    {
        return driver.findElement(submit);


	    
}
}