package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browserutil {

	private WebDriver driver;

	public WebDriver launchBrowser(String Browsername) {
		String browsername = Browsername;
		switch (browsername.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Please pass the valid browser..." + Browsername + " is not valid");
			break;
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}

	public void launchURL(String url) {
		driver.get(url);

	}

	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		return pageTitle;

	}

	public void closebrowser() {
		driver.close();
	}

	public void quitbrowser() {
		driver.quit();
	}

}
