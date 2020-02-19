package com.nisum.rx;

import rx.Observable;

public class ToList {

	public static void main(String[] args) {
		Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3)
		.toList()
		.subscribe(s -> System.out.println("Received: " + s));
		}
}
