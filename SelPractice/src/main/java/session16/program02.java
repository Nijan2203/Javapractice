package session16;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program02 {

	public static void main(String[] args) throws InterruptedException {
		// multiple window handle
		
WebDriver driver =new ChromeDriver();
		
		driver.get("https://qa-kiosta.vaken.cloud/");
		Thread.sleep(3000);
		
		String parentWindow=driver.getWindowHandle();
		
		
		WebElement link1=driver.findElement(By.xpath("//a[contains(@href,'site-policy')]"));
		WebElement link2=driver.findElement(By.xpath("//a[contains(@href,'terms-and-conditions')]"));
		WebElement link3=driver.findElement(By.xpath("//a[contains(@href,'softbank.jp/corp')]"));
		WebElement link4=driver.findElement(By.xpath("//a[contains(@href,'softbank.jp/privacy')]"));
		link1.click();
		link2.click();
		link3.click();
		link4.click();
		
		Set<String> handles=driver.getWindowHandles();	
		java.util.Iterator<String> it=handles.iterator();
		
		while(it.hasNext()) {
			String windowID=it.next();
			driver.switchTo().window(windowID);
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(3000);
		
			// we are wrinting the below code to not close the parent window
			if(!windowID.equals(parentWindow)) {
			driver.close();
		}
		}
		
		driver.switchTo().window(parentWindow);
		System.out.println("parent window:"+parentWindow);
		

	}

}
