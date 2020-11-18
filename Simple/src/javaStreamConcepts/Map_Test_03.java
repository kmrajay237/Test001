package javaStreamConcepts;

import java.util.Arrays;
import java.util.List;

public class Map_Test_03 {

	public static void main(String[] args) {
		List<Integer> numberList=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		numberList.stream().map(number->number*3).forEach(System.out::println);
	}

}
