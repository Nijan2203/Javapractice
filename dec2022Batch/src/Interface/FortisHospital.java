package Interface;

public class FortisHospital implements USMedical, UKMedical, IndianMedical {

	@Override
	public void orthoServices() {
		// TODO Auto-generated method stub
		
		System.out.println("FH --ortho");
	}

	@Override
	public void physioServices() {
		// TODO Auto-generated method stub
		System.out.println("FH --physio");
	}

	@Override
	public void cardioServices() {
		// TODO Auto-generated method stub
		System.out.println("FH --cadio");
	}

	
	@Override
	public void pediaServices() {
		// TODO Auto-generated method stub
		System.out.println("UK -- pedia");
	}

	@Override
	public void gyncServices() {
		// TODO Auto-generated method stub
		System.out.println("IN--gync");
	}

	@Override
	public void neuroServices() {
		// TODO Auto-generated method stub
		System.out.println("IN--nuero");
	}

	@Override
	public void oncologyServices() {
		// TODO Auto-generated method stub
		System.out.println("IN--oncology");
	}

// owm method
	
	public void pathologyServices() {
		System.out.println("FH--- patho");
	}

	@Override
	public void emergencyServices() {
		// TODO Auto-generated method stub
		System.out.println("US---emergency");
	}
	
	
	
	

}
