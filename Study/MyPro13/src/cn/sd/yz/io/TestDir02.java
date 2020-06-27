package cn.sd.yz.io;

import java.io.File;

/**
 * ����list()��listFile()��listRoots()
 * list()���¼�����
 * listFile()���¼�File����
 * listRoots()����·��
 * @author Yin
 *
 */
public class TestDir02 {
	public static void main(String[] args) {
		File dir = new File("D:/JAVA Code/workspace/MyPro13");
		
//		//list()���¼�����
		String[] string = dir.list();
		for(String s:string) {
			System.out.println(s);
		}
		
		
		//listFile()���¼�File����
		File[] file = dir.listFiles();
		for(File f:file) {
			System.out.println(f.getAbsolutePath());
		}
		
		
		//listRoots()����·��
		File[] roots = dir.listRoots();
		for(File r:roots) {
			System.out.println(r.getAbsolutePath());
		}
	}
}
