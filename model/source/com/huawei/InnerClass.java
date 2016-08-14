package com.huawei;

public class InnerClass {
	String strTest = "�ⲿ����";
	static int a= 66;
	
	//��Ա�ڲ���
	/**
	 * ��Ա�ڲ���
	 * @author wuxiao
	 * ��ʹ��������ʿ��Ʒ�
	 * ������ʹ���ⲿ�������
	 * ����ʹ���ⲿ������������ڲ�����󣬶�����ֱ��ȥ new һ���ڲ������
	 * �ⲿ���ǲ���ֱ��ʹ���ڲ���ĳ�Ա�ͷ���
	 */
	public class HelloWorld{
		String strTest = "�ڲ�����";
		void show()
		{
			System.out.println("��Ա�ڲ���");
			System.out.println(strTest);
			System.out.println(this.strTest);
			//�����ⲿ���Ա
			System.out.println(a);
			System.out.println(InnerClass.this.strTest);
			System.out.println();
		}
	}
	
	//��̬�ڲ���
	/**
	 * ��̬�ڲ���
	 * @author wuxiao
	 * ��̬�ڲ��಻��ֱ�ӷ����ⲿ��ķǾ�̬��Ա��������ͨ�� new �ⲿ��().��Ա �ķ�ʽ���� 
	 * ������̬�ڲ���Ķ���ʱ������Ҫ�ⲿ��Ķ��󣬿���ֱ�Ӵ���
	 */
	public static class StaticHelloWorld{
		String strTest = "�ڲ�����";
		void show()
		{
			System.out.println("��̬�ڲ���");
			System.out.println(strTest);
			System.out.println(this.strTest);
			//�����ⲿ�ྲ̬��Ա
			System.out.println(a);
			//�����ⲿ��Ǿ�̬��Ա
			System.out.println( new InnerClass().strTest);
			System.out.println();
		}
	}
	
	// �����ڲ��� 
	
	/*
	 * 1�������ڲ���ķ������Ʒ�������publicҲ����ʹ��static
	 * 2��ֻ�ڸ÷������ڲ��ɼ�
	 */
	public void method()
	{
		String inner = "�����ڲ���";
		
		class MethodClass{
			public String show()
			{
				return inner+"�ķ���";
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
		
		// ��Ա�ڲ���ʵ����
		HelloWorld oHelloWorld = oInnerClass.new HelloWorld();
		oHelloWorld.show();
		
		// ��̬�ڲ���ʵ����
		StaticHelloWorld oStaticHelloWorld = new StaticHelloWorld();
		oStaticHelloWorld.show();
		
		// ͬ���ⲿ����÷����ķ�ʽʹ�÷����ڲ���
		oInnerClass.method();
	}

}
