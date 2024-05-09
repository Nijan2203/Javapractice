package session15;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program01 {

	public static void main(String[] args) throws InterruptedException {
		// JS alert : simple alert, prompt and confirmation alert
		// auth pop up
		// browser window pop or adversiment pop
		// file upload pop
		
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		//1. alert pop up
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		
		Alert alert =driver.switchTo().alert();
		// if no alert present then it will throw "NoAlertPresentException: no such alert"
		String message=alert.getText();
		System.out.println(message);
		
		alert.accept();
		//alert.dismiss(); "esc" button action
		
		//2. confirmation pop up
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		
		Alert alert1 =driver.switchTo().alert();
		String message1=alert1.getText();
		System.out.println(message1);
		
		alert1.accept();
		Thread.sleep(3000);
		
		//3.prompt
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		
		Alert alert2 =driver.switchTo().alert();
		alert2.sendKeys("vicky");
		Thread.sleep(3000);
		alert2.accept();

// note: there cannot be two pop up at a same time
		
		
		
		
		

	}

}
