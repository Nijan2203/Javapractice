package session09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class program06 {

	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();

	}

}
