package javaStreamConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods_Test_08 {
//  Concatenating two streams
	public static void main(String[] args) {
		List<String> animal = Arrays.asList("Cow", "Dog", "Cat", "Tiger", "Lion");
		List<String> birds = Arrays.asList("Parrot", "Crow", "Eagle", "Falcon", "Sparrow");
		Stream<String> animalStream = animal.stream();
		Stream<String> birdStream = birds.stream();
		List<String> finalList = Stream.concat(animalStream,birdStream).collect(Collectors.toList());
		for (String item : finalList) {
			System.out.println(item);
		}
	}

}
