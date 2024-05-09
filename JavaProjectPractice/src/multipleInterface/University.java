package multipleInterface;

public class University extends Collage implements DemmedUniversity, AnnaUniversity {

	public void syelabus() {
		System.out.println("University Class syelabus");
	}

	@Override
	public void paymentexam() {
		// TODO Auto-generated method stub
		System.out.println("University Class paymentexam");
	}

//	@Override
//	public void dresscode() {
//		// TODO Auto-generated method stub
//		System.out.println("University Class dresscode");
//	}

	@Override
	public void attendance() {
		// TODO Auto-generated method stub
		System.out.println("University Class attendance");

	}

}
