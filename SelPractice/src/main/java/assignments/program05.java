package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class program05 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();

		Alert alert = driver.switchTo().alert();
		String message = alert.getText();
		System.out.println(message);

		String expectedMessage = "Please enter a valid user name";

		if (message.equals(expectedMessage)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		Thread.sleep(3000);
		alert.accept();

		driver.findElement(By.id("login1")).sendKeys("vickykumar");
		driver.findElement(By.name("proceed")).click();

		Alert alert1 = driver.switchTo().alert();
		String message1 = alert1.getText();
		System.out.println(message1);

		String expectedMessage1 = "Please enter your password";
		if (message1.equals(expectedMessage1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		Thread.sleep(3000);
		alert.accept();

	}

}
