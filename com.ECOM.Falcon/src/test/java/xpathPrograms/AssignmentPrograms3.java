package xpathPrograms;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPrograms3 {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win32\\chromedriver.exe");

	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//section[text()='Popups']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//section[text()='Javascript']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//a[text()='Prompt']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
	Thread.sleep(4000);
	Alert a = driver.switchTo().alert();
	
	a.sendKeys("no");
//	Thread.sleep(2000);
	a.accept();
//	Thread.sleep(3000);
	
	WebElement ele = driver.findElement(By.xpath("//p[@class='pt-2 text-center']"));
	
	System.out.println(ele.getText());
	
	Thread.sleep(2000);
	driver.quit();
	
}
}
