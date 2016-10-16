package com.pattern.observe;

public class ObservePatternTest {

	public static void main(String[] args) {
		ConcreteSubject oSubject = new ConcreteSubject();
		Observe oObserve1 = new ConcreteObserve("��ӨӨ","���ǳ�ȥ��ɣ�");
		Observe oObserve2 = new ConcreteObserve("��ĸ","Ҫ�չ˺����壡");
		oSubject.attachObserve(oObserve1);
		oSubject.attachObserve(oObserve2);
		oSubject.setStrSubjectStatus("�¶ȸոպ�");
	}

}
