package xpathPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program26 {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win32\\chromedriver.exe");

	
	WebDriver driver=new ChromeDriver();
	Actions act=new Actions(driver);
	Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	WebElement element=driver.findElement(By.xpath("//span[text()='Electronics']"));
	act.click(element).perform();
	Thread.sleep(3000);
	WebElement element1=driver.findElement(By.xpath("//span[text()='Women']"));
	act.moveToElement(element1).perform();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.quit();
	
	
}
}
