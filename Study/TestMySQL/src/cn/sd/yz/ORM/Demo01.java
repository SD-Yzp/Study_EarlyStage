package cn.sd.yz.ORM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 使用Object[]来封装一条记录
 * 使用List<Object[]>存储多条记录
 * @author Yin
 *
 */

public class Demo01 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Object[]> list = new ArrayList<Object[]>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc?serverTimezone=UTC","root","123456");
			ps = conn.prepareStatement("select * from t_emp where id>?");
			ps.setObject(1, 1);
			rs = ps.executeQuery();
			while(rs.next()) {
				Object[] o = new Object[3];
				o[0] = rs.getObject(2);
				o[1] = rs.getObject(3);
				o[2] = rs.getObject(4);
				list.add(o);
			}			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs,ps,conn);			
		}
		
		for (Object[] objects : list) {
			System.out.println(objects[0]+"---"+objects[1]+"---"+objects[2]);
		}
		
	}
}
