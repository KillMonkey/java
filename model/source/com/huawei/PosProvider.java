package com.huawei;

public class PosProvider {
	String name;
	static int num3;
	public PosProvider()
	{
		name = "PosProvider";
		System.out.println(name);
	}
	static {
		num3=100;
		System.out.println("静态初始化块："+num3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticReq();
		PosProvider oPosProvider = new PosProvider();
		oPosProvider.normalReq();
		num3 = 200;
		System.out.println("更新后的静态变量"+num3);
		
	}
	public static void staticReq()
	{
		System.out.println(Role.project);
		System.out.println(Pos.progresslog_static);
		Pos pos = new Pos();
		System.out.println(pos.progresslog_normal);
		Pos.method_static();
		pos.method_normal();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getNum3() {
		return num3;
	}
	public static void setNum3(int num3) {
		PosProvider.num3 = num3;
	}
	public void normalReq()
	{
		System.out.println(Role.project);
		System.out.println(Pos.progresslog_static);
		Pos pos = new Pos();
		System.out.println(pos.progresslog_static);
		Pos.method_static();
		pos.method_normal();
	}
}
