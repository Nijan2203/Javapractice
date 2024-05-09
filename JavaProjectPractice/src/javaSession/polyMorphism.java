package javaSession;

public class polyMorphism {

	// Runtime polymorphism it is a static binding -> Complier will do all the
	// Method overloading
	// process here

	public static void companyInfo(String name) {
		System.out.println("Company name: " + name);
	}

	public void companyInfo(String name, String place) {
		System.out.println("Company name: " + name + " Place: " + place);
	}
	
	

	public static void main(String[] args) {

		polyMorphism ob = new polyMorphism();
		ob.companyInfo("vaken", "Chennai");
//		ob.companyInfo("Infoview");

	}

}
