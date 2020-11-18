package javaStreamConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap_Test_01 {

	public static void main(String[] args) {
//		map()
		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> l = numberList.stream().map(num -> num + 10).collect(Collectors.toList());
		System.out.println(l);

//		flatMap()
		List<Integer> list1 = Arrays.asList(1, 2);
		List<Integer> list2 = Arrays.asList(3, 4);
		List<Integer> list3 = Arrays.asList(5, 6);
		List<List<Integer>> list = Arrays.asList(list1, list2, list3);
		List<Integer> result = list.stream().flatMap(x->x.stream().map(n->n*n)).collect(Collectors.toList());
		System.out.println(result);
	}

}
