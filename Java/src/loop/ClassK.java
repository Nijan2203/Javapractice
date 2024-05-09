package loop;

public class ClassK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		for(int i=5;i>0;i--) {
			for(int j=5-i;j>0;j--) {  // j=4 3 2 1    => .  
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		}

}
