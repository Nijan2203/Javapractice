package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class program03 {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		List<WebElement> listParagraph=driver.findElements(By.tagName("p"));
		System.out.println(listParagraph.size());
		for(int i=0;i<listParagraph.size();i++) {
			String para=listParagraph.get(i).getText();
			System.out.println(para);
		}

	}

}
