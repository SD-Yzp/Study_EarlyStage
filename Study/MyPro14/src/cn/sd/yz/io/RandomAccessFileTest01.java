package cn.sd.yz.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * �����ȡ��д���� RandomAccessFile
 * ָ����ʼλ�ã���ȡʣ�����������
 * @author Yin
 *
 */
public class RandomAccessFileTest01 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile(new File("src/cn/sd/yz/io/Copy.java"),"r");
		//�����ȡ
		raf.seek(2);  //�ӵڶ���λ�û�ȡ
		//��ȡ
		byte[] datas = new byte[1024];
		int len = -1;
		while((len=raf.read(datas))!=-1) {
			String s = new String(datas,0,len);
			System.out.println(s);
		}
		
		raf.close();
	}
}
