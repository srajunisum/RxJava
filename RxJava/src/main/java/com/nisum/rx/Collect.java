package com.nisum.rx;

import rx.Observable;

import java.util.ArrayList;
import java.util.HashSet;

public class Collect {
	
	public static void main(String[] args) {
		Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
		.collect(HashSet::new, HashSet::add)
		.subscribe(s -> System.out.println("Received: " + s));

		/*Observable.just("raju","sreeram","raju")
		.collect(HashSet::new,HashSet::add)
		.subscribe(s-> System.out.println("Received:" + s));*/

		/*Observable.just("raju","sreeram","raju")
				.collect(ArrayList::new,ArrayList::add)
				.subscribe(s-> System.out.println("Received:" + s));*/

		/*Observable.just("raju","sreeram","raju")
				.subscribe(s-> System.out.println("Received:" + s));*/
		}

}
