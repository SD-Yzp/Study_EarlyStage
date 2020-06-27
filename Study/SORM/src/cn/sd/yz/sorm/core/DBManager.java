package cn.sd.yz.sorm.core;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import cn.sd.yz.sorm.bean.Configuration;

/**
 * 根据配置信息，维持连接对象的管理(增加连接池功能)
 * @author Yin
 *
 */
public class DBManager 
{

	private static Configuration conf;
	
	static   //静态代码块
	{
		Properties pros = new Properties();
		try
		{
			pros.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}	
		
		conf = new Configuration();
		conf.setDriver(pros.getProperty("driver"));
		conf.setPoPackage(pros.getProperty("poPackage"));
		conf.setPwd(pros.getProperty("pwd"));
		conf.setSrcPath(pros.getProperty("srcPath"));
		conf.setUrl(pros.getProperty("url"));
		conf.setUser(pros.getProperty("user"));
		conf.setUsingDB(pros.getProperty("usingDB"));
		
	}
	
	
	public static Connection getConn()
	{
		try 
		{
			Class.forName(conf.getDriver());
			return DriverManager.getConnection(conf.getUrl(),conf.getUser(),conf.getPwd());
			//直接建立连接，后期增加连接池处理，提高效率！！
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static void close(AutoCloseable... c)
	{
		for (AutoCloseable autoCloseable : c) 
		{
			try 
			{
				autoCloseable.close();
			} 
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	public static Configuration getConf()
	{
		return conf;
	}
	
}
