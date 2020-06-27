package day18.jdbc.ds;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;


/**
 * 测试C3P0
 * @author Yin
 *
 */
public class Demo03C3P0 {
	public static void main(String[] args) throws SQLException {
		DataSource ds = new ComboPooledDataSource("otherc3p0");
		
		Connection conn = null;
		
		for(int i=0;i<8;i++)
		{
			conn = ds.getConnection();
			System.out.println(i+"---"+conn);
		}
	}
}
