package session29;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program01 {

	public static void main(String[] args) {
		// zoom in zoom out of a browser
		
		
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://qa-kiosta.vaken.cloud/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		String zoomChrome="document.body.style.zoom = '50%'";
		//note: the above will not work in Firefox		
		
		String zoomFireFox="document.body.style.MozTransform= 'scale(0.5)'";
		
		js.executeScript(zoomChrome);
		
	
		
			
	

		

	}

}
