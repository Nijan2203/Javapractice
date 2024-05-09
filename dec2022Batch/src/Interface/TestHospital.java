package Interface;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FortisHospital fh=new FortisHospital();
		fh.cardioServices();
		fh.emergencyServices();
		fh.neuroServices();
		fh.oncologyServices();
		fh.orthoServices();
		fh.pathologyServices();
		fh.pediaServices();
		fh.physioServices();
		
		
		USMedical us=new FortisHospital(); // child class object can be referred by parent interface ref variable
		
		
	}

}
