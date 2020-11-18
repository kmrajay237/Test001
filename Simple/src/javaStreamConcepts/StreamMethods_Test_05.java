package javaStreamConcepts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods_Test_05 {
//	sorted()
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(2,6,3,7,5,8,9,1,4,10);
		List<Integer> ascendingOrder = list1.stream().sorted().collect(Collectors.toList());
		System.out.println("ascendingOrder : "+ascendingOrder);
		List<Integer> descendingOrder = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("descendingOrder : "+descendingOrder);
		
		List<String> stringList1 = Arrays.asList("Hello","World","aa","AA","tt","HH","uu","FF");
		List<String> list2 = stringList1.stream().sorted().collect(Collectors.toList());
		System.out.println("ascendingOrder : "+list2);
		List<String> list3 = stringList1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("descendingOrder : "+list3);
	}

}
