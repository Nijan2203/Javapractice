package session06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class program05 {

	static WebDriver driver;
	public static void main(String[] args) {
		// print the total img count
		
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> listImg=driver.findElements(By.tagName("img"));
		
		System.out.println(listImg.size());
	}

}
/*

if tagName is given wrong then it will not throw "NoSuchElementException".
it will gv size "0"

difference b/w findElement & findElements
1. findElement returns "webElement" whereas findElements return "list of webElements"
2. if element is not fouund then it returns "NoSuchElementException where it does not
*/