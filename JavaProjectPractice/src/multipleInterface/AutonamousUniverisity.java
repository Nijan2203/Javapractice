package multipleInterface;

public interface AutonamousUniverisity {
	
	
	public void paymentexam();
	
	
	public void attendance();
	
	public static void test() {
		System.out.println("Test method from AutonamousUniversity");
	}
	
	default void test1() {
		System.out.println("sosy");	
	}

}
