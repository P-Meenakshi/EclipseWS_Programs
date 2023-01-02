package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LandingPage {
	@Test
	public void testscenario1() throws InterruptedException
	{
        String path = "D:\\Clients\\StackRoute\\UST Global\\WebDriverAutomation\\JavaInterfaceExample\\BrowserDrivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://petstore.octoperf.com/");
		
		Thread.sleep(5000);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.navigate().to("https://www.facebook.com/login/"); 
		
		Thread.sleep(2000);
		
		String title1 = driver.getTitle();
		
		System.out.println(title1);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		driver.quit();

	}
}
