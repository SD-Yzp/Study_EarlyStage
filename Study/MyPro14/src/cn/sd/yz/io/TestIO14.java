package cn.sd.yz.io;

import java.io.*;

/**
 * 测试数据流 
 *DataInputStream DataOutputStream
 *顺序与写出一致
 * @author Yin
 *
 */
public class TestIO14 {
	public static void main(String[] args) throws IOException {
		//写出
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(baos));
		//操作数据类型+数据
		dos.writeUTF("编码辛酸泪");
		dos.writeInt(18);
		dos.writeBoolean(false);
		dos.writeChar('a');
		dos.flush();
		byte[] datas = baos.toByteArray();
		System.out.println(datas.length);   //如果面试问到如何查看占用了多少字节，就用ByteArrayOutputStream
		//读取
		DataInputStream dis = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
		//顺序必须与写出一致
		String msg = dis.readUTF();
		int age = dis.readInt();
		boolean flag = dis.readBoolean();
		char ch = dis.readChar();
		System.out.println(age);
	}
}
