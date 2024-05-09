package session09;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class program07 {

	public static void main(String[] args) {
		// forward backward
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.geeksforgeeks.org/performance-testing-software-testing/?ref=lbp"); // we can also use "get" method
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
	}

}

/*
 diff b/w get & to
 both used to open the browser
 even if i call "to" method, "get" method is called . Note: it s a code logic. internally it is written
 only minor difference is,
 
 "to" method is of two types, "string" & "url".
 whereas "get" method takes only "string" type url
 
  
 
 */
