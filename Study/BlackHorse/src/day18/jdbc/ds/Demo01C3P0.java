package day18.jdbc.ds;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Demo01C3P0 {
	public static void main(String[] args) throws SQLException {
		DataSource ds = new ComboPooledDataSource();
		
		Connection conn = ds.getConnection();
		
		System.out.println(conn);
	}
}
