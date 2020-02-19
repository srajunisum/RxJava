package com.nisum.rx;

import rx.Observable;

public class OnError {

	public static void main(String args[]) {
		
		Observable.just(5, 2, 4, 0, 3, 2, 8)
		.map(i -> 10 / i)
		.subscribe(i -> System.out.println("RECEIVED: " + i),
				e -> System.out.println("RECEIVED ERROR: " + "/ by Zero")
		);
		//System.out.println(" ======== " );
	}
}
