package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

public WebDriver driver;
    
    @FindBy(id="login1")
    public static WebElement username;
    
    @FindBy(name="passwd")
    public static WebElement password;
    
    @FindBy(name="submit")
    public static WebElement proceed;
    
    public LoginPageFactory (WebDriver driver)
    {
        this.driver = driver;
        
        PageFactory.initElements(driver, this);
        
        
    }
    
 //to do action on page factory
  //  public void enterusername(String usernamevalue) {
   // 	username.sendKeys(usernamevalue);
    //	username.click();
    }

	

