package javaSession;

import java.util.Arrays;

public class Arrayconcepts {

	public static void main(String[] args) {
		// WAP to delete a specific number from the given array.
//                int p[] = {1,4,5,2,3,22,31, 2}; 
//				  Need to remove 22 from the p[] array.
//				  output should be: [1, 4, 5, 2, 3, 31, 2]

		int p[] = { 1, 4, 5, 2, 3, 22, 31, 2 };
		int q[] = new int[p.length - 1];
		int j = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i] != 22) {
				q[j] = p[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(q));

//		Write a program to create a static Array, having following cricket data:
//
//			                        --name, age, team name, DOB, gender, Strike Rate
//
//			                        --Try to create multiple Object Arrays for different players 
//
//			                        --Try to print all the values of each player on the console

		Object obj[] = new Object[6];
		obj[0] = "Virat";
		obj[1] = "35";
		obj[2] = "India";
		obj[3] = "1990";
		obj[4] = 'M';
		obj[5] = 54.20;

		Object obj1[] = new Object[6];
		obj1[0] = "Sachin";
		obj1[1] = "44";
		obj1[2] = "India";
		obj1[3] = "1980";
		obj1[4] = 'M';
		obj1[5] = 48.20;

		// for(int i=0; i<=obj.length-1; i++)
		System.out.println("Name: " + obj[0] + " Age: " + obj[1] + " Team Name: " + obj[2] + " DOD: " + obj[3]
				+ " Gender: " + obj[4] + " SR: " + obj[5]);
		System.out.println("Name: " + obj1[0] + " Age: " + obj1[1] + " Team Name: " + obj1[2] + " DOD: " + obj1[3]
				+ " Gender: " + obj1[4] + " SR: " + obj1[5]);

	}

}
