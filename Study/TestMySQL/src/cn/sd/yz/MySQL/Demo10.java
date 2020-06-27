package cn.sd.yz.MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 测试时间处理类
 * java.sql.Date:表示年月日
 * java.sql.Time:表示时分秒
 * java.sql.Timestamp:表示年月日时分秒
 * @author Yin
 *
 */
public class Demo10 {
	
	public static long str2Date(String dateStr) {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try {
			return format.parse(dateStr).getTime();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			//加载驱动类
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc?serverTimezone=UTC","root","123456");
	
			ps = conn.prepareStatement("select * from t_user3 where lastTime>? and lastTime<? order by lastTime");
			Timestamp start = new Timestamp(str2Date("2019-10-05 8:10:10"));
			Timestamp end = new Timestamp(str2Date("2019-10-06 9:10:12"));
			
			ps.setObject(1, start);
			ps.setObject(2, end);
			rs = ps.executeQuery();
			
			String blank = "---";
			
			while(rs.next()) {
				System.out.println(rs.getInt("id")+blank+rs.getString("username")+blank+rs.getString("pwd")+blank+rs.getDate("regTime")+blank+rs.getTimestamp("lastTime"));
			}
			
			
			System.out.println("执行完毕！");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {			
			try {
				if(rs!=null) {
					rs.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
