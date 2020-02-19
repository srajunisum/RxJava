package com.nisum.rx;

import rx.Observable;
import rx.schedulers.Schedulers;

public class Concurrency {

	public static void main(String args[]) throws InterruptedException {
		
		Observable.just(1, 2)
		.map(i -> i*10)
		.observeOn(Schedulers.immediate())
		.doOnNext(s -> System.out.println("onNext ::" +s))
		.subscribe(i -> {
			System.out.println("thread "+Thread.currentThread().getName() + " And i:" +i);
		});
		
		//Thread.sleep(1000);
		/*System.out.println(" = =================== =" );
		Observable.just(1, 2)
				.map(i -> i*10)
				.observeOn(Schedulers.computation())
				.doOnNext(s -> System.out.println("onNext ::" +s))
				.subscribe(i -> {
					System.out.println("thread "+Thread.currentThread().getName() + " And i:" +i);
				});

		Thread.sleep(1000);

		System.out.println(" = =================== =" );
		Observable.just(1, 2)
				.map(i -> i*10)
				.observeOn(Schedulers.immediate())
				.doOnNext(s -> System.out.println("onNext ::" +s))
				.subscribe(i -> {
					System.out.println("thread "+Thread.currentThread().getName() + " And i:" +i);
				});

		Thread.sleep(1000);

		System.out.println(" = =================== =" );
		Observable.just(1, 2)
				.map(i -> i*10)
				.observeOn(Schedulers.test())
				.doOnNext(s -> System.out.println("onNext ::" +s))
				.subscribe(i -> {
					System.out.println("thread "+Thread.currentThread().getName() + " And i:" +i);
				});

		Thread.sleep(1000);*/
	}
}
