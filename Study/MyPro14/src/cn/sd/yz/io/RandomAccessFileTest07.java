package cn.sd.yz.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * �����ȡ��д���� RandomAccessFile
 * �ָ��ļ�
 * ���ָ����ļ����浽һ���ļ�����
 * ׷�Ӻϲ�����
 * @author Yin
 *
 */
public class RandomAccessFileTest07 {
	private String src_str;
	private String dest_str;  //Ŀ���ļ���
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



	public RandomAccessFileTest07(String src_str,String dest_str,int blockSize) throws IOException {
		super();
		this.src_str = src_str;
		this.dest_str = dest_str;
		this.blockSize = blockSize;		
	}


	private void split() throws IOException {		
		//����Դ
		File src = new File(src_str);
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
			FileOutputStream dest = new FileOutputStream(dest_str+"/"+i+"_"+"Copy.java");
			splitFile(src,dest,beginPos,actualSize);
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
		dest.write(datas, 0, raf.read(datas));
		//�ͷ���Դ
		raf.close();		
	}
	
	private void merge(String destPath) throws IOException {
		//����Դ
		File src = new File(src_str);
		//�ļ����ܳ���
		long len = src.length();
		//�ֳɶ��ٿ�
		int block = (int) Math.ceil(len*1.0/1024);
		FileOutputStream os = new FileOutputStream(new File(destPath));
		for(int i=0;i<block;i++) {
			FileInputStream is = new FileInputStream(dest_str+"/"+i+"_"+"Copy.java");
			byte[] datas = new byte[1024];
			int len1 = -1;
			while((len1=is.read(datas))!=-1) {
				os.write(datas, 0, len1);
			}
			os.flush();
			is.close();
		}
		os.close();
	}
	
	public static void main(String[] args) throws IOException {
		RandomAccessFileTest07 raf5 = new RandomAccessFileTest07("src/cn/sd/yz/io/Copy.java","dest",1024);
		raf5.split();
		raf5.merge("Copy.java");
	}
	

}