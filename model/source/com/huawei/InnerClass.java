package com.huawei;

public class InnerClass {
	String strTest = "外部变量";
	static int a= 66;
	
	//成员内部类
	/**
	 * 成员内部类
	 * @author wuxiao
	 * 可使用任意访问控制符
	 * 可任意使用外部类的属性
	 * 必须使用外部类对象来创建内部类对象，而不能直接去 new 一个内部类对象
	 * 外部类是不能直接使用内部类的成员和方法
	 */
	public class HelloWorld{
		String strTest = "内部变量";
		void show()
		{
			System.out.println("成员内部类");
			System.out.println(strTest);
			System.out.println(this.strTest);
			//访问外部类成员
			System.out.println(a);
			System.out.println(InnerClass.this.strTest);
			System.out.println();
		}
	}
	
	//静态内部类
	/**
	 * 静态内部类
	 * @author wuxiao
	 * 静态内部类不能直接访问外部类的非静态成员，但可以通过 new 外部类().成员 的方式访问 
	 * 创建静态内部类的对象时，不需要外部类的对象，可以直接创建
	 */
	public static class StaticHelloWorld{
		String strTest = "内部变量";
		void show()
		{
			System.out.println("静态内部类");
			System.out.println(strTest);
			System.out.println(this.strTest);
			//访问外部类静态成员
			System.out.println(a);
			//访问外部类非静态成员
			System.out.println( new InnerClass().strTest);
			System.out.println();
		}
	}
	
	// 方法内部类 
	
	/*
	 * 1、方法内部类的访问限制符不能是public也不能使用static
	 * 2、只在该方法的内部可见
	 */
	public void method()
	{
		String inner = "方法内部类";
		
		class MethodClass{
			public String show()
			{
				return inner+"的方法";
			}
		}
		MethodClass oMethodClass = new MethodClass();
		String result = oMethodClass.show();
		System.out.println();
		System.out.println(result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClass oInnerClass = new InnerClass();
		
		// 成员内部类实例化
		HelloWorld oHelloWorld = oInnerClass.new HelloWorld();
		oHelloWorld.show();
		
		// 静态内部类实例化
		StaticHelloWorld oStaticHelloWorld = new StaticHelloWorld();
		oStaticHelloWorld.show();
		
		// 同过外部类调用方法的方式使用方法内部类
		oInnerClass.method();
	}

}
