package day18.jdbc.ds;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo05Druid {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		try {
			conn = JDBCUtils.getConnection();
			String sql = "select * from emp where id>?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 1001);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getString("ename")+"---"+rs.getDouble("salary"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.close(rs,pstmt,conn);
		}
		
		
	}
}
