package xpathPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program31 {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
    driver.findElement(By.xpath("//span[text()='Login']")).click();	
    Thread.sleep(3000);
    Actions act=new Actions(driver);
    WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
    element.sendKeys("i phone 14");
    element.submit();
    
	Thread.sleep(3000);
	WebElement element1=driver.findElement(By.xpath("//div[@class='KzDlHZ']"));
	act.contextClick(element1).perform();
	
	
}
}
