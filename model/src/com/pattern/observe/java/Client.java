package com.pattern.observe.java;

public class Client {

	public static void main(String[] args) {
		ConcreteSubject oConcreteSubject = new ConcreteSubject();
		ConcreteObserver oConcreteObserver1 = new ConcreteObserver("mum","���ȥѽ");
		ConcreteObserver oConcreteObserver2 = new ConcreteObserver("girlFriend","Լ��ɣ�");
		oConcreteSubject.addObserver(oConcreteObserver1);
		oConcreteSubject.addObserver(oConcreteObserver2);
		oConcreteSubject.setStrContent("�����Ǵ�����");
	}

}
