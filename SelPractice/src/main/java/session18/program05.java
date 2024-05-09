package session18;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class program05 {

	public static void main(String[] args) {
		// exceptions
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://qa-kiosta.vaken.cloud/");
		
		driver.findElement(By.xpath("/////[@Input @@@@='test")).sendKeys("1234");
		// answer:Here the xpath format itself wrong and so we get "InvalidSelectorException"
		
		// if syntax is correct then we get "NoSuchElementException"
		//if no alert then we get "NoAlertException"
		//if no frame then we get "NoSuchFrameException"
		
		
		
		

	}

}
