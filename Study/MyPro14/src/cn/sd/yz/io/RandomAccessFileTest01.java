package cn.sd.yz.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 随机读取和写入流 RandomAccessFile
 * 指定起始位置，读取剩余的所有内容
 * @author Yin
 *
 */
public class RandomAccessFileTest01 {
	public static void main(String[] args) throws IOException {
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
