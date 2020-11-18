package javaStreamConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Test_02 {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Melisandre","Sansa","Arya","Jon","Daenerys","Joffrey");
		List<String> long_names=new ArrayList<String>();
		long_names=names.stream().filter(str->str.length()>6 && str.length()<8).collect(Collectors.toList());
		System.out.println(long_names);
		
		names.stream().filter(str->str.length()>6 && str.length()<8).forEach(str->System.out.println(str));
		
		names.stream().filter(str->str.length()>6 && str.length()<8).forEach(System.out::println);
	}

}
