package cn.sd.yz.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 随机读取和写入流 RandomAccessFile
 * 分割文件
 * @author Yin
 *
 */
public class RandomAccessFileTest04 {
	public static void main(String[] args) throws IOException {
		File src = new File("src/cn/sd/yz/io/Copy.java");
		//文件的总长度
		long len = src.length();
		//每块的长度
		int blockSize = 1024;
		//分成多少块
		int block = (int) Math.ceil(len*1.0/1024);
		//开始位置
		int beginPos = 0;
		int actualSize;
		for(int i=0;i<block;i++) {
			beginPos=i*blockSize;
			if(len<blockSize) { //最后一块
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
		//创建源
		RandomAccessFile raf = new RandomAccessFile(src,"r"); 
		//查找位置
		raf.seek(beginPos);
		//读取
		byte[] datas = new byte[actualSize];
		int len = - 1;
		while((len=raf.read(datas))!=-1) {
			System.out.println(new String(datas,0,len));
		}
		
	}
}
