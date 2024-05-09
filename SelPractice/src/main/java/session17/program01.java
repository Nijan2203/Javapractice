package session17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


import static org.openqa.selenium.support.locators.RelativeLocator.with;
//we hav manually written the above import


public class program01 {

	public static void main(String[] args) throws InterruptedException {
	
		// relative locators
		
//sel 4.x:
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.aqi.in/in/dashboard/india/tamil-nadu/chennai");
		Thread.sleep(10000);
		
		// create a base element
		WebElement ele=driver.findElement(By.linkText("Dispur, India"));
	
		// get the element of right from the base
		String rightIndex=driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightIndex);
		
		
		//get the element of left from the base
		String leftIndex=driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftIndex);
		
		//top
		String aboveIndex=driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveIndex);
		
		//below
		String belowIndex=driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowIndex);
		
		//near
		String nearIndex=driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(nearIndex);
		//note: for nearest locator the pixel range is 100 pixel
	}

}
