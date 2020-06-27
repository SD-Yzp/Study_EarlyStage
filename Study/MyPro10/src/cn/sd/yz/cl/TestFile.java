package cn.sd.yz.cl;

import java.io.File;

/**
 * 测试File类的基本用法使用递归查询
 * @author Y
 *
 */
public class TestFile {
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		File f = new File("a.txt");
		
		File f2 = new File("c:\\1");
		
		printFiles(f2, 0);
	}
	
	public static void printFiles(File file,int level) {
		for(int i=0;i<level;i++) {
			System.out.print("-");
		}
		
		System.out.println(file.getName());
		
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			for(File temp:files) {
				printFiles(temp, level+1);;
			}
		}
	}
}
