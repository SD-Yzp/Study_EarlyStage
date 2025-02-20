package cn.sd.yz.test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

import org.omg.CORBA.portable.InputStream;

/**
 * 自定义文件系统类加载器
 * @author Yin
 *
 */
public class DecrptClassLoader extends ClassLoader
{
	private String rootDir;

	public DecrptClassLoader(String rootDir) 
	{
		super();
		this.rootDir = rootDir;
	}
	
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException 
	{
		Class<?> c = findLoadedClass(name);
		
		//首先查询有没有加载过这个类。如果已经加载，则直接返回加载好的类，如果没有，则加载新的类
		if(c!=null) 
		{
			return c;
		}
		else
		{
			ClassLoader parent = this.getParent();  
			try
			{
				c = parent.loadClass(name);			//委派给父类加载	
			}
			catch(Exception e)
			{				//不要打印
			}
		}
		
		if(c!=null) 
		{
			return c;
		}
		else
		{
			byte[] classData = getClassData(name);
			if(classData==null)
			{
				throw new ClassNotFoundException();
			}
			else
			{
				c = defineClass(name, classData, 0, classData.length);
			}
		}
		
		return c;
	}

	private byte[] getClassData(String classname) 
	{
		String path = rootDir + "/" + classname.replace('.', '/') + ".class";
		
		FileInputStream is = null;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try
		{
			is = new FileInputStream(path);
			
			
			int temp = 0;
			while((temp=is.read())!=-1)
			{
				baos.write(temp^0xff);
				baos.flush();
			}
			return baos.toByteArray();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally
		{
			try {
				if(is!=null)
				{
					is.close();
				}
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			try 
			{
				if(is!=null)
				{
					is.close();
				}
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}

}


