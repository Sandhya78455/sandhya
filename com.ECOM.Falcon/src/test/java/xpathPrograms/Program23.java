package xpathPrograms;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program23 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		Thread.sleep(3000);

		List<WebElement> all = driver.findElements(By.xpath("//button[contains(@class,'active:bg-green-400')]"));

		for (int i = 0; i <= all.size() - 1; i++) {
			if (i == 0 || i == 3 || i == 7) {
				all.get(i).click();
				Thread.sleep(3000);
			}
		}
		Thread.sleep(3000);
		driver.quit();
		
	}
}
