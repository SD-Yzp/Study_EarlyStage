package day18.jdbc.ds;

import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;


public class Demo04Druid {
	public static void main(String[] args) throws Exception {
		Properties pro = new Properties();
		
		pro.load(Demo04Druid.class.getClassLoader().getResourceAsStream("druid.properties"));
		
		DataSource ds = DruidDataSourceFactory.createDataSource(pro);
		
		Connection conn = ds.getConnection();
		
		System.out.println(conn);
	}
}
