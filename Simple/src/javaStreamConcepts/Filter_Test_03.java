package javaStreamConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Test_03 {

	public static void main(String[] args) {
		List<String> words=Arrays.asList("cup",null,"forest","sky","book",null,"hall");
		List<String> result;
		result=words.stream().filter(w->w!=null).collect(Collectors.toList());
		System.out.println(result);
	}

}
