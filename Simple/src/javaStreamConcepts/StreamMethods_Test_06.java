package javaStreamConcepts;

import java.util.HashSet;
import java.util.Set;

public class StreamMethods_Test_06 {
//	anyMatch(),allMatch(),noneMatch()
	public static void main(String[] args) {
		Set<String> fruits = new HashSet<String>();
		fruits.add("One Apple");
		fruits.add("One Mango");
		fruits.add("Two Apples");
		fruits.add("More Grapes");
		fruits.add("Two Guavas");

//		anyMatch() - > anyone/atleast one value must start with One then return true
		boolean result1 = fruits.stream().anyMatch(value -> {
			return value.startsWith("One");
		});
		System.out.println(result1);
		
		
//		allMatch() - > All value must start with One then return true
		boolean result2 = fruits.stream().allMatch(value -> {
			return value.startsWith("One");
		});
		System.out.println(result2);
		
		
//		noneMatch() - > None of value must not start with One then return true else return false
		boolean result3 = fruits.stream().noneMatch(value -> {
			return value.startsWith("One");
		});
		System.out.println(result3);
	}

}
