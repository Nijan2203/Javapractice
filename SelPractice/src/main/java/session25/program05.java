package session25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program05 {

	static WebDriver driver;	
	
	public static void main(String[] args) {
		// to select future date - using generic method
		
		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();

		selectFutureDate("February 2025",30);
		
	}
	
	public static void selectFutureDate(String expMonthYear, int day) {
		if(expMonthYear.contains("February")&&day>29) {
			System.out.println("Please check the day.. and enter correct day");
			return;
		}
		
		
		if(day>31) {
			System.out.println("You have entered wrong date/day..so pls enter correct date/day"+day);
			return;
		}
		
		if(day<=0) {
			System.out.println("You have entered wrong date/day..so pls enter correct date/day"+day);
			return;
		}
		
		String actMonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actMonthYear);
		while(!actMonthYear.equalsIgnoreCase(expMonthYear)) {
			
			//click on next icon
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			actMonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
			}
		selectDate(day);
	}
	public static void selectDate(int day) {
		driver.findElement(By.xpath("//a[text()='" + day + "']")).click();
	}
	
	

}

/*
 
 assignment;
 for leap year feb:29
 for even month: april, june,sep,nov
 
 
 
*/