package cn.sd.yz.io;

import java.io.File;

/**
 * ��ӡ�ļ��д�С
 * @author Yin
 *
 */
public class TestCount {
	//�ļ��Ĵ�С
	private int len;
	//�ļ���·��
	private String path;
	//�ļ�
	private File src;
	//�ļ��еĸ���
	private int countDirectory;
	//�ļ��ĸ���
	private int countFile;
	
	public TestCount(String path) {	
		this.path = path;
		this.src = new File(path);
		len = countFileLength(src);
	}
	
	private int countFileLength(File file) {
		//�ݹ�ͷ
		if(file == null || !file.exists()) {
			throw new RuntimeException("�ļ������ڣ�") ;
		}
		
		int sum=0;
		if(file.isFile()) {			
			sum+=file.length();
			countFile++;
		}else {
			File[] src = file.listFiles();
			for(File f:src) {
				sum+=countFileLength(f);
			}
			countDirectory++;
		}
		
		return sum;
	}
			
	
	public int getLen() {
		return len;
	}

	public int getCountDirectory() {
		return countDirectory;
	}

	public int getCountFile() {
		return countFile;
	}

	
	
	
	public static void main(String[] args) {
		TestCount tc = new TestCount("D:\\JAVA Code\\workspace\\MyPro13");
		System.out.println(tc.getLen()+"-->"+tc.getCountDirectory()+"-->"+tc.getCountFile());
	}
	
	
}
