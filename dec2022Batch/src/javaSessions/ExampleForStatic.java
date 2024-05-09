package javaSessions;

public class ExampleForStatic {

	String name;
	String color;
	int price;
	static int wheels=4;
	
	public static void main(String[] args) {
		
		
		ExampleForStatic a=new ExampleForStatic();
		a.name="i20";
		a.color="white";
		a.price=50000;
		
		ExampleForStatic a1=new ExampleForStatic();
		a1.name="bmw";
		a1.color="white";
		a1.price=50000;
		
		ExampleForStatic a2=new ExampleForStatic();
		a1.name="audi";
		a1.color="white";
		a1.price=50000;
		
		System.out.println(a.name+" "+a.color+" "+a.price+" "+wheels);
		
	}

}
