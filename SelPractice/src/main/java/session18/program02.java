package session18;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class program02 {

	public static void main(String[] args) {
		// pseudo element
/*

example :
website: https://naveenautomationlabs.com/opencart/index.php?route=account/register
target field: manadatory field(*)
		
		if we inspect on mandatory fields we get "::before" and that is pseudo element
		
		
		
 */
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		String script="return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('content')";
		//note: here we are additioanlly written "return"
		
		String mandatroy_field=js.executeScript(script).toString();
		System.out.println(mandatroy_field);
		
		if(mandatroy_field.contains("*")) {
			System.out.println("this is a mandatory field");
		}
		

	}

}
