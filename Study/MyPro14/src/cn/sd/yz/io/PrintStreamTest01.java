package cn.sd.yz.io;

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * 测试打印流 PrintStream
 * @author Yin
 *
 */
public class PrintStreamTest01 {
	public static void main(String[] args) throws FileNotFoundException {
		//打印到控制台
		PrintStream ps = new PrintStream(System.out);
		ps.println("打印流");
		
		//打印到文件中
		ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("print_test.txt")),true);  //增加true后自动刷新
		ps.println("打印流");
		ps.println("尘归尘，土归土");
//		ps.flush();   //使用缓冲流后一定要刷新
		
		//重定向
		System.setOut(ps);
		System.out.println("last");  //重定向后System.out的输出端发生变化
		//重定向回控制台
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)),true));
		System.out.println("star");
		
		ps.close();
		
	}
}
