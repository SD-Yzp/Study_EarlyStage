package day17.jdbc_quick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo04JDBCUpdate03 {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try 
		{
			//1.加载驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.获取连接Connection
			conn = DriverManager.getConnection("jdbc:mysql://localhost/db1?serverTimezone=UTC", "root", "123456");
			//3.创建sql语句
			String sql = "create table student_test(id int,name varchar(20))";
			//4.获取Statement
			stmt = conn.createStatement();
			//5.执行sql
			int count = stmt.executeUpdate(sql);
			//6.处理结果
			System.out.println(count);  // DDL语句不会影响哪一行，只有DML语句会返回影响的行数
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
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
