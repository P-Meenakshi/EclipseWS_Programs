import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElements {
	public static void main(String[] args) throws InterruptedException {
		String path = "/home/ubuntu/Downloads/geckodriver";
		
		System.setProperty("webdriver.gecko.driver", path);   
		WebDriver driver = new FirefoxDriver();
		driver.get("https://petstore.octoperf.com/");
		
		driver.findElement(By.xpath("//*[@id=\'Content\']/h2"));
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Enter the Store")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\'QuickLinks\']/a[2]/img")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("K9-RT-02")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("EST-22")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\'LogoContent\']/a/img")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/form/input[1]")).getTagName();
		 driver.findElement(By.xpath("//*[@id=\'SearchContent\']/form/input[1]")).sendKeys("Fish");
		 driver.findElement(By.name("searchProducts")).clear();
		
		driver.close();
	}

}
