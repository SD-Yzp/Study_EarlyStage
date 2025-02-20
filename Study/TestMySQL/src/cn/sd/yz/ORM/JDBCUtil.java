package cn.sd.yz.ORM;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


/**
 * 由于没有properties文件，所以注释掉类加载器的东西
 * @author Yin
 *
 */

public class JDBCUtil {
	static Properties pros = null;
	
	static {
		pros = new Properties();
		try {
			pros.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getMysqlConn() {
		try {
			Class.forName(pros.getProperty("mysqlDriver"));
			return DriverManager.getConnection(pros.getProperty("mysqlURL"),
					pros.getProperty("mysqlUser"),pros.getProperty("mysqlPwd"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
//	
//	
//	public static Connection getOracleConn() {
//		try {
//			Class.forName(pros.getProperty("oracleDriver"));
//			return DriverManager.getConnection(pros.getProperty("oracleURL"),
//					pros.getProperty("oracleUser"),pros.getProperty("oraclePwd"));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//	}
	
	public static void close(AutoCloseable... c) {
		for(AutoCloseable temp:c) {			
			try {
				if(temp!=null) {
					temp.close();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
