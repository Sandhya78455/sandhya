package xpathPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentPrograms2 {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win32\\chromedriver.exe");


	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='With Element']")).click();
	//Thread.sleep(3000);
	WebElement element1=driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']"));
	element1.sendKeys("5");
	
	driver.findElement(By.xpath("//button[contains(@class,'active:bg-')]")).click();
	//Thread.sleep(3000);
	WebElement dropdownEle=driver.findElement(By.xpath("//select[contains(@class,'border-0')]"));
	Select s=new Select(dropdownEle);
	s.selectByValue("yes");
	Thread.sleep(3000);
	
	driver.quit();
	
}
}
