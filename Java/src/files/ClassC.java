package files;

import java.io.FileWriter;
import java.io.IOException;

public class ClassC {

	public static void main(String[] args) {
		// writing a file
		try {	
			FileWriter wr=new FileWriter("D:\\File1.txt");
			wr.write("this is a sample");
			wr.write("testing");
			wr.close();
			System.out.println("successfully written");

		}catch(IOException e) {
			System.out.println("An error occurred..");
		}

	}

}
