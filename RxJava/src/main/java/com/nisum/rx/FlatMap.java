package com.nisum.rx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import rx.Observable;

public class FlatMap {
	
	public static void main(String args[]) throws InterruptedException {
		
		final List<String> persons = new ArrayList<>(Arrays.asList("Alan", "Bob", "Cobb", "Dan", "Evan", "Finch"));
		
		Observable.from(persons)
		.flatMap(s -> {
			final int delay = new Random().nextInt(5);
			return Observable.just(s).map(String::toUpperCase).delay(delay, TimeUnit.SECONDS);
		})
//		.doOnNext(t -> System.out.println(Thread.currentThread().getName()))
		.subscribe(s -> System.out.println(s));
		
		  Thread.sleep(50000);
	}
}
