package javaStreamConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_Test_01 {

	public static void main(String[] args) {
		List<String> lowerVehicles=Arrays.asList("car","cycle","bus","flight","train","metro");
		List<String> upperVehicles=new ArrayList<String>();
//		Without Using Java 8.0/Stream Concept
//		for (String name : lowerVehicles) {
//			upperVehicles.add(name.toUpperCase());
//		}
//		System.out.println(upperVehicles);
		
//		Stream - Map
		upperVehicles=lowerVehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperVehicles);
	}

}
