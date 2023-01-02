import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frirefox_Browser_commands {
	
	public static void main(String[] args) {
		
		String path = "/home/ubuntu/Downloads/geckodriver";
		
		System.setProperty("webdriver.gecko.driver", path);
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		String title = driver.getTitle();

		int titleLength = driver.getTitle().length();
		
		System.out.println("Title of the page is : " + title);
		
		System.out.println("Length of the title is : " + titleLength);

		String actualUrl = driver.getCurrentUrl();

		if (actualUrl.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"))
		{
			System.out.println("Verification Successful ");
		} 
		else 
		{

			System.out.println("Verification Failed");
		}

		String pageSource = driver.getPageSource();

		int pageSourceLength = pageSource.length();

		System.out.println("Total length of the Pgae Source is : " + pageSourceLength);

		driver.close();
	}

}
