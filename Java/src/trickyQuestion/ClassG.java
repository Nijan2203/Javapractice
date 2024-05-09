package trickyQuestion;

public class ClassG {
	
	//Will static block be executed with final variables	
	//Answer = No	

	public static void main(String[] args) {
		
		System.out.println(main.a);
		System.out.println("============");
		System.out.println(main1.a);
		

	}

}

class main{
	
	public static final int a=200;
	
	static {
		System.out.println("Static block - main");
	}
}

class main1{
	
	public static  int a=200;
	
	static {
		System.out.println("Static block - main1");
	}
	
	
}
