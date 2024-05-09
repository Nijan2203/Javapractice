package files;

import java.io.File;
import java.io.IOException;

public class ClassA {

	public static void main(String[] args) {
		// Create a file
		
				File f=new File("D:\\File.txt");

				try {
					if(f.createNewFile()) 
						System.out.println(f.getName());
					else
						System.out.println("file already exists");
				} catch (IOException e) {
					System.out.println("An error occurred");
				}
				

	}

}
