package FrameworkImplementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import FrameworkImplementation.SignInPage_Object_Locator;

public class SigninPage_Pom {
        
	public static void main(String[] args) {
        		
		WebDriverManager.firefoxdriver().setup();
        	 
		//Url launching
        	     		
		     WebDriver driver=new FirefoxDriver();
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
        	     	    
        	     	    
		}
}
