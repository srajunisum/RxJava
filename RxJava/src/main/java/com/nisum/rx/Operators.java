package com.nisum.rx;

import rx.Observable;

public class Operators {

	public static void main(String args[]) {
		
		Observable.just("Java","Html","Python","C")
		.map(s -> s.toUpperCase())
		.filter(s -> !s.equals("HTML"))
		.take(2)
		.subscribe(s -> System.out.println(s));
	}
}
