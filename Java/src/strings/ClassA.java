package strings;

public class ClassA {


	/*
	 
	  Strings in Java
	  
	  4 ways to create a string
	  
	  1. Character array/arrayList
	  
	  char []a ={'v','i','c','k','y'};
	  
	  2. String class
	  
	  String s = "vicky";
	  or
	  String s=new String ("vicky"):
	  
	  3. StringBuffer class
	  
	  StringBuffer s= new StringBuffer("vicky");
	  
	  4. StringBuilder class
	  
	  StringBuilder s= new StringBuilder("vicky");
	  
Notes:

	  1. String,StringBuffer and StringBuilder hv more feature like substring,concatinate etc which are not available in Character array/arrayList.
	  2. We have 3 string class(String,StringBuffer and StringBuilder) because
	  - Strings are immutable. it is the content of a string cannot be changed. So Strings are automatically threadSafe
	  - StringBuffer and StringBuilder are mutable. 
StringBuffer:	  
	  - StringBuffer are threadSafe . 
	  - ThreadSafe means we can use it in multi threaded environment.We have a shared object of an string when used in multi threaded environment
StringBuilder	  
	  - StringBuilder are not threadSafe
	  - It used only within a thread
	  
Usage:
 1. If we are writing single threaded program which require mutable string then we use StringBuilder
 2. If we are writing multi threaded program which require mutable string then we use StringBuffer
 3. If we need immutable string then we use String.	  
 

*/
}