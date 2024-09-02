package xpathPrograms;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
public static void main(String[] args) {
	String expectedData = "flipkart";
	//step1 : launching browser
	ChromeDriver driver = new ChromeDriver();
	//step2 : access web app
	driver.get("https://www.flipkart.com/");
	String actualData = driver.getCurrentUrl();
	if(actualData.contains(expectedData))
	{
		System.out.println("accessed flipkart successfully");
	}
	else
	{
		System.out.println("not accessed!!!");
	}
}
}
