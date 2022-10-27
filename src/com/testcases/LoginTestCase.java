package com.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pageobjects.LoginPageFactory;
import com.pageobjects.LoginPageObjects;

public class LoginTestCase {

	public WebDriver driver;
	
@Test
    
    public void LoginTestCase() throws EncryptedDocumentException, IOException
    {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
        driver = new ChromeDriver();
        
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        
        driver.manage().window().maximize();
        
        //creating an object for pageobject class
        // page object is created succesfully and import all the methods. all the methods can be accessed.
        
        //reference this driver below as this driver in pageobject class
        
        //this is reference for page object class technique
       /* LoginPageObjects lp = new LoginPageObjects(driver); 
        lp.enterusername("Harish");
        lp.enterpassword("Arul");
       lp.ClickonSubmit();*/

        //factory way of implementation
        /* LoginPageFactory lp = new LoginPageFactory(driver); 
         LoginPageFactory.username.sendKeys("Harish");
         LoginPageFactory.password.sendKeys("password");
         //LoginPageFactory.proceed.submit();*/
         
         
        // this is to provide all the user names 
        
        LoginPageFactory lp = new LoginPageFactory(driver); 
        FileInputStream fs = new FileInputStream("./InputTestData/InputTestData.xlsx");
        Workbook wb = WorkbookFactory.create(fs);
        
    org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("Login");
         
    for(int i=0;i<=sh.getLastRowNum();i++)
    {
        
        Row rowvalue = sh.getRow(i);
        String userid = rowvalue.getCell(0).toString();
        LoginPageFactory.username.sendKeys(userid);
        LoginPageFactory.username.clear();
        
        String password = rowvalue.getCell(1).toString();
        LoginPageFactory.password.sendKeys(password);
        LoginPageFactory.password.clear();
 
        //  driver.close();
    }

    }
}



            
    


         
         
         
   
        



	
	

