package cn.sd.yz.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 随机读取和写入流 RandomAccessFile
 * 分割文件
 * 将分割后的文件保存到一个文件夹里
 * @author Yin
 *
 */
public class RandomAccessFileTest06 {
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



	public RandomAccessFileTest06(String str, int blockSize) throws IOException {
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
			//创建输出的文件夹
			FileOutputStream dest = new FileOutputStream("dest"+"/"+i+"Copy.java");
			splitFile(src,dest,beginPos,actualSize);
			System.out.println("-------我是分隔符-------");
			//释放输出流
			dest.close();
		}
	}
	
	
	
	private void splitFile(File src,FileOutputStream dest,int beginPos,int actualSize) throws IOException {
		//创建源
		RandomAccessFile raf = new RandomAccessFile(src,"r"); 
		//查找位置
		raf.seek(beginPos);
		//读取
		byte[] datas = new byte[actualSize];		
		dest.write(datas, 0, raf.read(datas));  //注意read！
		//释放资源
		raf.close();		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		RandomAccessFileTest06 raf5 = new RandomAccessFileTest06("src/cn/sd/yz/io/Copy.java",1024);
		raf5.split();
	}
	

}