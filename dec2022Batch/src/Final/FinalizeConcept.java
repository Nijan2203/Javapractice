package Final;

public class FinalizeConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalizeConcept obj= new FinalizeConcept();
		obj=null;
		System.gc();	
		
		System.out.println("Bye!!");
	}
	
	@Override
	public void finalize() {
		System.out.println(" inside the finalize method");
		
		
	}

}
// gargabe collector will destroy object having no object/ null reference. 
// willl be called using system.gc method
// finalize method wll be called automaitclly from the respective class** before destroying the object by garbage collector i
// practical example: we do not use in selenium. 
// garbage collector will destroy object only for the declared class