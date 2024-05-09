package javaSession;

public class StaticMemoryAllocation {


	//3 static
	//3 ns
	//static -- static
	//staic -- NS
	//NS - S
	// NS - NS
	
	public static void login() {
		System.out.println("Login without param");
		StaticMemoryAllocation.login("Nijan");
	}
	
	
	public static void login(String userid) {
		System.out.println("Login with userid");
		StaticMemoryAllocation.login("Nijan", "Info1234");
		
	}
	
	public static void login(String userid, String pwd) {
		System.out.println("Login with userid and password");
		StaticMemoryAllocation obj = new StaticMemoryAllocation();
		obj.dashboard();
		
	}
	
	
	public void dashboard() {
		System.out.println("Dashboard without param");
		StaticMemoryAllocation.login();
	}
	
	public void dashboard(int cnt) {
		System.out.println("Dashboard with count param");
		dashboard("naveen");
	}
	
	public void dashboard(String emp) {
		System.out.println("Dashboard with employee param");	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StaticMemoryAllocation sma = new StaticMemoryAllocation();
		StaticMemoryAllocation.login();
		

	}

}
