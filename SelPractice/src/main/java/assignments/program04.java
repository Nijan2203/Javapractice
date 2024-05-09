package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program04 {

	public static void main(String[] args) {
		
		String browserName="chrome";
		WebDriver driver=null;
		
		switch (browserName) {
		
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Enter the right browser");
		}
		
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		
		if(title.equals("Google"))
			System.out.println("PASS");
		else
			System.out.println("FAIL");
		

	}

}
