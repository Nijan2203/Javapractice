package loop;

public class ClassF {

	public static void main(String[] args) {
		// nested loop
		
		for(int i=1;i<=2;i++) {
			for(int j=1;j<=2;j++) {
				System.out.println("Inner loop");
			}
			System.out.println("Outer loop");
		}

	}

}
