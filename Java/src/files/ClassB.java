package files;

import java.io.File;
import java.io.IOException;

public class ClassB {

	public static void main(String[] args) throws IOException {
	// get file details
		
		File obj=new File("D:\\File.txt");
		obj.createNewFile();
		if(obj.exists()) {
			System.out.println(obj.getAbsolutePath());
			System.out.println(obj.getName());
			System.out.println(obj.canWrite());
			System.out.println(obj.canRead());
		}
		else
				System.out.println("File not exists");



	}

}
