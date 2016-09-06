package com.file;

import java.io.File;
import java.util.Arrays;

public class FileUtils {
	public static void lstFiles(String strPath) {
		
		File oFile = new File(strPath);
		//System.out.println(oFile.renameTo(new File("F:\\2014XDF��������羫���� ������")));
		if(oFile != null){
			String[] strFileName = oFile.list();
			if(strFileName != null){
				//System.out.println(strFileName.length);
				Arrays.sort(strFileName);
				for (String string : strFileName) {
					File oFile2 = new File(strPath+"\\"+string);
					if(oFile2.isDirectory())
					{
						lstFiles(strPath+"\\"+string);
					}
					else{
						System.out.println(string);
					}
				}
			}
		}
		
	}
}
