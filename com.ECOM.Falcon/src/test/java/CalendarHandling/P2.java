package CalendarHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
	element.sendKeys("i phone 14");
	element.submit();
	driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();
	Thread.sleep(3000);
	String parentWindowId=driver.getWindowHandle();
	Set<String> allIds=driver.getWindowHandles();
	Thread.sleep(3000);
	for(String ids:allIds)
	{
		if(!ids.equals(parentWindowId))
		{
			driver.switchTo().window(ids);
		}
	}
	
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Add Item']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='Remove']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='Remove']")).click();
	driver.quit();
	
}
}
