package com.pattern.observe;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	//´æ´¢¹Û²ìÕß
	private List<Observe> lstObserve = new ArrayList<Observe>();
	
	public List<Observe> getLstObserve() {
		return lstObserve;
	}

	public void setLstObserve(List<Observe> lstObserve) {
		this.lstObserve = lstObserve;
	}

	public void attachObserve(Observe oObserve){
		this.lstObserve.add(oObserve);
	}
	
	public void deltachObserve(Observe oObserve){
		if(null != oObserve){
			if(this.lstObserve.contains(oObserve)){
				this.lstObserve.remove(oObserve);
			}
		}
		else{
			System.out.println("„h³ýÊ§”¡£¡£¡£¡");
		}
	}
}
