package xpathPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program20 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("i phone 14");
		element.submit();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Add to Compare' ])[1]")).click();
	    Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Add to Compare'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Add to Compare'])[24]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Add to Compare'])[23]")).click();
		Thread.sleep(3000);
		
	}
}
