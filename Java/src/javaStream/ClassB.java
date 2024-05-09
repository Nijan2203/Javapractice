package javaStream;

import java.util.Arrays;
import java.util.List;

public class ClassB {

	public static void main(String[] args) {
		// if input is string
		String [] name = {"vicky","vikram","ram","ravi","murthy","viraj","vicky","viraj","kapil"};
		
		List <String> s=Arrays.asList(name);
		s.stream().distinct().forEach(x -> System.out.println(x));// removes duplicate
		s.stream().distinct().sorted().forEach(x -> System.out.println(x));
		s.stream().distinct().sorted().map(b ->b.toUpperCase()).forEach(x -> System.out.println(x));
		s.stream().distinct().sorted().filter(a -> a.startsWith("m")).map(a->a.toUpperCase()).forEach(x -> System.out.println(x));

	}

}
