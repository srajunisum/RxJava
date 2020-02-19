package com.nisum.rx;

import rx.Observable;

public class Test {
	
	public static void main(String args[]) {
		
		Observable.just("Hello World").subscribe(s -> System.out.println(s));				
	}
}
