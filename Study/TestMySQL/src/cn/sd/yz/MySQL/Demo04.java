package cn.sd.yz.MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 测试PreparedStatement的基本用法
 * 优点：
 * 1、预防sql注入
 * 2、内置的处理，效率高！
 * @author Yin
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			//加载驱动类
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc?serverTimezone=UTC","root","123456");
	
			String sql = "insert into t_user (username,pwd,regTime) values (?,?,?)"; // ?占位符
			ps = conn.prepareStatement(sql);
//			ps.setString(1, "song"); // 参数索引是从1开始计算，而不是0
//			ps.setString(2, "sdjfoi");
//			ps.setDate(3, new java.sql.Date(System.currentTimeMillis()));
			
			//可以使用setObject方法处理参数
			ps.setObject(1, "nian");
			ps.setObject(2, "sanyan");
			ps.setObject(3, new java.sql.Date(System.currentTimeMillis()));
			
			
//			ps.execute();
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null) {
					ps.close();
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
