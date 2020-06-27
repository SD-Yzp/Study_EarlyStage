package cn.sd.yz.MySQL;

import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 测试CLOB  文本大对象的使用
 * 包括：将字符串、文件内容插入数据库中的CLOB字段、将CLOB字段取出来的操作
 * @author Yin
 *
 */
public class Demo11 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Reader r = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc?serverTimezone=UTC","root","123456");
			
//			ps = conn.prepareStatement("insert into t_user (username,myInfo) values (?,?)");
//			ps.setObject(1, "tiankong");
////			ps.setClob(2, new FileReader(new File("d:a.txt")));  //方法：将文本文件内容直接输入到数据库中
//			ps.setClob(2,new BufferedReader  
//					(new InputStreamReader
//							(new ByteArrayInputStream
//									("tianxing".getBytes()))));  //方法：将程序中的字符串输入到数据库的CLOD字段中
//			ps.execute();
			
			
			ps = conn.prepareStatement("select * from t_user where id>?");
			ps.setObject(1, 3);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				Clob clob = rs.getClob("myInfo");
				r = clob.getCharacterStream();
				int temp = 0;
				while((temp=r.read())!=-1) {
					System.out.println((char)temp);
				}
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(r!=null) {
					r.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				if(rs!=null) {
					rs.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				if(ps!=null) {
					ps.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				if(conn!=null) {
					conn.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
