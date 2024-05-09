package session31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program01 {

	public static void main(String[] args) {
// streams
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		//System.out.println(links.size());
		
		//to print all links
		links.stream().forEach(a -> System.out.println(a.getText()));
		
		// to not print empty links
		links.stream().filter(a ->! a.getText().isEmpty()).forEach( a -> System.out.println(a.getText()));
		
		//to print links starts with "S"
		links.stream().filter(a ->! a.getText().isEmpty()).filter( a -> a.getText().startsWith("S")).forEach(a -> System.out.println(a.getText()));
		
		
		
	}

}
