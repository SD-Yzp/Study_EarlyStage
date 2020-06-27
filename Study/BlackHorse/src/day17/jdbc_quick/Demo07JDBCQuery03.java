package day17.jdbc_quick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo07JDBCQuery03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入账户：");
		String username = sc.nextLine();
		System.out.println("请输入密码：");
		String password = sc.nextLine();
		
		if(login(username,password))
		{
			System.out.println("登录成功");
		}
		else
		{
			System.out.println("登录失败");
		}

	}
	
	public static boolean login(String username,String password)
	{
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try 
		{
			//1.加载驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.获取连接Connection
			conn = DriverManager.getConnection("jdbc:mysql://localhost/db1?serverTimezone=UTC","root","123456");
			//3.创建DQL
			String sql = "select * from user where username='"+username+"' and password='"+password+"'";
			//4.获取Statement
			stmt = conn.createStatement();
			//5.执行sql
			rs = stmt.executeQuery(sql);
			//6.处理结果
			return rs.next();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
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
			
			if(stmt!=null)
			{
				try {
					stmt.close();
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
		
		return false;
	}
}
