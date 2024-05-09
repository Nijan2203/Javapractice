package javaSessions;

public class MethodOverloading {

	// method overloading - > within the same class when we have methods with same name but different parameters and sequence of parameters are also different
	// method overloading is a part of poly morphism
	// method overloading is also called complie time poly morphism
	public void login() {
		
	}
	public void login(int a) {
		
	}
	
	public void login (int a, String b) {
		System.out.println("Name is"+b+"age is"+a);
	}
	public void login (String a,String b) {
		System.out.println("First name is"+a +"last name is"+b);
	}

	public static void main(String[] args) {
		
		MethodOverloading a=new MethodOverloading();
		a.login("vicky", "jha");
		a.login(29, "Vicky");
	}

}
