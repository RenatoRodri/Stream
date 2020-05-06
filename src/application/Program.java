package application;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Integer> list = Arrays.asList(3, 7, 9, 11);
		Stream<Integer> st1 = list.stream();
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("Maria, Jo�o, Bob, Pedro");
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x+2);{
			System.out.println(Arrays.toString(st3.limit(13).toArray()));
		}

		Stream<Long> st4 = Stream.iterate(new long[] {0l , 1l}, p -> new long[] {p[1] , p[0] + p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(12).toArray()));
		
	}

}
