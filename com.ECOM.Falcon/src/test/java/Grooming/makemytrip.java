package Grooming;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class makemytrip {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win32\\chromedriver.exe");
	
	String expectedData="oct 21 2024";
	String xpectedMonth="october";
	String expectedTraveller="7";
	String fromCity="ccu";
	String toCity="dxb";
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	Thread.sleep(3000);
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	WebElement closeAd=driver.findElement(By.xpath("//span[@class='commonModal__close']"));
	jse.executeScript("arguments[0].click()
	driver.findElement(By.xpath(""));)
	
	
	
	
}
}
