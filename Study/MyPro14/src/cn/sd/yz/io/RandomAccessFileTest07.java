package cn.sd.yz.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 随机读取和写入流 RandomAccessFile
 * 分割文件
 * 将分割后的文件保存到一个文件夹里
 * 追加合并功能
 * @author Yin
 *
 */
public class RandomAccessFileTest07 {
	private String src_str;
	private String dest_str;  //目标文件夹
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



	public RandomAccessFileTest07(String src_str,String dest_str,int blockSize) throws IOException {
		super();
		this.src_str = src_str;
		this.dest_str = dest_str;
		this.blockSize = blockSize;		
	}


	private void split() throws IOException {		
		//创建源
		File src = new File(src_str);
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
			FileOutputStream dest = new FileOutputStream(dest_str+"/"+i+"_"+"Copy.java");
			splitFile(src,dest,beginPos,actualSize);
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
		dest.write(datas, 0, raf.read(datas));
		//释放资源
		raf.close();		
	}
	
	private void merge(String destPath) throws IOException {
		//创建源
		File src = new File(src_str);
		//文件的总长度
		long len = src.length();
		//分成多少块
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