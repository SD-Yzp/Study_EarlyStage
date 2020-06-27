package Test1;

import java.io.File;

public class TestFile {
	public static void main(String[] args) {		
		File src = new File("F:/1");
		printFile(src,0);
	}
	
	public static void printFile(File src,int level) {
		for(int i=0;i<level;i++) 
		{
			System.out.print("-");
		}
		System.out.println(src.getName());
		if(src.isDirectory()) 
		{
			File[] file = src.listFiles();
			for(File f:file) 
			{
				printFile(f,level+1);
			}
		}
	}
}
