package day17.jdbc_quick;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {
	private static String path;
	private static String url;
	private static String user;
	private static String password;
	
	static
	{
		Properties pro = new Properties();
		ClassLoader classLoader = JDBCUtils.class.getClassLoader();
		InputStream is = classLoader.getResourceAsStream("jdbc_sql.properties");
		try {
			pro.load(is);
			path = pro.getProperty("path");
			url = pro.getProperty("url");
			user = pro.getProperty("user");
			password = pro.getProperty("password");	
			Class.forName(path);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public static Connection getConnection()
	{
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	/*
	public static void close(ResultSet rs,PreparedStatement pstmt,Connection conn)
	{
		if(rs!=null)
		{
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(pstmt!=null)
		{
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(conn!=null)
		{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	*/
	
	
	public static void close(AutoCloseable... c)
	{
		for (AutoCloseable temp : c) {			
			if(temp!=null)
			{
				
				try {
					temp.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
				
	}
	
}
