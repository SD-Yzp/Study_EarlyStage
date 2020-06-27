package cn.sd.yz.MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 测试事务的基本概念和用法
 * 事务的四大特点：原子性、一致性、隔离性、持久性
 * @author Yin
 *
 */
public class Demo08 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;
		try {
			//加载驱动类
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc?serverTimezone=UTC","root","123456");
	
			conn.setAutoCommit(false);  // JDBC中默认是true，自动提交事务
			
			ps1 = conn.prepareStatement("insert into t_user (username,pwd) values (?,?)");
			ps1.setObject(1, "JJ");
			ps1.setObject(2, "meiren");
			ps1.execute();
			System.out.println("插入一个用户，JJ");
			
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ps2 = conn.prepareStatement("insert into t_user (username,pwd) values (?,?,?)");
			ps2.setObject(1, "GG");
			ps2.setObject(2, "yequ");
			ps2.execute();
			System.out.println("插入一个用户，GG");
			
			conn.commit();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			try {
				conn.rollback(); //回滚
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps2!=null) {
					ps2.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(ps1!=null) {
					ps1.close();
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
