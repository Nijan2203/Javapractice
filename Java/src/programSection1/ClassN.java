package programSection1;

public class ClassN {

	public static void main(String[] args) {
		// fibonacci
		
		int n1=0;
		int n2=1;
		int n3;
		int count=10;
		
		for(int i=0;i<count;i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}

	}

}
