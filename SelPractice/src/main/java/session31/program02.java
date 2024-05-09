package session31;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program02 {

	public static void main(String[] args) {
		// to collect
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		
	List<WebElement> li=	links.stream().filter(a ->! a.getText().isEmpty()).filter( a -> a.getText().startsWith("S")).collect(Collectors.toList());

	List<String> Text=li.stream().map(e -> e.getText()).collect(Collectors.toList());
			System.out.println(Text);
	
	}

}

/*

Use stream when we hv small number of data to avoid performance issue.

*/