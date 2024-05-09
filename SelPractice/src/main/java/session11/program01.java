package session11;

public class program01 {

	public static void main(String[] args) {
		
	/*
		 
		websites:
	1. https://naveenautomationlabs.com/opencart/index.php?route=account/register
	2. https://www.amazon.in/
	3. https://app.hubspot.com/login
		
		 //position or index in xpath
		  (//input[@class='form-control'])[2]
		  (//input[@class='form-control'])[position()=2]
		
		//last
		 (//input[@class='form-control'])[last()]
		 (//input[@class='form-control'])[last()-1]
	Question: 	In "https://www.amazon.in/" , find the xpath of "help"
	hint: we know that "help" should always be at the last
	answer: (//div[contains(@class,'navFooterLinkCol')][last()]//a)[last()]
		
		
		//class in locator: className, xpath, css
		 if the class name are multiple. reference website https://app.hubspot.com/login
		
		//input[@class='form-control private-form__control login-email'] -> valid
		//input[@class='private-form__control'] -> not valid bcoz we have use all values
		
		 By.className("form-control private-form__control login-email") -> not valid bcoz only one call is allowed
		 By.className("form-control") -> valid
		 
		 
		 //parent child
		  
		  //how to traverse backward direction in xpath
		   -> //input[@id='input-email']/../..
		  
		  //siblings
		   BACKWARD:
		   -> //input[@id='input-email']/preceding-sibling::label
		   FORWARD:
		   -> //label[@for='input-email']/following-sibling::input
		   (or)
		   -> //label[@for='input-email']/following-sibling::input[@name='email']
		   
		   
		   //dynamic webtable
		    
		    website:https://classic.freecrm.com/
		   
		   Question: check the checkbox  -> backward direction
		   -> //a[text()='Ali khan']/../preceding-sibling::td/input[@type='checkbox']
			or
			//a[text()='Ali khan']/parent::td/preceding-sibling::td/input[@type='checkbox'] 
		   
		    Question: get the 3rd column(Company)  -> forward direction
		    (//a[text()='Ali khan']/parent::td/following-sibling::td)[position()=1]/a
		   
		 	Question: example for ancestor
		 	//a[text()='Ali khan']/ancestor::td/following-sibling::td/input[@type='checkbox']  
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 */
		
		

	}

}
