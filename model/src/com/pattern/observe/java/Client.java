package com.pattern.observe.java;

public class Client {

	public static void main(String[] args) {
		ConcreteSubject oConcreteSubject = new ConcreteSubject();
		ConcreteObserver oConcreteObserver1 = new ConcreteObserver("mum","逛街去呀");
		ConcreteObserver oConcreteObserver2 = new ConcreteObserver("girlFriend","约会吧！");
		oConcreteSubject.addObserver(oConcreteObserver1);
		oConcreteSubject.addObserver(oConcreteObserver2);
		oConcreteSubject.setStrContent("今天是大晴天");
	}

}
