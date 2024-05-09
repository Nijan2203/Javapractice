package javaSession;

public class StaticMethodVariable {

	String Name;
	static String GSTID = "1564GE47";

	public boolean sample() {
		return true;
	}

	public static void login(String username) {
		System.out.println("Enter login: " + username);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticMethodVariable smv = new StaticMethodVariable();
		smv.Name = "Nijan";
		System.out.println(smv.Name);
		System.out.println(StaticMethodVariable.GSTID);

		boolean r = smv.sample();
		if (r) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		StaticMethodVariable.login("nijan");

		polyMorphism.companyInfo("vaken");

	}

}
