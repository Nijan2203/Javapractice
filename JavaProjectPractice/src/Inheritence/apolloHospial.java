package Inheritence;

public class apolloHospial extends Hospital {
	
	@Override
	public void admission() {
		System.out.println("Apollo Hospital Admission");
	}

	//Method Hiding
	public static void payment() {
		System.out.println("Apollo Hosipital Payment");
	}

	public void Heartcheckup() {
		System.out.println("Apollo Heart Check up");
	}

}
