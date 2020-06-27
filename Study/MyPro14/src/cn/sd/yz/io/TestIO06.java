package cn.sd.yz.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 测试文件输出字符流
 * 1、创建源
 * 2、选择流
 * 3、操作
 * 4、释放资源
 * @author Yin
 *
 */
public class TestIO06 {
	public static void main(String[] args) {
		//1、创建源
		File dest = new File("text06.txt");
		//2、选择流
		Writer writer = null;
		try {
			writer = new FileWriter(dest);
			//3、操作
			String str = "尘归尘，土归土，向着彼方\r\n";

//			//写法一
//			char[] datas = str.toCharArray();   //字符串---->字符数组
//			writer.write(datas,0,datas.length);
			
			//写法二
//			writer.write(str);

			//写法三
			writer.append(str).append("ninelie");  //append灵活
			writer.append("----Aimer");
			
			
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(writer!=null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
