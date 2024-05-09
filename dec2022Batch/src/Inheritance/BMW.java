package Inheritance;

public class BMW extends car{
	
	@Override
	public void start() {   // method overriding
		System.out.println("BMW -- Start");
	}
	// note: if method is "static" then method overriding is not allowed
	// also "final" class cannot be inheritant or final method cannot be overridden 
	public void autoParking() {
		
		System.err.println(" BMW -- autopark");
	}

}


// method overriding

/*
when we have a parent class having the same method with number and same
number of parameter in child class -- is called method overriding



*/