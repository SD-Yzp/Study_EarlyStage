package cn.sd.yz.io;

import java.io.File;

/**
 * 打印文件夹大小
 * @author Yin
 *
 */
public class TestDir04 {
	public static void main(String[] args) {
		File file = new File("D:/量化相关");
		int length = countFileLength(file);
		System.out.println(length);
	}
	
	public static int countFileLength(File file) {
		//递归头
		if(file == null || !file.exists()) {
			throw new RuntimeException("文件不存在！") ;
		}
		
		int sum=0;
		if(file.isFile()) {
			
			sum+=file.length();
		}else {
			File[] src = file.listFiles();
			for(File f:src) {
				sum+=countFileLength(f);
			}
		}
		
		return sum;
	}
}
