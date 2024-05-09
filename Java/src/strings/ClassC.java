package strings;

public class ClassC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="vicky";
		String s2="vicky";
		if(s1==s2) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
		String s3=new String("vicky");
		if(s1==s3)
			System.out.println("same");
		else
			System.out.println("not same");
		
	}

}