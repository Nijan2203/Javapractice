package session18;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class program04 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://qa-kiosta.vaken.cloud/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("dm-code-text-input")).sendKeys("M9999999");
		driver.findElement(By.id("login-id-text-input")).sendKeys("karthick");
		driver.findElement(By.id("password-text-input")).sendKeys("info1234");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='menu']/div[3]/span")).click();
		Thread.sleep(2000);
		
		//1. What will happen if we try to input in disable input field
		//driver.findElement(By.id("app_devices-text-input")).sendKeys("123");
		// Answer:elementNotInteractableException -> if we try to enter value in disable field
		
		//2. What will happen if we try to click disable button
		driver.findElement(By.xpath("//div[@id='menu']/div[2]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btn_ok")).click();
		// Answer: elementClickInterceptedException
		
	}

}
