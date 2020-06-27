package cn.sd.yz.io;

import java.io.File;

/**
 * 采用递归打印文件和文件名
 * @author Yin
 *
 */
public class TestDir03 {
	public static void main(String[] args) {
		File file = new File("D:/量化相关");
		printFile(file,0);
	}
	
	public static void printFile(File file,int level) {
		//首先判断传进来的文件是否存在，不存在报错
		if(file == null || !file.exists()) {      //递归头    
			throw new RuntimeException("文件不存在！");
		}
		
		for(int i=0;i<level;i++) {   //在下一级名称前打印-来区分父子级，控制层次感
			System.out.print("-");
		}
		
		System.out.println(file.getName());   //打印文件名
		
		if(file.isDirectory()) {   //判断是否为目录，如果是就展开，采用递归		
			File[] src = file.listFiles();
			for(File f:src) {			
				printFile(f,level+1);	//递归体		
			}
		}
	}
	
}
