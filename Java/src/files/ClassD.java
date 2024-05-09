package files;

import java.io.File;
import java.util.Scanner;

public class ClassD {

	public static void main(String[] args) {
	// Reading a file
		
		try {
			
			File obj=new File("D:File1.txt");
			Scanner sc=new Scanner(obj);
			while(sc.hasNextLine()) {
				String content=sc.nextLine();
				System.out.println(content);
			}
			sc.close();
			
		}catch(Exception e) {
			System.out.println("an error occurred");
		}


	}

}
