package cn.sd.yz.MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

/**
 * 测试时间处理类
 * java.sql.Date:表示年月日
 * java.sql.Time:表示时分秒
 * java.sql.Timestamp:表示年月日时分秒
 * @author Yin
 *
 */
public class Demo09 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			//加载驱动类
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc?serverTimezone=UTC","root","123456");
	
			for(int i=0;i<1000;i++) {				
				ps = conn.prepareStatement("insert into t_user3 (username,pwd,regTime,lastTime) values (?,?,?,?)");
				ps.setObject(1, "JJ"+i);
				ps.setObject(2, "123456");
				
				int rand = 1000000000+new Random().nextInt(1000000000);
				
				java.sql.Date date = new java.sql.Date(System.currentTimeMillis()-rand);
				java.sql.Timestamp stamp = new java.sql.Timestamp(System.currentTimeMillis()-rand);
				//如果需要指定日期，可以使用Calendar,DateFormat
				
				ps.setDate(3, date);
				ps.setTimestamp(4, stamp);
				ps.execute();
			}	
			System.out.println("执行完毕！");
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
