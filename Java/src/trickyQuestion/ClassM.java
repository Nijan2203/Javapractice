package trickyQuestion;

public class ClassM {

	String name;
	static int age;
	
	static {
		ClassM name=new ClassM();
		name.name="vicky";
		age=29;
		System.out.println(name+ " "+age);
	}
	
}
