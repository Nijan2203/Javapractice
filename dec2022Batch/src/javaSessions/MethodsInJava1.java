package javaSessions;

import java.util.ArrayList;

public class MethodsInJava1 {

	String name;
	int empCount;
	
	public String getCEONmae() {
		return "vicky";
	}
	
	public int getTotalCount() {
		System.out.println("total count");
		int totalShare=2000;
		return totalShare;
	}
	
	
	public String[] getCoFounder() {
		System.out.println("get founders");
		String founders[]=new String [3];
		founders[0]="vicky";
		founders[1]="kumar";
		founders[2]="jha";
		return founders;
	}
	
	
	
	
	public ArrayList<String> getCustomerList() {
		System.out.println("get customer list");
		
		ArrayList<String> ar=new ArrayList<String> ();
		ar.add("suraj");
		ar.add("jha");
		return ar;
		
		
	}
	
	public static void main(String[] args) {
		
		MethodsInJava1 a=new MethodsInJava1();
		System.out.println(a.getCEONmae());
		
		int b=a.getTotalCount();
		System.out.println(b);
		
		String c[]=a.getCoFounder();
		System.out.println(c.length);
		for(String e:c) {
			System.out.println(e);
		}
		
		ArrayList<String> d=a.getCustomerList();
		System.out.println("total customer"+d.size());
		
		for(String e :d) {
			System.out.println(e);
		}
		
		ArrayList<String> emp = a.compName("Infoview");
		System.out.println(emp);
		
	}
	
	
	// WAF:
			// supply input param: Company Name (String): IBM, MS, Google
			// return : the list of employee of the comp: ArrayList<String>
		
		public ArrayList<String> compName(String CmyName) {
			ArrayList<String> cmpname = new ArrayList<String>();
			System.out.println("Company Name: "+ CmyName);
			if(CmyName.equalsIgnoreCase("IBM")) {
				cmpname.add("Ravi");
				cmpname.add("Nijan");
				cmpname.add("raj");
			}else if(CmyName.equalsIgnoreCase("Infoview")) {
				cmpname.add("Nancy");
				cmpname.add("Tom");
			}
			return cmpname;
		}

}
