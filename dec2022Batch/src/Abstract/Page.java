package Abstract;

public abstract class Page {
	
	// cannot create object of abstract class
	
	public abstract void title();  // abstract method
	public abstract void url();
	public abstract void loading();
	
	public Page() {  // we can create a constructor in abstract class
		System.out.println("Page constructor");
	}

	public void header() {
		System.out.println("Page header");
	}
	
	public static final void logo() {
		System.out.println("Page Logo");
	}
	
	
}
