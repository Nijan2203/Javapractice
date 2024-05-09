package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program02 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		driver.get("https://qa-kiosta.vaken.cloud/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("dm-code-text-input")).sendKeys("M3123812");
		driver.findElement(By.id("login-id-text-input")).sendKeys("M3123812");
		driver.findElement(By.id("password-text-input")).sendKeys("Info1234");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='デバイス']")).click();
		driver.findElement(By.xpath("//span[text()='利用者情報']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='bulkDelete']")).click();
		
		String title=driver.findElement(By.xpath("//div[@class='contents-title']")).getText();
		System.out.println(title);
		
	}

}
