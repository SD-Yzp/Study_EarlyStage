package cn.sd.yz.io;

import java.io.File;

/**
 * 测试list()、listFile()、listRoots()
 * list()：下级名称
 * listFile()：下级File对象
 * listRoots()：根路径
 * @author Yin
 *
 */
public class TestDir02 {
	public static void main(String[] args) {
		File dir = new File("D:/JAVA Code/workspace/MyPro13");
		
//		//list()：下级名称
		String[] string = dir.list();
		for(String s:string) {
			System.out.println(s);
		}
		
		
		//listFile()：下级File对象
		File[] file = dir.listFiles();
		for(File f:file) {
			System.out.println(f.getAbsolutePath());
		}
		
		
		//listRoots()：根路径
		File[] roots = dir.listRoots();
		for(File r:roots) {
			System.out.println(r.getAbsolutePath());
		}
	}
}
