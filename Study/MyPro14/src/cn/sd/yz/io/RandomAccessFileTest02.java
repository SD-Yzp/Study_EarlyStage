package cn.sd.yz.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * �����ȡ��д���� RandomAccessFile
 * �ֿ�˼�룺��ʼ ʵ�ʴ�С
 * @author Yin
 *
 */
public class RandomAccessFileTest02 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile(new File("src/cn/sd/yz/io/Copy.java"),"r");
		//��ʼλ��
		int beginPos = 2;
		//��ȡ������
		int actualSize = 1026;		
		//�����ȡ
		raf.seek(beginPos);  //�ӵڶ���λ�û�ȡ
		//��ȡ
		byte[] datas = new byte[1024];
		int len = -1;
		while((len=raf.read(datas))!=-1) {	
			if(actualSize>=len) {				
				String s = new String(datas,0,len);
				System.out.println(s);
				actualSize-=len;
			}else {
				String s =new String(datas,0,actualSize);
				System.out.println(s);
				break;
			}			
		}
		
		
		raf.close();	
		
	}
	
	//�Լ���ģ�̫����
	public static void myTest2() throws IOException {
		RandomAccessFile raf = new RandomAccessFile(new File("src/cn/sd/yz/io/Copy.java"),"r");
		//��ʼλ��
		int beginPos = 2;
		//��ȡ������
		int actualSize = 100000;
		//Ĭ��ÿ�ζ�ȡ������
		int readSize = 1024;
		//�����ȡ
		raf.seek(beginPos);  //�ӵڶ���λ�û�ȡ
		//��ȡ
		while(true) {			
			if(actualSize>=readSize) {			
				byte[] datas = new byte[readSize];
				int len = -1;
				while((len=raf.read(datas))!=-1) {					
					String s = new String(datas,0,len);
					System.out.println(s);
					if(len<datas.length) {
						break;
					}
				}
				actualSize-=readSize;
			}else {
				byte[] datas = new byte[actualSize];
				int len = -1;
				while((len=raf.read(datas))!=-1) {					
					String s = new String(datas,0,len);
					System.out.println(s);
				}		
				break;				
			}
		}
		
		
		raf.close();
	}
	
	//ָ����ʼλ�ã���ȡʣ�����������
	public static void test1() throws IOException {
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
