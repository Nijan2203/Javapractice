package javaSessions;

public class SwitchCaseStatement {

	public static void main(String[] args) {
	//eaxample usage:	
		String browser="chrome";
		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "FF":
			System.out.println("launch FF");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "IE":
			System.out.println("launch IE");
			break;
		default:
		System.out.println(" plz pass the right browser");
			break;
		}

		
		String browser1="Chrome";
		switch (browser1.toLowerCase()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "FF":
			System.out.println("launch FF");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "IE":
			System.out.println("launch IE");
			break;
		default:
		System.out.println(" plz pass the right browser");
			break;
		}
		
		
		String browser2="Chrome ";
		switch (browser2.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "FF":
			System.out.println("launch FF");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "IE":
			System.out.println("launch IE");
			break;
		default:
		System.out.println(" plz pass the right browser");
			break;
		}
		
		//
		int marks=10;
		switch (marks) {
		case 100:
			System.out.println("GRADE A");
			break;

		case 90:
			System.out.println("GRADE B");
			break;
	
		default:
			System.out.println("FAIL");
			break;
		}
		
		}

}
