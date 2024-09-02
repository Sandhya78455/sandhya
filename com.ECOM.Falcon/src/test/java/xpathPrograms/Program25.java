package xpathPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program25 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win32\\chromedriver.exe");

	
	WebDriver driver=new ChromeDriver();
	Actions act=new Actions(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	WebElement element=driver.findElement(By.xpath("//span[text()='Login']"));
	act.click(element).perform();
	boolean b=driver.findElement(By.xpath("//span[text()='Login']")).isDisplayed();
	System.out.println(b);
	
}
}
