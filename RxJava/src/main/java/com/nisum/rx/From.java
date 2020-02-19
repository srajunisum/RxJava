package com.nisum.rx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import rx.Observable;

public class From {
	
	public static void main(String args[]) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

		Observable<Integer> observable = Observable.from(list);

		observable.subscribe(item -> System.out.println(item));
	} 

}
