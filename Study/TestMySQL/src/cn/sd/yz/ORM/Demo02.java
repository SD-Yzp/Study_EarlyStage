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

public class Demo02 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc?serverTimezone=UTC","root","123456");
			ps = conn.prepareStatement("select * from t_emp where id>?");
			ps.setObject(1, 1);
			rs = ps.executeQuery();
			while(rs.next()) {
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("name", rs.getObject(2));
				map.put("age", rs.getObject(3));
				map.put("salary", rs.getObject(4));
				list.add(map);
			}			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs,ps,conn);			
		}
		
		for (Map<String, Object> map : list) {
			for (String s:map.keySet()) {
				System.out.print(map.get(s)+"\t");
			}
			System.out.println();
		}
		
	}
}
