package day17.jdbc_quick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo02JDBCUpdate01 {
	public static void main(String[] args) throws Exception {
		//1.导包
		//2.加载驱动
		Class.forName("com.mysql.cj.jdbc.Driver");
		//3.创建连接
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db1?serverTimezone=UTC","root","123456");
		//4.创建sql
		String sql = "insert into account values(null,'王五',3000)";
		//5.获取statement对象
		Statement stmt = conn.createStatement();
		//6.执行sql语言
		int count = stmt.executeUpdate(sql);  //返回值为影响的行数
		//7.处理结果
		System.out.println(count);  
		//8.释放资源
		stmt.close();
		conn.close();
	}
}
