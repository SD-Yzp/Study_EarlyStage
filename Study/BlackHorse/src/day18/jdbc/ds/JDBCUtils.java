package day18.jdbc.ds;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;


/**
 * JDBC工具类，为druid加载配置文件
 * @author Yin
 *
 */
public class JDBCUtils {
	private static DataSource ds;
	
	static {
		
		try {
			Properties pro = new Properties();
			pro.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
			ds = DruidDataSourceFactory.createDataSource(pro);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection() throws SQLException
	{
		return ds.getConnection();
	}
	
	public static void close(AutoCloseable... acs)
	{
		for (AutoCloseable ac : acs) {
			if(ac!=null)
			{
				try {
					ac.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
	public static DataSource getDataSource()
	{
		return ds;
	}
}
