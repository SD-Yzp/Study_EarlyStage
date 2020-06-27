package recursion;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class TestFileFilter {

	public static void main(String[] args) 
	{
		File src = new File("f:/1");
		printFile3(src, 0);
	}
	
	
	
	//普通方法
	public static void printFile1(File src,int level)
	{

		if(src.isDirectory())
		{
			File[] f = src.listFiles();
			for (File file : f) {				
				printFile1(file,level+1);
			}
		}
		else 
		{
			if(src.getName().endsWith("gjf"))
			{
				System.out.println(src.getName());
			}
		}
				
	}
	
	//FileFilter过滤器方法
	public static void printFile2(File src,int level)
	{

		if(src.isDirectory())
		{
			File[] f = src.listFiles(new FileFilter() {
				
				@Override
				public boolean accept(File pathname) {
					// TODO Auto-generated method stub
					return pathname.isDirectory()||pathname.getName().endsWith("gjf");
				}
			});
			for (File file : f) {				
				printFile2(file,level+1);
			}
		}
		else 
		{
			System.out.println(src.getName());			
		}
				
	}
	
	//FileFilter过滤器方法
	public static void printFile3(File src,int level)
	{

		if(src.isDirectory())
		{
			File[] f = src.listFiles(new FilenameFilter() {
				
				@Override
				public boolean accept(File dir, String name) {
					// TODO Auto-generated method stub
					return new File(dir,name).isDirectory()||name.endsWith("car");
				}
			});
			for (File file : f) {				
				printFile3(file,level+1);
			}
		}
		else 
		{
			System.out.println(src.getName());			
		}
				
	}
}
