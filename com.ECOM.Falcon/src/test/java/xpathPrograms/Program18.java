package xpathPrograms;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program18 {
public static void main(String[] args)throws Exception {
	WebElement element=null;
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
    element=driver.findElement(By.xpath("//input[@name='q']"));
	element.sendKeys("i phone 15");
	element.submit();
	Thread.sleep(2000);
	List<WebElement> pNames=driver.findElements(By.xpath("//span[@class='BUOuZu']"));
	Thread.sleep(2000);
	List<WebElement> price=driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
	Thread.sleep(2000);
	Iterator<WebElement> itr=pNames.iterator();
	Iterator<WebElement> itr1=price.iterator();
	while(itr.hasNext())
	{
	    String actualpNames=itr.next().getText();
	    String actualprice=itr1.next().getText();
	    System.out.println(actualpNames+"-------------->"+actualprice);
	}
	driver.close();
}
}
