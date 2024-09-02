package xpathPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentPrograms4 {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//section[text()='Frames']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//section[text()='iframes']")).click();
	Thread.sleep(3000);
	WebElement element=driver.findElement(By.xpath("//h2[text()='Login']"));
	Actions act=new Actions(driver);
	act.perform();
	driver.switchTo().frame(0);
	//driver.findElement(By.xpath("//input[@name='username']"));
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//input[@id='password']"));
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Nested iframe']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='Sign Up']"));
	Thread.sleep(3000);
	
	driver.quit();

}
}
