package cn.sd.yz.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 随机读取和写入流 RandomAccessFile
 * 分割文件
 * 封装
 * @author Yin
 *
 */
public class RandomAccessFileTest05 {
	private String str;
	//每块的长度
	private int blockSize;
	//实际长度
	private int actualSize;
	//开始位置
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
		//创建源
		File src = new File(str);
		//文件的总长度
		long len = src.length();
		//分成多少块
		int block = (int) Math.ceil(len*1.0/1024);
		for(int i=0;i<block;i++) {
			beginPos=i*blockSize;
			if(len<blockSize) { //最后一块
				actualSize = (int) len; 
			}else {
				actualSize = blockSize;
				len-=actualSize;				
			}
			splitFile(src,beginPos,actualSize);
			System.out.println("-------我是分隔符-------");
		}
	}
	
	
	
	private void splitFile(File src,int beginPos,int actualSize) throws IOException {
		//创建源
		RandomAccessFile raf = new RandomAccessFile(src,"r"); 
		//查找位置
		raf.seek(beginPos);
		//读取
		byte[] datas = new byte[actualSize];
		System.out.println(new String(datas,0,raf.read(datas)));
		//释放资源
		raf.close();		
	}
	
	public static void main(String[] args) throws IOException {
		RandomAccessFileTest05 raf5 = new RandomAccessFileTest05("src/cn/sd/yz/io/Copy.java",1024);
		raf5.split();
	}
	

}