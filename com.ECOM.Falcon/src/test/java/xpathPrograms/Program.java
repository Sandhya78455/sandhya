package xpathPrograms;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Program {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win32\\chromedriver.exe");

	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/");
	Thread.sleep(3000);
    driver.findElement(By.xpath("//section[text()='Link']")).click();
    Thread.sleep(3000);
    List<WebElement> allLinks = driver.findElements(By.xpath("//a[@class='text-white hover:text-slate-300 text-[14px]']"));
    Iterator<WebElement> itr=allLinks.iterator();
    while(itr.hasNext())
    {
    	Thread.sleep(3000);
    	String values=itr.next().getText();
    	System.out.println(values);
    }
}
}
