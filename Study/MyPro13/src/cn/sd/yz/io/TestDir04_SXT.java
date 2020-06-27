package cn.sd.yz.io;

import java.io.File;

/**
 * 打印文件夹大小
 * @author Yin
 *
 */
public class TestDir04_SXT {
	public static void main(String[] args) {
		File file = new File("D:/量化相关");
		countFileLength(file);
		System.out.println(len);
	}
	
	private static int len=0;
	
	public static void countFileLength(File file) {
		//递归头
		if(file == null || !file.exists()) {
			throw new RuntimeException("文件不存在！") ;
		}
		
		//递归体
		if(file.isFile()) {
			len+=file.length();			
		}else{
			File[] src = file.listFiles();
			for(File f:src) {
				countFileLength(f);
			}
		}
		
		
	}
}
