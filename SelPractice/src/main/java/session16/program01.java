package session16;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program01 {

	public static void main(String[] args) throws InterruptedException {
		// window handle
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://qa-kiosta.vaken.cloud/");
		Thread.sleep(3000);
		
		
		WebElement link=driver.findElement(By.xpath("//a[contains(@href,'site-policy')]"));
		link.click();
		
		//1. get the window id
		Set<String> win=driver.getWindowHandles();
		java.util.Iterator<String> it=	win.iterator();
		String parentWindow=it.next();
		System.out.println("parent window"+parentWindow);
		String childWin=it.next();
		System.out.println("child window"+childWin);
		
		//2. switching to window
		driver.switchTo().window(parentWindow);
		System.out.println("parent window:"+driver.getCurrentUrl());
		
		Thread.sleep(2000);
		driver.switchTo().window(childWin);
		System.out.println("child window:"+driver.getCurrentUrl());
		
		driver.close(); //close the child window
		//note: the moment we close the window, the driver is lost. and so in the next line we need to mention the target(parent) window 
		
		driver.switchTo().window(parentWindow);
		System.out.println("parent window:"+driver.getCurrentUrl());
		
		driver.quit();
		
	}

}

/*

Question: which property or attribute is used to open in new window?
answer: Target="_blank"

*/