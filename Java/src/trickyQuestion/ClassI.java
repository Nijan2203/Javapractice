package trickyQuestion;

public class ClassI {

	static {
		System.out.println("Static block-1");
	}

	static {
		System.out.println("Static block-2");
	}

	static {
		System.out.println("Static block-3");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main method");

	}

	static {
		System.out.println("Static block-4");
	}
}
/*
Question: Explain static block

Q1: When static block get executed ?
ans: Before main method

Q2: Can we have multiple static block ?
ans: Yes

Q3: Can we write static block before and after main method ?
ans: Yes


*/