package loop;

public class ClassI {

	public static void main(String[] args) {
		// right inverted triangle
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=6-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
