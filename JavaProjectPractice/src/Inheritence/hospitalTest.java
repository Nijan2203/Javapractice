package Inheritence;

public class hospitalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		apolloHospial apollo = new apolloHospial();
		apollo.regulation();
		apollo.admission();
		apollo.Heartcheckup();
		apollo.fullBodyCheckUp();
		apolloHospial.payment();
		
		
		
		
		System.out.println("----------------------------------------");
		AgrwalHospital agrwal = new AgrwalHospital();
		agrwal.regulation();
		agrwal.admission();
		agrwal.fullBodyCheckUp();
		agrwal.eyeCheckup();
		AgrwalHospital.payment();
		
		
		System.out.println("----------------------------------------");
		Hospital hosp = new Hospital();
		hosp.admission();
		
		System.out.println("----------------------------------------");
//		Top Casting 
		Hospital hos = new apolloHospial();
		hos.admission();
		hos.fullBodyCheckUp();
		Hospital.payment();
		
		WHO who = new AgrwalHospital();
		who.regulation();
		
	}

}
