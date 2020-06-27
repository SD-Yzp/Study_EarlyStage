package cn.sd.yz.MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 测试Statement接口的用法，执行SQL语句，以及SQL注入问题
 * @author Yin
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc?serverTimezone=UTC","root","123456");
	
			stmt = conn.createStatement();
//			String sql = "insert into t_user (username,pwd,regTime) values ('赵六',6666,now())";
//			stmt.execute(sql);
//			String name = "苏三";
//			String sql = "insert into t_user (username,pwd,regTime) values ('"+name+"',7777,now())";
//			stmt.execute(sql);
		
			//测试SQL注入
			String id = "5 or 1=1";
			String sql = "delete form t_user where id="+id;
			stmt.execute(sql);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt!=null) {
					stmt.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(conn!=null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
