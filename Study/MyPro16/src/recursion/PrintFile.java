package recursion;

import java.io.File;

/**
 * 递归打印文件名
 * @author Yin
 *
 */
public class PrintFile 
{
	public static void main(String[] args) 
	{
		File src = new File("f:/1");
//		System.out.println(src.getName());
		printFile(src, 0);
	}
	
	
	public static void printFile(File src,int level)
	{
		for(int i=0;i<level;i++)
		{
			System.out.print("-");
		}
		
		System.out.println(src.getName());
		
		if(src.isDirectory())
		{
			File[] f = src.listFiles();
			for (File file : f) {				
				printFile(file,level+1);
			}
		}
		
		
	}
}
