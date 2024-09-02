package xpathPrograms;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Program19 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.makemytrip.com/");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//span[text()='Departure']"));
    Thread.sleep(3000);
    String text=driver.findElement(By.xpath("))
   
}
}
