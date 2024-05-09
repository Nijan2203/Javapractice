package session25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program01 {

	public static void main(String[] args) {
		// calender handling
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		//selecting day from the current month
		
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//a[text()='7']")).click();
		

	}

}
