package cn.sd.yz.io;

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * ���Դ�ӡ�� PrintWriter
 * ��PrintStreamЧ��һ��
 * @author Yin
 *
 */
public class PrintStreamTest02 {
	public static void main(String[] args) throws FileNotFoundException {		
		//��ӡ���ļ���
		PrintWriter pw = new PrintWriter(new BufferedOutputStream(new FileOutputStream("printWriter_test.txt")),true);  //����true���Զ�ˢ��
		pw.println("��ӡ��");
		pw.println("���鳾��������");
//		ps.flush();   //ʹ�û�������һ��Ҫˢ��
		
		
		
	}
}
