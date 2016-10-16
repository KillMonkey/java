package com.pattern.observe;

public class ObservePatternTest {

	public static void main(String[] args) {
		ConcreteSubject oSubject = new ConcreteSubject();
		Observe oObserve1 = new ConcreteObserve("方莹莹","我们出去玩吧！");
		Observe oObserve2 = new ConcreteObserve("父母","要照顾好身体！");
		oSubject.attachObserve(oObserve1);
		oSubject.attachObserve(oObserve2);
		oSubject.setStrSubjectStatus("温度刚刚好");
	}

}
