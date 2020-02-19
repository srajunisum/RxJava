package com.nisum.rx;

import rx.Observable;
import rx.Subscriber;

public class HelloWorld {

	public static void main(String args[]) {
		
		Observable<String> myObservable = Observable.unsafeCreate(
				new Observable.OnSubscribe<String>() {

					@Override
					public void call(Subscriber<? super String> t) {
						t.onNext("Hello World");
						
					}
				}
				);
		
		Subscriber<String> mySubscriber = new Subscriber<String>() {

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onError(Throwable e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onNext(String t) {
				System.out.println(t);
				
			}
		};
		
		myObservable.subscribe(mySubscriber);
	}
}
