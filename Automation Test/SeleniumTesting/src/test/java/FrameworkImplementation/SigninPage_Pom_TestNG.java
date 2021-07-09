package FrameworkImplementation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import FrameworkImplementation.SignInPage_Object_Locator;

public class SigninPage_Pom_TestNG {
	 
	// class variable
	private static WebDriver driver=null;
	
     //before test   
	
	@BeforeTest
	
	public void SetupTest(){
        		
		WebDriverManager.firefoxdriver().setup();
         driver=new FirefoxDriver();     
	}
	
  // test
	@Test
	
	public void Test() throws InterruptedException{
		
		  //Url launching
            driver.get("https://acquireangel.com/signin");
          //windows maximize
              driver.manage().window().maximize();
        	     	    
      	  //Email
       	   SignInPage_Object_Locator.username(driver).sendKeys("hamidsaymon9@gmail.com");
        	    
          // Password
           SignInPage_Object_Locator.password(driver).sendKeys("Abc12345");
        	    
         // Remember me
            SignInPage_Object_Locator.rememberme(driver).click();
        	    
         // SignIn button
        	 SignInPage_Object_Locator.signinbutton(driver).click();
        	 
        	 Thread.sleep(2000);	    
	 
	}
	//Close
	
	@AfterTest
	public void Teardown(){
	//	driver.close();
		driver.quit();
	}
		}

