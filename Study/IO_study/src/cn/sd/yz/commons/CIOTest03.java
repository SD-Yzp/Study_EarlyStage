package cn.sd.yz.commons;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

/**
 * ��ȡ�ļ�
 * @author Yin
 *
 */
public class CIOTest03 {
	public static void main(String[] args) throws IOException {
		//��ȡ�ļ�
		String msg = FileUtils.readFileToString(new File("testRead.txt"),"GBK");
		System.out.println(msg);
		byte[] datas = FileUtils.readFileToByteArray(new File("testRead.txt"));
		System.out.println(datas.length);
	
		//���ж�ȡ
		List<String> msgs = FileUtils.readLines(new File("testRead.txt"),"GBK");
		for(String str:msgs) {
			System.out.println(str);
		}
		//���������ж�ȡ
		LineIterator it = FileUtils.lineIterator(new File("testRead.txt"),"GBK");
		while(it.hasNext()) {
			System.out.println(it.nextLine());
		}
		
	}
}
