package day17.jdbc_quick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo03JDBCUpdate02 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try 
		{			
			//1.加载驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.创建sql语句
			String sql = "update account set balance=1500 where id=3";
			//3.获取Connection
			conn = DriverManager.getConnection("jdbc:mysql://localhost/db1?serverTimezone=UTC", "root", "123456");
			//4.获取Statement
			stmt = conn.createStatement();
			//5.执行sql
			int count = stmt.executeUpdate(sql); //受影响的行数
			//6.处理结果
			System.out.println(count);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
//			释放资源
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
	}
}
