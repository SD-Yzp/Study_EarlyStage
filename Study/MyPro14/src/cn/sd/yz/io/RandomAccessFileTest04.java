package cn.sd.yz.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * �����ȡ��д���� RandomAccessFile
 * �ָ��ļ�
 * @author Yin
 *
 */
public class RandomAccessFileTest04 {
	public static void main(String[] args) throws IOException {
		File src = new File("src/cn/sd/yz/io/Copy.java");
		//�ļ����ܳ���
		long len = src.length();
		//ÿ��ĳ���
		int blockSize = 1024;
		//�ֳɶ��ٿ�
		int block = (int) Math.ceil(len*1.0/1024);
		//��ʼλ��
		int beginPos = 0;
		int actualSize;
		for(int i=0;i<block;i++) {
			beginPos=i*blockSize;
			if(len<blockSize) { //���һ��
				actualSize = (int) len; 
			}else {
				actualSize = blockSize;
				len-=actualSize;
			}
			System.out.println(i+"--->"+beginPos+"--->"+actualSize);
			split(src,beginPos,actualSize);
		}
		
		
	}
	
	public static void split(File src,int beginPos,int actualSize) throws IOException {
		//����Դ
		RandomAccessFile raf = new RandomAccessFile(src,"r"); 
		//����λ��
		raf.seek(beginPos);
		//��ȡ
		byte[] datas = new byte[actualSize];
		int len = - 1;
		while((len=raf.read(datas))!=-1) {
			System.out.println(new String(datas,0,len));
		}
		
	}
}
