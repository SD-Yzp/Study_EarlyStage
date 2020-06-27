package cn.sd.yz.io;

import java.io.*;

/**
 * 1����װ����
 * 2����װ�ͷ�
 * 
 * try...with...resource
 * @author Yin
 *
 */
public class FileUtils2 {
	public static void main(String[] args) {
		try(FileInputStream is = new FileInputStream("text06.txt");
			FileOutputStream os = new FileOutputStream("text06_copy.txt");) {			
			copy(is,os);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(FileInputStream is2 = new FileInputStream("desk.jpg");
			FileOutputStream os2 = new 	FileOutputStream("desk_copy.jpg");) {
			ByteArrayOutputStream bos2 = new ByteArrayOutputStream();
			copy(is2,bos2);
			byte[] datas = bos2.toByteArray();
			ByteArrayInputStream bis2 = new ByteArrayInputStream(datas);			
			copy(bis2,os2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void copy(InputStream is,OutputStream os) {
		byte[] datas = new byte[1024*10];
		int len = -1;
		try {
			while((len=is.read(datas))!=-1) { //�ֶζ���
				os.write(datas,0,len);  //�ֶ�д��
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//�ͷ���Դ
	public static void close(Closeable... ios) {		
		for(Closeable io:ios) {
			try {
				if(io!=null) {					
					io.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
	
}
