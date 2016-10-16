package com.pattern.observe;

public class ConcreteSubject extends Subject {
	private String strSubjectStatus;

	public String getStrSubjectStatus() {
		return strSubjectStatus;
	}

	public void setStrSubjectStatus(String strSubjectStatus) {
		this.strSubjectStatus = strSubjectStatus;
		for(Observe oObserve:super.getLstObserve()){
			oObserve.update(this);
		}
	}
	
}
