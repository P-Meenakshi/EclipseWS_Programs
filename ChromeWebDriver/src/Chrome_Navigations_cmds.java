import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Navigations_cmds {
	public static void main(String[] args) throws InterruptedException {
		String path = "/home/ubuntu/Downloads/chromedriver";
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.navigate().to("https://petstore.octoperf.com/");  
        Thread.sleep(3000);
        driver.navigate().forward();
        driver.navigate().back();
        driver.navigate().refresh(); 
        driver.close();
        

	}

}
