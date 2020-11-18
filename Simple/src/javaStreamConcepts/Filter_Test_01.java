package javaStreamConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Test_01 {

	public static void main(String[] args) {
//		List<Integer> number=new ArrayList<Integer>();
//		number.add(10);
//		number.add(15);
//		number.add(20);
//		number.add(25);
//		number.add(30);
//		number.add(35);
		
		List<Integer> number=Arrays.asList(10,15,20,25,30,35);
		List<Integer> evenNumber=new ArrayList<Integer>();
		
//		Without Using java.util.stream
//		for (int n : number) {
//			if(n%2==0) {
//				evenNumber.add(n);
//			}
//		}
//		System.out.println(evenNumber);
		
//		with stream concept
//		evenNumber=number.stream().filter(n->n%2==0).collect(Collectors.toList());
//		System.out.println(evenNumber);
		
//		number.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
		number.stream().filter(n->n%2==0).forEach(System.out::println);
	}

}
