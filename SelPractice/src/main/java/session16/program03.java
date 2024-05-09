package session16;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class program03 {
	
	

	public static void main(String[] args) {
		
		// open another url in new tab/window
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://qa-kiosta.vaken.cloud/");
		String pwid=driver.getWindowHandle();
		
		//below two feature is introduced in sel 4
		
		driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().newWindow(WindowType.WINDOW); to open in new window instead of TAB
		
		driver.get("https://www.google.com");
		System.out.println("child window title"+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(pwid);
		System.out.println("parent window title"+driver.getTitle());
		
		driver.quit();
		
		// randown popup: we cannot handle using selenium
		//solution: we can block these kind of popups in QA environment
		
	}

}
