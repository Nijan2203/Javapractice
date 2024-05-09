package session05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsInSelenium {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//1.id - unique
		//driver.findElement(By.id("input-email")).sendKeys("surajjha.virat@gmail.com");
		
		//2.name - can be duplicate
		//driver.findElement(By.name("email")).sendKeys("surajjha.virat@gmail.com");
		//By email=By.name("email");
		
		//3. class name - duplicate most of the time.
		//in the above website, class name are duplicate - so not recommended
		//class name can be used only if it is not duplicate
		//driver.findElement(By.className("form-control")).sendKeys("surajjha.virat@gmail.com");
		
		//4.xpath: it is not an attribute. its the address of an element in html DOM
		//driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("surajjha.virat@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
		
		//By emailID=By.xpath("//*[@id=\"input-email\"]");
		//By click=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");

		//doSendkeys(emailID,"surajjha.virat@gmail.com");
		//doClick(click);
		
		// 5.css selector-not an attibute
		//driver.findElement(By.cssSelector("#input-email")).sendKeys("surajjha.virat@gmail.com");
		
		//6. linkTest: only for link -> html tag:a
		//driver.findElement(By.linkText("Register")).click();
		
		//By regLink=By.linkText("Register");
		//doClick(regLink);
		
		//7.partialLinkedTest: only for links
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//8.tagName:html tag
	String header=	driver.findElement(By.tagName("h2")).getText(); // h2 is the html tag for the text "New Customer"
	System.out.println(header);
		
// there is no point in comparing all the 5 locators 
	// bcoz 1st three are attribute and other 2 are not.
	
	// getText
	
By addText=	By.linkText("Address Book");
String addtext=doElementGetText(addText);
System.out.println(addtext);
	}
	
public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}

	public static void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static String doElementGetText(By locator) {
		return getElement(locator).getText();
	}

}

/*
ID or name : ID is preferred bcz ID cannot be duplicate . each web element wil hv unique id
"name" can be duplicate

xpath or CSS: when we hv a more number of web element ex:5000 then we can find the difference that css is faster than xpath
but for less inputs then both are almost same

linkTest or partialLink: Wil go with linkedtest. it is not an attrbute. its a text
*/