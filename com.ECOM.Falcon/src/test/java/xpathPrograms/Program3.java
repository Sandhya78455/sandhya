package xpathPrograms;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {
public static void main(String[] args) {
	String expectedTitle="Orange";
	String expectedUrl="Orangehrmlive";
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.orangehrm.com/");
	driver.manage().window().minimize();
	driver.manage().window().maximize();
	
	String actualTitle=driver.getTitle();
	String actualUrl=driver.getCurrentUrl();
	if(actualTitle.contains(actualTitle) && actualUrl.contains(expectedUrl))
	{
		System.out.println("Orangehrm home page displayed successfully!!! ");
	}
	else
	{
		System.out.println("not displayed!!!");
	}
	driver.close();
}
}
