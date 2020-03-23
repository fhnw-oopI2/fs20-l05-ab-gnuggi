package ch.fhnw.oop2.module05.streams.ab1;

import java.util.stream.Stream;

public class Fibonacci {

	public static void main(String[] args) {
		
		//Stream.iterate(0, n -> n + 1).limit(30).forEach(n -> System.out.println(n));
		Stream.iterate(new Tuple<Integer>(0, 1), t -> new Tuple<Integer>(t.t2, t.t1 + t.t2)).limit(30).forEach(n -> System.out.println(n.t2));
		
		
	}

}
