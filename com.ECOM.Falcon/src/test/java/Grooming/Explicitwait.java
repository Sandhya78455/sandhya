package Grooming;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[text()='Button']"))).click();
	driver.findElement(By.xpath("//section[text()='Button']")).click();
	wait.until(ExpectedConditions.alertIsPresent());
	Alert al=driver.switchTo().alert();
	System.out.println(al.getText());
	al.dismiss();
	
}
}
