package session31;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program03 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(3000);
		List<WebElement> pricesList=driver.findElements(By.cssSelector("div.inventory_item_price"));
		
		// print all price
		pricesList.stream().forEach( e -> System.out.println(e.getText()));
		
		// remove $ , then convert string to double and print in  sorted order(ascending)
		List<Double> sortedPrice=pricesList.stream().map( e -> Double.parseDouble(e.getText().substring(1)))
		.sorted().collect(Collectors.toList());// $29.99 -> "29.99" -> 29.99
		
		System.out.println(sortedPrice);
		
		
		// decending order
		
		List<Double> sortedPriceDes=pricesList.stream().map( e -> Double.parseDouble(e.getText().substring(1)))
				.sorted(Comparator.reverseOrder()).collect(Collectors.toList());// $29.99 -> "29.99" -> 29.99
				
				System.out.println(sortedPriceDes);
		
		// find 1st element(1st price)
				
			double firstPrice=pricesList.stream().map( e -> Double.parseDouble(e.getText().substring(1)))
						.findFirst().get();
			System.out.println(firstPrice);
			
		// find last element
			double lastPrice=pricesList.stream().map( e -> Double.parseDouble(e.getText().substring(1)))
								.reduce((start, second) -> second).get();
			System.out.println(lastPrice);
			
		// find the max price
			double MaxPrice=pricesList.stream().map( e -> Double.parseDouble(e.getText().substring(1)))
					.max(Double::compareTo).get();
			System.out.println(MaxPrice);
			
			// otherway is  Sort and then get the 1st value and for maximum get the last value
			
			
	}

}
