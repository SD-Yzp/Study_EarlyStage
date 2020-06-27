package day17.jdbc_quick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo01JDBCQuick {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?serverTimezone=UTC", "root", "123456");
		
		String sql = "update account set balance=500 where id=1";
		
		Statement stmt = conn.createStatement();
		
		int result = stmt.executeUpdate(sql);
		
		System.out.println(result);
		
		stmt.close();
		conn.close();
	}
}
