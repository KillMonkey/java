package com.pattern.observe.java;

import java.util.Observable;

public class ConcreteSubject extends Observable {
	private String strContent;

	public String getStrContent() {
		return strContent;
	}

	public void setStrContent(String strContent) {
		this.strContent = strContent;
		this.setChanged();
		//this.countObservers();
		this.notifyObservers(strContent);
	}
	
}
