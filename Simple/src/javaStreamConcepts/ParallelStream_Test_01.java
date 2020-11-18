package javaStreamConcepts;

import java.util.Arrays;
import java.util.List;

public class ParallelStream_Test_01 {

	public static void main(String[] args) {
		List<Students> student = Arrays.asList(
					new Students("David",82),
					new Students("Smith",50),
					new Students("Mary",60),
					new Students("Bob",80),
					new Students("Warner",90),
					new Students("Steve",45),
					new Students("Finch",70)
				);
//		using stream() -> Sequential
		student.stream()
			.filter(val->val.getScore()>=80)
			.limit(3)
			.forEach(action->System.out.println("Name: "+action.getName()+" and "+"Score: "+action.getScore()));
		System.out.println("-----------------------");
//		Parallel stream
		student.parallelStream()
		.filter(val->val.getScore()>=80)
		.limit(3)
		.forEach(action->System.out.println("Name: "+action.getName()+" and "+"Score: "+action.getScore()));
		System.out.println("-----------------------");
//		Convert Normal Stream into Parallel Stream using parallel() method
		student.stream()
		.parallel()
		.filter(val->val.getScore()>=80)
		.limit(3)
		.forEach(action->System.out.println("Name: "+action.getName()+" and "+"Score: "+action.getScore()));
	}

}

class Students{
	String name;
	int score;
	public Students(String n,int s) {
		name=n;
		score=s;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
}
