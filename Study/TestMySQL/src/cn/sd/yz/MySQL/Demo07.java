package cn.sd.yz.MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 删除操作
 * @author Yin
 *
 */
public class Demo07 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			//加载驱动类
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc?serverTimezone=UTC","root","123456");
	
			String sql = "delete from t_user where id>7"; // ?占位符
			ps = conn.prepareStatement(sql);
	
			//可以使用setObject方法处理参数
			ps.setObject(1, 6);
			
			
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
