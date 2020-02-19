package com.nisum.rx;

import rx.Observable;

public class ToMap {
	
	public static void main(String[] args) {
		
		Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
		.toMap(s -> s.charAt(0))
		.subscribe(s -> System.out.println("Received: " + s));
		}

}
