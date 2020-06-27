package day18.jdbc.ds;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * C3P0演示
 * @author Yin
 *
 */

public class Demo02C3P0 {
	public static void main(String[] args) throws SQLException {
		DataSource ds = new ComboPooledDataSource();
		
		Connection conn = null;
		
		for(int i=0;i<10;i++)
		{
			conn = ds.getConnection();
			System.out.println(i+"----"+conn);
		}
	}
}
