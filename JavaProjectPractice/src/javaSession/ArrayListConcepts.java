package javaSession;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListConcepts {

	public static void main(String[] args) {

//			Write a Java program to create a new array list, which contains all color names.
//
//			                 --add some colors (string) 
//
//			                ---and print out the colorslist using loops.

		ArrayList<String> col = new ArrayList<String>();
		col.add("Red");
		col.add("Orange");
		col.add("Blue");
		col.add("Yellow");

		for (int i = 0; i < col.size(); i++) {
//				System.out.println("Colors in the Array list:");
			System.out.println(col.get(i));
		}

//			Write a Java program to retrieve an element at a specified index from a given array list.

		System.out.println(col.get(2));

//			Write a Java program to update specific array element by given element.
		System.out.println(col.set(2, "Green"));
		System.out.println(col);

//			Write a Java program to remove the third element from an array list. 

		col.remove(0);
		System.out.println(col);

		System.out.println("-----------------------------------------");
//			Write a Java program to search an element in an array list using for loop. Once we find that element, break the loop.

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Audi");
		cars.add("RR");
		cars.add("Honda");

		for (int i = 0; i < cars.size(); i++) {
			if (cars.get(i).equals("RR")) {
				System.out.println("RR has found");
				break;
			} else {
				System.out.println(cars.get(i));
			}
		}

//			Reverse this array List:

		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("Varun");
		studentNames.add("Reena");
		studentNames.add("Naveen");
		studentNames.add("Robin");
		studentNames.add("Peter");
		
		
		

		Collections.reverse(studentNames);
		System.out.println(studentNames);

		ArrayList<String> reverse = new ArrayList<String>();
		
		for(int i=studentNames.size()-1; i>=0; i--) {
			reverse.add(studentNames.get(i));
		}
		System.out.println(reverse);

//				7. Write a Java program to extract a portion of an array list.

		ArrayList<String> protion = new ArrayList<String>(studentNames.subList(0, 3));
		System.out.println(protion);

//			8. Write a Java program to empty an array list.
		studentNames.clear();
		System.out.println(studentNames);

//			9. Write a Java program to trim the virtual capacity of an array list the current list size.

		ArrayList<Integer> Num = new ArrayList<Integer>();

		Num.add(10);
		Num.add(20);
		Num.add(30);
		Num.add(40);

		System.out.println(Num.size());
		Num.trimToSize();
		System.out.println(Num.size());

		ArrayList<String> colors = new ArrayList<String>(10);
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
//			colors.trimToSize();
		System.out.println(colors.size());

//			10. Write a Java program to print all the elements of an ArrayList using the position of the elements.

		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Vaken");
		ar.add("Infoview");
		ar.add("Wipro");
		ar.add("IBM");

		for (int i = 0; i <= ar.size() - 1; i++) {
			System.out.println("List of values in the array index " + i + " is " + ar.get(i));
		}

	}
}
