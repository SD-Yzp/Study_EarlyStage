package cn.sd.yz.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * �����ȡ��д���� RandomAccessFile
 * �ָ��ļ�
 * ���ָ����ļ����浽һ���ļ�����
 * @author Yin
 *
 */
public class RandomAccessFileTest06 {
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



	public RandomAccessFileTest06(String str, int blockSize) throws IOException {
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
			//����������ļ���
			FileOutputStream dest = new FileOutputStream("dest"+"/"+i+"Copy.java");
			splitFile(src,dest,beginPos,actualSize);
			System.out.println("-------���Ƿָ���-------");
			//�ͷ������
			dest.close();
		}
	}
	
	
	
	private void splitFile(File src,FileOutputStream dest,int beginPos,int actualSize) throws IOException {
		//����Դ
		RandomAccessFile raf = new RandomAccessFile(src,"r"); 
		//����λ��
		raf.seek(beginPos);
		//��ȡ
		byte[] datas = new byte[actualSize];		
		dest.write(datas, 0, raf.read(datas));  //ע��read��
		//�ͷ���Դ
		raf.close();		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		RandomAccessFileTest06 raf5 = new RandomAccessFileTest06("src/cn/sd/yz/io/Copy.java",1024);
		raf5.split();
	}
	

}