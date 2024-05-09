package DoJo.ConstructorAndEncapsulation;

public class custructorCalling {

	public static void main(String[] args) {

		publicConstructorcall pubcon = new publicConstructorcall(5000);
		System.out.println(pubcon.tax);
		publicConstructorcall pubconup = new publicConstructorcall("indiviual", "2023-2024");
		System.out.println(pubconup.taxtype + " " + pubconup.assyear);

		privateConstructor.test();
		System.out.print("private constructor created");

	}

}
