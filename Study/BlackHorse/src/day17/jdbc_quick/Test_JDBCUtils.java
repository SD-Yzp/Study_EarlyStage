package day17.jdbc_quick;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test_JDBCUtils {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try 
		{
			
			String sql = "select * from emp where id=?";
			
			conn = JDBCUtils.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, 1001);
			rs = pstmt.executeQuery();
			
			rs.next();
			System.out.println(rs.getString("ename")+"-----"+rs.getDouble("salary"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			
			JDBCUtils.close(rs, pstmt, conn);
		}
		
	}
}
