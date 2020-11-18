package javaStreamConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_Test_02 {

	public static void main(String[] args) {
		List<String> Vehicles=Arrays.asList("car","cycle","bus","flight","train","metro");
//		before java 8.0/without using stream
//		for (String name : Vehicles) {
//			System.out.println(name.length());
//		}
		
//		using stream - map
//		List a=Vehicles.stream().map(name->name.length()).collect(Collectors.toList());
//		System.out.println(a);
		
//		or
//		Vehicles.stream().map(name->name.length()).forEach(name->System.out.println(name));
		
//		or
		Vehicles.stream().map(name->name.length()).forEach(System.out::println);
	}

}
