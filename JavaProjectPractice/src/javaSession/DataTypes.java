package javaSession;

public class DataTypes {

	public static void main(String[] args) {

		// Premetive Data types:
		// numaric: byte, short,int, long
		// Alphabet: char, String
		// boolean: boolean
		// Floating: double, float

		byte a = 127;// -128 to 127
		short b = 32767;// -32768 to 32767
		int c = 1326421684;
		long d = 19884168;

		char e = 'a';
		String f = "10";

		boolean g = true;

		double h = 20.5852986546516854;

		float i = 251.56f;
		float j = (float) 365.354651684;

		System.out.println(a + b + c + d + e + f + g + h + i + j);

		System.out.println(a + b + c + d + e + f);// 1326421684a(65)

	}

}
