package cn.sd.yz.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class EncrptUtil 
{
	public static void main(String[] args) 
	{
		encrpt("f:/myjava/HelloWorld.class", "f:/myjava/temp/HelloWorld.class");
	}
	
	private static void encrpt(String src, String dest) 
	{
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try 
		{
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dest);
			
			int temp = 0;
			while((temp=fis.read())!=-1)
			{
				fos.write(temp^0xff);  //取反操作
				fos.flush();
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(fis!=null)
				{
					fis.close();
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			try
			{
				if(fos!=null)
				{
					fos.close();
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
