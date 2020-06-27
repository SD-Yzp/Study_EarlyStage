package day17.jdbc_quick;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo08Commit {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		ResultSet rs = null;
		
		try {
			//1.获取连接
			conn = JDBCUtils.getConnection();
			//2.开启事务
			conn.setAutoCommit(false);
			//3.创建sql语句
			String sql1 = "update account set balance=balance-? where id=?";
			String sql2 = "update account set balance=balance+? where id=?";
			//4.获取PreparedStatement
			pstmt1 = conn.prepareStatement(sql1);
			pstmt2 = conn.prepareStatement(sql2);
			//5.设置参数
			pstmt1.setDouble(1, 700);
			pstmt1.setInt(2, 1);
			pstmt2.setDouble(1, 700);
			pstmt2.setInt(2, 2);
			//6.执行sql语句
			int count1 = pstmt1.executeUpdate();
			int count2 = pstmt2.executeUpdate();
			//7.处理sql语句
			if(count1>0)
			{
				System.out.println("付款成功");
			}
			else 
			{
				System.out.println("付款失败");
			}
			
//			int a = 3/0; // 设置一个错误
			
			if(count2>0)
			{
				System.out.println("收款成功");
			}
			else 
			{
				System.out.println("收款失败");
			}
			
			//8.提交事务
			conn.commit();
			
		}catch(Exception e){
			try {
				//9.出现错误，回滚
				conn.rollback();
				System.out.println("出现错误，取消操作");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			JDBCUtils.close(rs, pstmt1, pstmt2, conn);
		}
	}
}
