package javaStreamConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethods_Test_03 {
//	reduce()
	public static void main(String[] args) {
		List<String> listCol = Arrays.asList("1", "2", "3", "a", "s", "d");
		Optional<String> red = listCol.stream().reduce((value, combinedValue) -> {
//			return combinedValue + value;  // dsa321
			return value + combinedValue;  // 123asd
		});
		System.out.println(red.get());
	}

}
