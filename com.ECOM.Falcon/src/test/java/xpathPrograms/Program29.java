package xpathPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program29 {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
	Thread.sleep(3000);	
	Actions act=new Actions(driver);
	WebElement element=driver.findElement(By.xpath("//div[@class='zoom-button ']"));
	Thread.sleep(3000);
	act.clickAndHold(element).perform();
	Thread.sleep(3000);
	act.release(element).perform();
}
}
