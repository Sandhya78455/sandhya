package xpathPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program17 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
	element.sendKeys("i phone 14");
	element.submit();
	
	String pname=driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Purple, 128 GB)']")).getText();
	
	String price=driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Purple, 128 GB)']/../following-sibling::div/div[@class='cN1yYO']/div[@class='hl05eU']/div[@class='Nx9bqj _4b5DiR']")).getText();
	System.out.println(pname+"------------------>"+price);

	driver.close();
	
	
}
}
