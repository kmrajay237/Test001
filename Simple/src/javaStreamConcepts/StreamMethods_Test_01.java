package javaStreamConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods_Test_01 {
	
//	distinct(),limit()->Non-Terminal Methods or Processing Methods
//	count(), forEach() -> Terminal Methods

	public static void main(String[] args) {
//		distinct()
		List<String> vehicleList = Arrays.asList("car","bike","plane","bus","cab","harare","car","bike");
		List<String> distinctVehicles = vehicleList.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctVehicles);	
		
		vehicleList.stream().distinct().forEach(value->System.out.println(value));
		
		
//		count()
		long c = vehicleList.stream().distinct().count();
		System.out.println(c);
		
//		limit()
		List<String> l1 = vehicleList.stream().distinct().limit(3).collect(Collectors.toList());
		System.out.println(l1);
		List<String> l2 = vehicleList.stream().limit(3).collect(Collectors.toList());
		System.out.println(l2);
		
		vehicleList.stream().distinct().limit(3).forEach(a->System.out.println(a));
		vehicleList.stream().limit(3).forEach(a->System.out.println(a));
	}

}
