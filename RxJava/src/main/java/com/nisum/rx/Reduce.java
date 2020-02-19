package com.nisum.rx;

import rx.Observable;

public class Reduce {
	public static void main(String[] args) {

		Observable.just(5, 3, 7)
				.reduce((total, next) -> total + next)
				.subscribe(s -> System.out.println("Received: " + s));

		Observable.just(5, 4, 7)
				.count()
				.subscribe(s -> System.out.println("Received: " + s));

		Observable.just(5, 4, 7)
				.contains(7)
				.subscribe(s -> System.out.println("Received: " + s));
	}
}
