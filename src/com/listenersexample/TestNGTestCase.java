package com.listenersexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(com.listenersexample.TestNGListenerClass.class)

public class TestNGTestCase {
	
	public static WebDriver driver;
	
	@Test
	
	public void LoginTest()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
		driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
	Assert.fail(); // this is to fail the test case
		driver.close();
		
		
	}

}
