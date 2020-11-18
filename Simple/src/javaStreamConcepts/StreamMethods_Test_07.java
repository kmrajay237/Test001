package javaStreamConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethods_Test_07 {

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("one","two","three","one");
		Optional<String> anyEle = stringList.stream().findAny();
		System.out.println(anyEle.get());
		
		Optional<String> firstEle = stringList.stream().findFirst();
		System.out.println(firstEle.get());
	}

}
