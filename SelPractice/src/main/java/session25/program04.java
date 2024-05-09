package session25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program04 {
	
	static WebDriver driver;	

	public static void main(String[] args) {
		// to select future date
		
		
		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();

		String actMonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actMonthYear);
		while(!actMonthYear.equalsIgnoreCase("July 2024")) {
			
			//click on next icon
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			actMonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();  // here again we need to capture the actMonth 
			}
			selectDate("25");
	}
	
	public static void selectDate(String day) {
		driver.findElement(By.xpath("//a[text()='" + day + "']")).click();
	}

}

