package cn.sd.yz.io;

import java.io.File;

/**
 * 打印文件夹大小
 * @author Yin
 *
 */
public class TestCount {
	//文件的大小
	private int len;
	//文件的路径
	private String path;
	//文件
	private File src;
	//文件夹的个数
	private int countDirectory;
	//文件的个数
	private int countFile;
	
	public TestCount(String path) {	
		this.path = path;
		this.src = new File(path);
		len = countFileLength(src);
	}
	
	private int countFileLength(File file) {
		//递归头
		if(file == null || !file.exists()) {
			throw new RuntimeException("文件不存在！") ;
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
