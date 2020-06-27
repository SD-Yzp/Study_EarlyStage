package cn.sd.yz.MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 测试批处理的基本用法
 * 要点：
 * 1、使用Statement
 * 2、conn.setAutoCommit(false)
 * @author Yin
 *
 */
public class Demo06 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//加载驱动类
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc?serverTimezone=UTC","root","123456");
	
			conn.setAutoCommit(false);  // 设为手动提交
			long start = System.currentTimeMillis();
			stmt = conn.createStatement();
			
			for(int i=0;i<20000;i++) {
				stmt.addBatch("insert into t_user2 (username,pwd,regTime) values ('yin"+i+"',666,now())");
			}
			stmt.executeBatch();
			conn.commit();
			long end = System.currentTimeMillis();
			System.out.println("插入20000条数据，耗时："+(end-start)+"毫秒");
			

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//遵循：resultset-->statement-->connection这样的关闭顺序！一定要将三个trycatch块分开写！
			try {
				if(rs!=null) {
					rs.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
