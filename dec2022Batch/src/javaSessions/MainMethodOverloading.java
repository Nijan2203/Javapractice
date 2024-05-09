package javaSessions;

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("Hello world");

		main();
		main(10);
	}
	
	public static void main() {
		System.out.println("method 1");
	}
	public static void main(int a) {
		System.out.println(a);
	}

}
