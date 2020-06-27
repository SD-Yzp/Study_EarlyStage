package cn.sd.yz.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 随机读取和写入流 RandomAccessFile
 * @author Yin
 *
 */
public class RandomAccessFileTest03 {
	public static void main(String[] args) throws IOException {
		File src = new File("src/cn/sd/yz/io/Copy.java");
		//总长度
		long len = src.length();
		//每块大小
		int blockSize = 1024;
		//多少块
		int block = (int)(Math.ceil(len*1.0/blockSize));
		//起始位置和实际大小
		int beginPos = 0;
		int actualSize = (int) (blockSize>len?len:blockSize);
		for(int i=0;i<block;i++) {
			beginPos = i*blockSize;
			if(i==block-1) { //最后一块
				actualSize = (int) len;
			}else {
				actualSize = blockSize;
				len-=actualSize;
			}
			System.out.println(i+"--->"+beginPos+"--->"+actualSize);
			split(beginPos,actualSize);
		}
	}
	
	//（尚学堂版本）分开思想：起始 实际大小
	/**
	 * 指定起始位置和实际大小
	 * @param beginPos
	 * @param actualSize
	 * @throws IOException
	 */
	public static void split(int beginPos,int actualSize) throws IOException {
		RandomAccessFile raf = new RandomAccessFile(new File("src/cn/sd/yz/io/Copy.java"),"r");
			
		//随机读取
		raf.seek(beginPos);  
		//读取
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
	
	//自己编的，太复杂
	public static void myTest2() throws IOException {
		RandomAccessFile raf = new RandomAccessFile(new File("src/cn/sd/yz/io/Copy.java"),"r");
		//起始位置
		int beginPos = 2;
		//读取的数量
		int actualSize = 100000;
		//默认每次读取的数量
		int readSize = 1024;
		//随机读取
		raf.seek(beginPos);  //从第二个位置获取
		//读取
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
	
	//指定起始位置，读取剩余的所有内容
	public static void test1() throws IOException {
		RandomAccessFile raf = new RandomAccessFile(new File("src/cn/sd/yz/io/Copy.java"),"r");
		//随机读取
		raf.seek(2);  //从第二个位置获取
		//读取
		byte[] datas = new byte[1024];
		int len = -1;
		while((len=raf.read(datas))!=-1) {
			String s = new String(datas,0,len);
			System.out.println(s);
		}
		
		raf.close();		
	}
	
}
