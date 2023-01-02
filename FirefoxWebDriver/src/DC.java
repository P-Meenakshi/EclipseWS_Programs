import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DC {
public static void main(String[] args) throws InterruptedException {
	String path = "/home/ubuntu/Downloads/geckodriver";
	
	System.setProperty("webdriver.gecko.driver", path);    
      
          DesiredCapabilities capabilities = DesiredCapabilities.firefox();    
          capabilities.setCapability("marionette",true);    
          WebDriver driver= new FirefoxDriver(capabilities);    
              
          driver.navigate().to("https://petstore.octoperf.com/");   
          Thread.sleep(5000);

          driver.findElement(By.linkText("Enter the Store")).click();  
          Thread.sleep(5000);

          driver.navigate().back();   

          driver.navigate().forward(); 
          Thread.sleep(3000);

          driver.navigate().to("https://petstore.octoperf.com/"); 
          Thread.sleep(3000);

          driver.navigate().refresh();  
      
          driver.close();  
}
}
