package com.nisum.rx;

import java.util.concurrent.TimeUnit;

import rx.Observable;

public class Delay {

	public static void main(String args[]) throws InterruptedException {
		Observable.just("Alpha", "Beta", "Gamma" ,"Delta", "Epsilon")
		.delay(1, TimeUnit.SECONDS)
		.subscribe(s -> System.out.println(s));
		
		Thread.sleep(100);

		/*Observable.just("Alpha", "Beta", "Gamma" ,"Delta", "Epsilon")
		.delay(1, TimeUnit.SECONDS)
				.subscribe(s -> System.out.println(s));

		Thread.sleep(1000);*/
		
	}
}
