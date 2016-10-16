package com.file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileUtils {
	
	/*
	 * �@ȡָ��·���µ��ļ��б������ļ�Ŀ��µ��ļ����Q
	 */
	public static void lstFiles(String strPath) throws IOException {
		
		File oFile = new File(strPath);
		//System.out.println(oFile.renameTo(new File("F:\\2014XDF��������羫���� ������")));
		if(!oFile.isDirectory())
		{
			throw new IllegalArgumentException("�����e�`���������_���ļ�·����");
		}
		else{
			String[] strFileName = oFile.list();
			if(strFileName != null){
				//System.out.println(strFileName.length);
				Arrays.sort(strFileName);
				for (String string : strFileName) {
					File oFile2 = new File(strPath+"\\"+string);
					if(oFile2.isDirectory())
					{
						System.out.println("�@���ļ��A��"+string+"�µ��ļ����Q");
						lstFiles(strPath+"\\"+string);
						System.out.println("*********�ָ���*********");
					}
					else{
						System.out.println(string);
					}
				}
			}
		}
	}
	
	/*
	 * �@ȡ�ļ�·���µ��ļ����Q�����ٲ鿴��Ŀ��µ��ļ����Q
	 */
	public static void lstFile(String strPath)throws IOException{
		File oFile = new File(strPath);
		if(!oFile.isDirectory())
		{
			throw new IllegalArgumentException("�����e�`���������_���ļ�·����");
		}
		else{
			String[] strFileName = oFile.list();
			if(strFileName != null){
				System.out.println(strPath+"Ŀ��¹���"+strFileName.length+"�l�ļ������£�");
				System.out.println("�@��·����"+strPath+"�µ��ļ����Q");
				Arrays.sort(strFileName);
				for (String string : strFileName) {
					System.out.println(string);
				}
			}
		}
	}
	
	public static void addFile(String strPath,String strFileName){
		String strAddFilePath = strPath + "\\" +strFileName;
		File oFile = new File(strAddFilePath);
		if(!oFile.exists())
		{
			boolean isSuccess = oFile.mkdirs();
			System.out.println(isSuccess);
		}
		else {
			System.out.println("�ļ��Ѵ��ڣ�");
		}
	}
}
