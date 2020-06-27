package cn.sd.yz.io;

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * ���Դ�ӡ�� PrintStream
 * @author Yin
 *
 */
public class PrintStreamTest01 {
	public static void main(String[] args) throws FileNotFoundException {
		//��ӡ������̨
		PrintStream ps = new PrintStream(System.out);
		ps.println("��ӡ��");
		
		//��ӡ���ļ���
		ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("print_test.txt")),true);  //����true���Զ�ˢ��
		ps.println("��ӡ��");
		ps.println("���鳾��������");
//		ps.flush();   //ʹ�û�������һ��Ҫˢ��
		
		//�ض���
		System.setOut(ps);
		System.out.println("last");  //�ض����System.out������˷����仯
		//�ض���ؿ���̨
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)),true));
		System.out.println("star");
		
		ps.close();
		
	}
}
