package cn.sd.yz.MySQL;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 测试BLOB  二进制大对象的使用
 * @author Yin
 *
 */
public class Demo12 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		InputStream is = null;
		OutputStream os = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc?serverTimezone=UTC","root","123456");
			
//			ps = conn.prepareStatement("insert into t_user (username,headImg) values (?,?)");
//			ps.setObject(1, "zhanyi");
//			ps.setObject(2, new FileInputStream("d:/icon.jpg"));
//			ps.execute();
			
			ps = conn.prepareStatement("select * from t_user where id=?");
			ps.setObject(1, 20011);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				Blob b = rs.getBlob("headImg");
				is = b.getBinaryStream();
				os = new FileOutputStream("d:/a.jpg");
				int temp = 0;
				while((temp=is.read())!=-1) {
					os.write(temp);
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(os!=null) {
					os.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				if(is!=null) {
					is.close();
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
