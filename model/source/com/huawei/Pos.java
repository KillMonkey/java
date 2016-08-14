package com.huawei;

public class Pos {
	static String progresslog_static = "静态正在解析坐标";
	String progresslog_normal = "普通正在解析坐标";
	public static void  method_static()
	{
		System.out.println("调用静态方法");
	}
	public void  method_normal()
	{
		System.out.println("调用普通方法");
	}
	
}
