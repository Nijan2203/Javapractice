package session25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program02 {

	static WebDriver driver;

	public static void main(String[] args) {
		// selecting day from the current month - Using generic method

		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		selectDate("25");
	}

	public static void selectDate(String day) {
		driver.findElement(By.xpath("//a[text()='" + day + "']")).click();
	}
}
