package loop;

public class ClassJ {

	public static void main(String[] args) {
		// left triangle star pattern using nested for loop

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
