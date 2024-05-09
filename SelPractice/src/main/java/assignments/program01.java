package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program01 {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By fistName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.name("email");
		By tel = By.xpath("//*[@id=\"input-telephone\"]");
		By pwd = By.cssSelector("#input-password");
		By conPwd = By.name("confirm");
		By agrChkBox = By.name("agree");
		By conBtn = By.cssSelector("#content > form > div > div > input.btn.btn-primary");
		By result = By.tagName("h1");

		ElementUtil eu=new ElementUtil(driver);
		eu.doSendkeys(fistName, "test");
		eu.doSendkeys(lastName, "test123");
		eu.doSendkeys(email, "test9181@gmail.com");
		eu.doSendkeys(tel, "8124471876");
		eu.doSendkeys(pwd, "test123");
		eu.doSendkeys(conPwd, "test123");
		eu.doClick(agrChkBox);
		eu.doClick(conBtn);
		String res = eu.doElementGetText(result);

		if (res.equals("Your Account Has Been Created!"))
			System.out.println("PASS");
		else
			System.out.println("FAIL");
		
		driver.close();
	}
}
