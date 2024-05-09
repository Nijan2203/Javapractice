package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mainTest {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		Browserutil butl = new Browserutil();
		driver = butl.launchBrowser("chrome");
		butl.launchURL("https://classic.crmpro.com/index.html");
		butl.getPageTitle();

		ElementUtil eutl = new ElementUtil(driver);

		Thread.sleep(3000);
		By username = By.name("username");
		By password = By.cssSelector("[name='password']");
		By loginbtn = By.className("btn-small");

		eutl.doSendKeys(username, "newAutomation");
		eutl.doSendKeys(password, "Selenium@12345");
		eutl.doclick(loginbtn);

		driver.switchTo().frame("mainpanel");
		
		Thread.sleep(3000);
		By totallink = By.tagName("a");
		By contacts = By.linkText("CONTACTS");

		eutl.getElements(totallink);
		eutl.doclick(contacts);
		
		By dropdown = By.xpath("//select[@name='cs_status']");
		By search = By.cssSelector("input[name='cs_submit'][value='Search']");
		eutl.doselect(dropdown, "Active");
		eutl.doclick(search);
		
		By checkbox = By.xpath("//a[text()='Ali khan']/parent::td/preceding-sibling::td/input[@type='checkbox']");
		eutl.doclick(checkbox);
		By followedtext = By.xpath("//a[text()='Ali khan']/parent::td/following-sibling::td/span[@context='phone']");
		eutl.getElementText(followedtext);
		eutl.navigatebwd();
		Thread.sleep(3000);
		eutl.navigatefwd();
		Thread.sleep(3000);
		eutl.refresh();

//		butl.closebrowser();

	}

}