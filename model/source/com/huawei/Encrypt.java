package com.huawei;

import java.io.UnsupportedEncodingException;

public class Encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] b_utf_8 = "zhongguo".getBytes();
		String s_utf_8 = "";
		try {
			s_utf_8 = new String(b_utf_8,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s_utf_8);
	}

}
