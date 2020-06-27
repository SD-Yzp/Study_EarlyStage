package cn.sd.yz.ORM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 使用Object[]来封装一条记录
 * 使用List<Object[]>存储多条记录
 * @author Yin
 *
 */

public class Demo03 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Emp> list = new ArrayList<Emp>();
		try {
			conn = JDBCUtil.getMysqlConn();
			ps = conn.prepareStatement("select * from t_emp where id>?");
			ps.setObject(1, 1);
			rs = ps.executeQuery();
			while(rs.next()) {
				Emp emp = new Emp(rs.getInt(1),rs.getString(2),rs.getDouble(4),rs.getInt(3));
				list.add(emp);
			}			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs,ps,conn);			
		}
		
		for (Emp emp : list) {
			System.out.println(emp.getId()+"---"+emp.getName()+"---"+emp.getAge()+"---"+emp.getSalary());
		}
		
	}
}
