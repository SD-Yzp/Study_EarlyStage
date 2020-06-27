package day17.jdbc_quick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Demo06JDBCQuery02 {
	public static void main(String[] args) {
		List<Emp> list = listAll();
		
		for (Emp emp : list) {
			System.out.println(emp);
		}
	}

	public static List<Emp> listAll()
	{
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Emp> list = new ArrayList<Emp>();
		
		try
		{
			//1.加载驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.获取连接
			conn = DriverManager.getConnection("jdbc:mysql://localhost/db1?serverTimezone=UTC","root","123456");
			//3.建立sql  DQL
			String sql = "select * from emp";
			//4.获取Statement
			stmt = conn.createStatement();
			//5.处理sql_DQL语言
			rs = stmt.executeQuery(sql);
			//6.处理结果
			Emp emp = null;
			while(rs.next())
			{
				emp = new Emp();
				emp.setId(rs.getInt("id"));
				emp.setEname(rs.getString("ename"));
				emp.setJob_id(rs.getInt("job_id"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setJoindate(rs.getDate("joindate"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setBonus(rs.getDouble("bonus"));
				emp.setDept_id(rs.getInt("dept_id"));
				
				list.add(emp);
			}	
			
			return list;
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

		return null;
		
	}
	
}
