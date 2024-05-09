package session12;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program02 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// create a utility
		driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		Thread.sleep(4000);
		
		
		driver.findElement(By.name("username")).sendKeys("vickykumarm");
		driver.findElement(By.name("password")).sendKeys("Surajjha@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(4000);

		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(4000);
		
		selectUser("suraj jha");
		selectUser("01Test test");
	String company=	getUserCompany("test 02");
	System.out.println(company);
		
	}

	public static void selectUser(String Username) {
		
		driver.findElement(By.xpath("//a[text()='"+Username+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		
	}
	
	//a[text()='01Test test']/parent::td/following-sibling::td/a[@context='company']
	public static String getUserCompany(String userName) {
		return driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td/a[@context='company']")).getText();
	}
}
