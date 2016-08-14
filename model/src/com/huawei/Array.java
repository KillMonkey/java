package com.huawei;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores=new int[]{89,-23,64,91,119,52,73};
		int weight[] = new int[5];
		int[] height;
		height = new int[5];
		String[] names = {"zhaoliu","wangwu","lisi","zhangsan"};
		Array array = new Array();
		int[] a = array.getArray(8);
		System.out.println("排序之前的数组：");
		System.out.println(Arrays.toString(a));
		System.out.println();
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(weight));
		System.out.println(Arrays.toString(height));
		System.out.println(Arrays.toString(names));
		array.sendMessage();
	}
	int var;
	public int[] getArray(int length)
	{
		int[] nums = new int[length];
		for(int i = 0 ; i < nums.length ; i++ )
		{
			nums[i] = (int)(Math.random()*100);
		}
		System.out.println("排序之后的数组：");
		System.out.println(Arrays.toString(nums));
		Arrays.sort(nums);
		return nums;
	}
	void sendMessage()
	{
		int var = 10;
		this.var = 20;
		System.out.println(var);
		System.out.println(this.var);
	}
	
}
