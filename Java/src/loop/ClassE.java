package loop;

public class ClassE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" for loop");
		int number=5;
		for(int i=1;i<=10;i++) {
			System.out.println(i*number);
		}
		
		System.out.println(" while loop");
		int j=1;
		while(j<=10) {
			System.out.println(j*number);
			j++;
		}
		
		System.out.println("do while loop");
		int k=1;
		do {
			System.out.println(k*number);
			k++;
		}while(k<=10);
	}

}
