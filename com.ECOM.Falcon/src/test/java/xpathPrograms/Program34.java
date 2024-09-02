package xpathPrograms;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program34 {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win32\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	Actions act=new Actions(driver);
	driver.findElement(By.xpath("//span[text()='Electronics']")).click();
	Thread.sleep(3000);
	WebElement ele=driver.findElement(By.xpath("(//span[@class='TSD49J'])[3]"));
	act.moveToElement(ele).perform();
	Thread.sleep(3000);
	List<WebElement> allLinks=driver.findElements(By.xpath("//a[@class='jBYtJt']"));
	Iterator<WebElement> itr=allLinks.iterator();
	while(itr.hasNext())
	{
		String values=itr.next().getText();
		System.out.println(values);
	}
	
	
}
}
