package session31;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class program04 {

	public static void main(String[] args) {
		
// parallel stream		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//driver.findElements(By.tagName("a")).stream().filter( e -> !e.getText().isEmpty()).forEach(e -> System.out.println(e.getText()));
		
		
		driver.findElements(By.tagName("a")).parallelStream().filter( e -> !e.getText().isEmpty()).forEach(e -> System.out.println(e.getText()));
		
		
		
		

	}

}

/*

Difference b/w stream & parallel stream
- parallel stream is faster bcoz all the stream are running together whereas in "stream" it is running one-by-one
- 

*/