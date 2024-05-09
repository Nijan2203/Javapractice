package session06;

import org.openqa.selenium.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program04 {

	static WebDriver driver;

	public static void main(String[] args) {
		// find total links on the page
		// print the text of each links
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//find links
	List<WebElement> linksList=	driver.findElements(By.tagName("a"));
	int totalLinks=linksList.size();
	System.out.println("Total links: "+totalLinks);
	
	// print text of each links
	
	for(int i=0;i<totalLinks;i++) {
		String text=linksList.get(i).getText();
		System.out.println(i+":"+text);
		// we will get some blank links
	}
	
	//do  not print blank links
	
	for(int j=0;j<totalLinks;j++) {
		String text=linksList.get(j).getText();
		if(text.length()>0)
			System.out.println(j+":"+text);
	}
	
	//for each
	int count=0;
	for(WebElement e:linksList) {
		String text=e.getText();
		if(text.length()>0) {
			System.out.println(count+ ":"+text);
		}
		count++;
	}
	
	}

}

/*
findElement will return "webElement"
findElements will return "list of webelement"

*/