package cn.sd.yz.io;

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * 测试打印流 PrintWriter
 * 跟PrintStream效果一致
 * @author Yin
 *
 */
public class PrintStreamTest02 {
	public static void main(String[] args) throws FileNotFoundException {		
		//打印到文件中
		PrintWriter pw = new PrintWriter(new BufferedOutputStream(new FileOutputStream("printWriter_test.txt")),true);  //增加true后自动刷新
		pw.println("打印流");
		pw.println("尘归尘，土归土");
//		ps.flush();   //使用缓冲流后一定要刷新
		
		
		
	}
}
