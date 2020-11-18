package javaStreamConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap_Test_02 {

	public static void main(String[] args) {
		List<String> teamA = Arrays.asList("Scott", "David", "John");
		List<String> teamB = Arrays.asList("Mary", "Luna", "Tom");
		List<String> teamC = Arrays.asList("Ken", "Johny", "Kitty");
		
		List<List<String>> players = Arrays.asList(teamA,teamB,teamC);
//		for (List<String> teams : players) {
//			for (String list : teams) {
//				System.out.println(list);
//			}
//		}
		
//		using stream flatMap() concept
//		List<String> names = players.stream().flatMap(teams->teams.stream().map(n->n+":world")).collect(Collectors.toList());
		List<String> names = players.stream().flatMap(teams->teams.stream()).collect(Collectors.toList());
		System.out.println(names);
	}

}
