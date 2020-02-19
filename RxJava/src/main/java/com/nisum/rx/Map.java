package com.nisum.rx;

import rx.Observable;

public class Map {
	
	public static void main(String args[]) {
		
		Observable.just("Hello World")
		.map(s -> s.hashCode())
		.map(i -> i.toString())
		.subscribe(k -> System.out.println(k));
	}

}
