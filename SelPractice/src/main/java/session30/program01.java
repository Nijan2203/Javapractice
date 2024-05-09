package session30;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class program01 {

	public static void main(String[] args) {
		// headless browser
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		//co.addArguments("--headless");
		co.addArguments("--incognito");
		
		// note: we can use anyone from above
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://qa-kiosta.vaken.cloud/");
		
		System.out.println(driver.getTitle());
		driver.close();
		
		/*
		 "ChromeOptions class is used.
		 and there are two argument
		 
		 */
		
	}

}
