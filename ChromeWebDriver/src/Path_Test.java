import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Path_Test {
	public static void main(String[] args) throws InterruptedException {
		String path = "/home/ubuntu/Downloads/chromedriver";
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/ajax.html");
     //Scenario1
        driver.findElement(By.id("no")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.id("buttoncheck")).click();
        Thread.sleep(3000);
        
      //Scenario2 findByelements
        List<WebElement> elements = driver.findElements(By.name("name"));
        System.out.println("Number of elements:" +elements.size());

        for (int i=0; i<elements.size();i++){
          System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
        }
        //driver.close();
        
		//Xpath
        driver.get("https://demo.guru99.com/test/selenium-xpath.html");
        driver.findElement(By.xpath("//*[@id=\'java_technologies\']/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\'dismiss-button\']/div/span")).click();
        Thread.sleep(3000);
        
	}

}
