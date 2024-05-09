package trickyQuestion;

public class ClassD {
	

	//what is the output if we use long number with L	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long longNumberWithoutL = 1000 * 60 * 60 * 24 * 365;
		long longNumberWithL = 1000 * 60 * 60 * 24 * 365L;

		System.out.println(longNumberWithoutL);
		System.out.println(longNumberWithL);

	}

}


/*
31536000000  output is a 36 bits and interger in java accepts 32 bits only.


*/