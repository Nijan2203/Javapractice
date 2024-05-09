package session26;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class program01 {

	public static void main(String[] args) throws InterruptedException {
		// requirement : to input multiple characters in the input field
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://qa-kiosta.vaken.cloud/");
		Thread.sleep(3000);
		
		
		WebElement dmCode=driver.findElement(By.id("dm-code-text-input"));
		
		StringBuilder sb=new StringBuilder();
		sb.append("01");
		sb.append(" ");
		sb.append("02");
		sb.append(" ");
		sb.append("03");
		
		String space=" ";
		
		StringBuilder sb1=new StringBuilder();
		sb.append("04");
		sb.append(" ");
		sb.append("05");
		
		dmCode.sendKeys(sb, space,sb1,Keys.TAB);
		

	}

}
