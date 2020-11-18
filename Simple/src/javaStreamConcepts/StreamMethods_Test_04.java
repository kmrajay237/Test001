package javaStreamConcepts;

import java.util.Arrays;
import java.util.List;

public class StreamMethods_Test_04 {

	public static void main(String[] args) {
		List<String> listCol = Arrays.asList("1", "2", "3", "a", "s", "d");
		Object[] arr = listCol.stream().toArray();
		System.out.println(arr.length);
		for (Object obj : arr) {
			System.out.println(obj);
		}
	}

}
