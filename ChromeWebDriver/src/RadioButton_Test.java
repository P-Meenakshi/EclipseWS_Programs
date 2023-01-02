import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_Test {
	
public static void main(String[] args) {
	String path = "/home/ubuntu/Downloads/chromedriver";
    System.setProperty("webdriver.chrome.driver", path);
    WebDriver driver = new ChromeDriver();
    driver.get("https://demo.guru99.com/test/radio.html");
    driver.findElement(By.id("vfb-7-3")).click();
    driver.findElement(By.id("vfb-6-2")).click();
    driver.close();
}
}
