package com.huawei;

public class Import {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Role role = new Role();
		Array array = new Array();
		System.out.println(role.project);
		System.out.println(Role.project);
		array.sendMessage();
		int newVar = array.var;
		System.out.println(newVar);
	}

}
