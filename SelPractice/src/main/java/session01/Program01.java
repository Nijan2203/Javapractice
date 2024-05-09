package session01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class Program01 {

	public static void main(String[] args) {

		// 1. open browser

		String browserName = "chrome";
		WebDriver driver = null;

		// cross browser logic
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("pls enter the right browser");
		}

		// 2. enter url
		driver.get("https://www.google.com/");

		// 3. get title
		String title = driver.getTitle();
		System.out.println("title is:" + title);

		// validation
		if (title.equals("Google"))
			System.out.println("PASS");
		else
			System.out.println("FAIL");
		
		//4. close
		driver.close();
	}
}

/*

// from 4.6.0, "selenium manager" will take care .exe file. so need to hv a chrome driver exe file
*/