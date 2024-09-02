package xpathPrograms;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program5 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://www.flipkart.com/");
	driver.navigate().to("https://www.flipkart.com/");
	driver.navigate().to("https://www.orangehrm.com/");
	//driver.get("https://www.orangehrm.com/");
	Navigation nav=driver.navigate();
	nav.back();
	nav.forward();
	nav.refresh();

}
}
