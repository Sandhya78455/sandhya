package xpathPrograms;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win32\\chromedriver.exe");

	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.orangehrm.com/");
	driver.manage().window().maximize();
	
	//driver.manage().window().setSize(new Dimension(300,400));
	Dimension d=new Dimension(300,400);
	driver.manage().window().setSize(d);
	
	//driver.manage().window().setPosition(new point (100,200));
	Point p=new Point(100,200);
	driver.manage().window().setPosition(p);
}

}
