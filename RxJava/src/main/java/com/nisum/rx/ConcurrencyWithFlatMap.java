package com.nisum.rx;

import rx.Observable;
import rx.schedulers.Schedulers;

public class ConcurrencyWithFlatMap {
	
	public static void main(String[] args) throws InterruptedException {
		
	    Observable.just("long", "longer", "longest")
	    
	    .flatMap(v -> Observable.just(v.length()).subscribeOn(Schedulers.io()))
	        .subscribe(length -> System.out.println("received item length " + length + " on thread " + Thread.currentThread().getName()));


		/*Observable.just("long", "longer", "longest")
	    .flatMap(v -> Observable.just(v.length()).subscribeOn(Schedulers.computation()))
				.subscribe(length -> System.out.println("received item length " + length + " on thread " + Thread.currentThread().getName()));*/
	}
}
