package cn.sd.yz.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * �����ȡ��д���� RandomAccessFile
 * �ָ��ļ�
 * ��װ
 * @author Yin
 *
 */
public class RandomAccessFileTest05 {
	private String str;
	//ÿ��ĳ���
	private int blockSize;
	//ʵ�ʳ���
	private int actualSize;
	//��ʼλ��
	private int beginPos = 0;
	
	
	
	public int getBeginPos() {
		return beginPos;
	}



	public void setBeginPos(int beginPos) {
		this.beginPos = beginPos;
	}



	public RandomAccessFileTest05(String str, int blockSize) throws IOException {
		super();
		this.str = str;
		this.blockSize = blockSize;		
	}



	private void split() throws IOException {		
		//����Դ
		File src = new File(str);
		//�ļ����ܳ���
		long len = src.length();
		//�ֳɶ��ٿ�
		int block = (int) Math.ceil(len*1.0/1024);
		for(int i=0;i<block;i++) {
			beginPos=i*blockSize;
			if(len<blockSize) { //���һ��
				actualSize = (int) len; 
			}else {
				actualSize = blockSize;
				len-=actualSize;				
			}
			splitFile(src,beginPos,actualSize);
			System.out.println("-------���Ƿָ���-------");
		}
	}
	
	
	
	private void splitFile(File src,int beginPos,int actualSize) throws IOException {
		//����Դ
		RandomAccessFile raf = new RandomAccessFile(src,"r"); 
		//����λ��
		raf.seek(beginPos);
		//��ȡ
		byte[] datas = new byte[actualSize];
		System.out.println(new String(datas,0,raf.read(datas)));
		//�ͷ���Դ
		raf.close();		
	}
	
	public static void main(String[] args) throws IOException {
		RandomAccessFileTest05 raf5 = new RandomAccessFileTest05("src/cn/sd/yz/io/Copy.java",1024);
		raf5.split();
	}
	

}