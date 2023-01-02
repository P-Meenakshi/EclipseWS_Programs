import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import LaunchBrowser.Launch_Driver;

public class CheckBox_Test {
	public static void main(String[] args) throws InterruptedException {
		
	
		Launch_Driver lb = new Launch_Driver();
		WebDriver driver;
		driver = lb.launchChrome();
		driver.get("http://the-internet.herokuapp.com/checkboxes");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).click();
		boolean status = driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).isSelected();
		System.out.println("Status:"+status);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).click();
		boolean status1 = driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).isSelected();
		System.out.println("Status1"+status1);
		driver.quit();
	}

}
