package com.nisum.rx;

import rx.Observable;

public class Scan {

	public static void main(String[] args) {
		Observable.just(5, 3, 7, 10, 2, 14)
		.scan((total, next) -> total + next)
		.subscribe(s -> System.out.println("Received: " + s));
		}
}
