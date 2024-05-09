package session02;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Program01 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		// driver.manage().window().fullscreen(); taskbar are not visible (or) some
		// monitor wil hv large screen size . it is fit into it

		// to delete cookie
		driver.manage().deleteAllCookies();

		// to get url-it gives string of current URL of where the browser is focus
		driver.getCurrentUrl();
		String url = driver.getCurrentUrl();
		System.out.println(url);

		// to get current page source
		String source = driver.getPageSource();
		System.out.println(source);

		driver.quit();
	}
}
