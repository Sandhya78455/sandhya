package Grooming;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	WebElement element=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	Select s=new Select(element);
	s.selectByIndex(10);
	Thread.sleep(3000);
	WebElement element1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	element.sendKeys("books");
	element1.submit();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']")).click();
	Thread.sleep(3000);
	WebElement element2=driver.findElement(By.xpath("(//input[@value='books'])[1]"));
	element2.sendKeys("books");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath(""));
	
	

}

}