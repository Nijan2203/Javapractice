package arrays;

public class ClassQ {

	public static void main(String[] args) {
		// Print smallest and largest number in mult dimentional array	
		
		int abc[][]= {{2,4,5},{3,4,7},{15,2,9}};
		int min=abc[0][0];
		
		for(int i=0;i<abc.length;i++) {
			for(int j=0;j<abc.length;j++) {
				if(abc[i][j]<min) {
					min=abc[i][j];
				}
			}
		}
		System.out.println(min);

	}

}
