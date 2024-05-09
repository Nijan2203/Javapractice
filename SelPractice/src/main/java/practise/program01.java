package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program01 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		driver.get("https://qa-kiosta.vaken.cloud/");
		Thread.sleep(3000);
		
		By dmCode=By.id("dm-code-text-input");
		By loginID=By.id("login-id-text-input");
		By pwd=By.id("password-text-input");
		By loginBtn=By.id("login-button");
		By dashbaordLabel=By.xpath("//div[@class='contents-title']/h1");
		By label1=By.xpath("//div[@class='right-columns']/div/h2");
		By laebl2=By.xpath("//h2[@class='title-corner mb15']/a/font");
		By footerLeftLink=By.xpath("//ul[@class='submenu']/li");
		
		doSendElement(dmCode,"M3100001");
		doSendElement(loginID,"shabbari");
		doSendElement(pwd,"info1234");
		
		doClick(loginBtn);
		Thread.sleep(4000);
		String dashLabel=doGetText(dashbaordLabel);
		System.out.println(dashLabel);
		String label01=doGetText(label1);
		System.out.println(label01);
		String label02=doGetText(laebl2);
		System.out.println(label02);
		
		List<WebElement> links=driver.findElements(footerLeftLink);
		System.out.println("Total links"+links.size());
		
		for(WebElement e:links) {
			String list=e.getText();
			System.out.println(list);
		}
		

	}
	
	public static WebElement getlocator(By locator) {
		return driver.findElement(locator);
		
	}
	public static void doSendElement(By locator, String name) {
		getlocator(locator).sendKeys(name);
	}
	
	public static void doClick(By locator) {
		getlocator(locator).click();
	}
	public static String doGetText(By locator) {
		return getlocator(locator).getText();
	}
	
}
