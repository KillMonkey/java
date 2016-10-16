package com.pattern.observe.java;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {

	private String strContent;
	
	private String strName;
	
	private String strRemind;
	
	@Override
	public void update(Observable arg0, Object arg1) {
		strContent = (String)arg1;
		System.out.println(strName +"收到了消息：" + strContent + "，提示内容为：" + strRemind);
	}

	public ConcreteObserver(String strName, String strRemind) {
		super();
		this.strName = strName;
		this.strRemind = strRemind;
	}

	
}
