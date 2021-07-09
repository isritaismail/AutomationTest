package QAmonCodeTestByIsrita;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement_Execution_Test {
        public static void main(String[] args) {
        	WebDriverManager.firefoxdriver().setup();
           
       //Url launching
            WebDriver driver=new FirefoxDriver();
            driver.get("https://nexchar.com/signup");
     
      //windows maximize
            driver.manage().window().maximize();
            
      // Signup[Create Account 1]
            
         //customer name & business type
           driver.findElement(By.id("Name")).sendKeys("wahahec");
           Select dropdownbox=new Select(driver.findElement(By.id("CategoryId")));
        	 dropdownbox.selectByValue("9");;
            
         //Input Email & Password  
            driver.findElement(By.id("Email")).sendKeys("wahahec630@godpeed.com");
           driver.findElement(By.id("Password")).sendKeys("12345");
            
         // Signup button
           driver.findElement(By.xpath("//button[@type='submit']")).click();
            
          //Signin[Create Account 1]
            
           // signin url          
            driver.navigate().to("https://nexchar.com/signin");
            
            //Input Email & Password  
              driver.findElement(By.id("Email")).sendKeys("wahahec630@godpeed.com");
             driver.findElement(By.id("Password")).sendKeys("12345");
           
              // Remember me check button
            driver.findElement(By.xpath("//span[@class='form-check-label field-validation-valid']")).click();
               
             // signin button
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            
            
            
         //   Signup[Create Account 2]
            
           //customer name & business type
                 driver.findElement(By.id("Name")).sendKeys("koriyi");

        		//Select dropdownbox =new Select(driver.findElement(By.id("CategoryId")));
          		dropdownbox.selectByIndex(5);
          
         //Input Email & Password  
             driver.findElement(By.id("Email")).sendKeys("koriyi8671@ovooovo.com");
               driver.findElement(By.id("Password")).sendKeys("123456");
                
         // Signup button
               driver.findElement(By.xpath("//button[@type='submit']")).click();
               
             //Signin[Create Account 2]
               
             // signin url
            driver.navigate().to("https://nexchar.com/signin");
            
             //Input Email & Password
            driver.findElement(By.id("Email")).sendKeys("koriyi8671@ovooovo.com");
             driver.findElement(By.id("Password")).sendKeys("123456");
             
               // Remember me check button
             driver.findElement(By.xpath("//span[@class='form-check-label field-validation-valid']")).click();
               
              // signin button
              driver.findElement(By.xpath("//button[@type='submit']")).click();
                  
            
		}
}
