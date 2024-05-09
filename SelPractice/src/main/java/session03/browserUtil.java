package session03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserUtil {

	private WebDriver driver;
	// we have given "private" .reason explained in "Test" class line:13

	public WebDriver initDrivaer(String browserName) {

		System.out.println("Browser name is: " + browserName);

		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("pls enter the right browser");
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;
	}

	public void launchURL(String url) {
		if (url == null) {
			System.out.println("url cannot be null");
		}
		if (url.indexOf("https") == 0) {
			driver.get(url);
		}
		else
			System.out.println("https is not given in the url");
	}

	public String getTitle() {
		String title = driver.getTitle();
		System.out.println("page title is:" + title);
		return title;
	}

	public String getPageURL() {
		String url = driver.getCurrentUrl();
		System.out.println("page url is:" + url);
		return url;
	}

	public void closeBrowser() {
		if (driver != null) {
			driver.close();
		}
	}

	public void quitBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}

}
