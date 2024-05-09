package session10;

public class program01 {

	public static void main(String[] args) {
	/*	
		//xpath: xpath is the address of an element
		//2 types: absolute & relative xpath
		//absolute: /html/body/div[1]/div/section/section/aside/div/span/div/div[1]/div[5]/ul[3]/li/div/ul[1]/li/span
		it is risky. bcoz infuture if new div is added then it wont work
		
		//relative: it is  a custom xpath
		 //tag[@attrb='value']
		  * //input[@name='email']
		  * //input[@id='input-email']
		  * //input[@placeholder='E-Mail Address']
		  
		  with two attribute
		  * //input[@placeholder='E-Mail Address' and @type='text']
		 
		 only tag
		 //tag
		  //input
		  //a
		  //img
		   
		   OR
		    * //input[@placeholder='E-Mail Address' or  @type='text']
		    
		   xpath with text function
		   //tag[text()='value'] 
		    *  //h2[text()='Returning Customer'] 
		    
		    //a[@href]
		    
		     //dynamic attrib
		  ex:
		  <input id=firstname_123>
		  <input id=firstname_456>
		  -> //input[contains(@id,'firstname_')]
		
		//contains with text
		 -> //tag[contains(text(),'value')]
		 //a[contains(text(),'Amazon')]
		  
		//contains with and contains with attribute
		  -> //tag[contains(text(),'value') and contains(@attr,'value')]  
		  //a[contains(text(),'Science') and contains(@href,'amazon.science')]
		   
		//contains with text and attr
		 ->    //tag[contains(text(),'value') and @attr='value']
		 //a[contains(text(),'Science') and @href='https://www.amazon.science']
		  
		 
		 // starts-with text
		  -> //tag[starts-with(text(),'value')]
		  //div[starts-with(text(),'Connect')]
		   
		  // starts-with attrb
		  -> //tag[starts-with(@attrb,'value')]
		  //div[starts-with(@class,'rhf-fra')]
		   
		  // ends-with - xpath is not applicable
		   
		
*/
	}

}
