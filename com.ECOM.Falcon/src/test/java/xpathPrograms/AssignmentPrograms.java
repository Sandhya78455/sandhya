package xpathPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentPrograms {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win32\\chromedriver.exe");

	
	//WebElement element=null;
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
    Thread.sleep(3000);
    Actions act=new Actions(driver);
    WebElement element=driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
    Thread.sleep(3000);
    WebElement element1=driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
	act.dragAndDrop(element,element1).perform();
    WebElement   element2=driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
	Thread.sleep(3000);
    WebElement element3=driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
	act.dragAndDrop(element2,element3).perform();

	Thread.sleep(4000);
	driver.quit();
}
}
