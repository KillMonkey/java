package com.pattern.observe;

public class ConcreteObserve implements Observe {

	private String strObserveStatus;
	
	private String strObserveName;
	
	private String strObserveRemind;
	
	public ConcreteObserve(String strObserveName, String strObserveRemind) {
		super();
		this.strObserveName = strObserveName;
		this.strObserveRemind = strObserveRemind;
	}

	@Override
	public void update(ConcreteSubject oConcreteSubject) {
		this.strObserveStatus = oConcreteSubject.getStrSubjectStatus();
		System.out.println(this.strObserveName+"�յ�����Ϣ������Ϊ��"+this.strObserveStatus+"����ʾ����Ϊ��"+this.strObserveRemind);
	}

	public String getStrObserveName() {
		return strObserveName;
	}

	public void setStrObserveName(String strObserveName) {
		this.strObserveName = strObserveName;
	}

	public String getStrObserveRemind() {
		return strObserveRemind;
	}

	public void setStrObserveRemind(String strObserveRemind) {
		this.strObserveRemind = strObserveRemind;
	}

}
