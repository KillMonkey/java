package com.file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileUtils {
	
	/*
	 * 獲取指定路徑下的文件列表及其子文件目錄下的文件名稱
	 */
	public static void lstFiles(String strPath) throws IOException {
		
		File oFile = new File(strPath);
		//System.out.println(oFile.renameTo(new File("F:\\2014XDF计算机网络精讲班 白龙飞")));
		if(!oFile.isDirectory())
		{
			throw new IllegalArgumentException("參數錯誤：不是正確的文件路徑！");
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
						System.out.println("這是文件夾："+string+"下的文件名稱");
						lstFiles(strPath+"\\"+string);
						System.out.println("*********分隔符*********");
					}
					else{
						System.out.println(string);
					}
				}
			}
		}
	}
	
	/*
	 * 獲取文件路徑下的文件名稱，不再查看子目錄下的文件名稱
	 */
	public static void lstFile(String strPath)throws IOException{
		File oFile = new File(strPath);
		if(!oFile.isDirectory())
		{
			throw new IllegalArgumentException("參數錯誤：不是正確的文件路徑！");
		}
		else{
			String[] strFileName = oFile.list();
			if(strFileName != null){
				System.out.println(strPath+"目錄下共有"+strFileName.length+"條文件，如下：");
				System.out.println("這是路徑："+strPath+"下的文件名稱");
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
			System.out.println("文件已存在！");
		}
	}
}
