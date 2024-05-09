package constructor;

public class MethodAndConstructor {

	String Name;
	String CmpName;
	int GSTID;

	public MethodAndConstructor(String name, String Cmpname, int GSTID) {
		this.Name = name;
		this.CmpName = Cmpname;
		this.GSTID = GSTID;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodAndConstructor oj = new MethodAndConstructor("Nijan", "Vaken", 867650);

		System.out.println(oj.Name);
	}

}
