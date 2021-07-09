package QAmonCodeTestByIsrita;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicOperationofWebPage {
         public static void main(String[] args) throws InterruptedException {
        	 
     		WebDriverManager.firefoxdriver().setup();
     //Url launching
     		WebDriver driver=new FirefoxDriver();
     	    driver.get("https://demoblaze.com/index.html");
    
     	    
     //windows maximize
     	    driver.manage().window().maximize();
     	
     // current url
        System.out.println("Current url of the page:"+driver.getCurrentUrl());

     // title page
        System.out.println("Title of the  page"+driver.getTitle());
     	
      Thread.sleep(1000);
        
     // Navigate
       driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
         
      Thread.sleep(5000);
        
      // Refresh page
        driver.navigate().refresh();
        
    // new windows
        driver.switchTo().newWindow(WindowType.TAB);
    // new url
        driver.navigate().to("https://aftercareexplained.com/");
        
        
    // Another new windows
         driver.switchTo().newWindow(WindowType.TAB);
         
   // Another new url
       driver.navigate().to( "https://chhoto.link/");
       
       Thread.sleep(2000);
       
   //close existing window
       driver.close();
       
       Thread.sleep(3000);
   
  // close browser
       driver.quit();

		}
}
