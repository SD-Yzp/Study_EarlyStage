package day18.jdbc.template;

import org.springframework.jdbc.core.JdbcTemplate;

import day18.jdbc.ds.JDBCUtils;

public class Demo01JDBC_Template {
	public static void main(String[] args) {
		JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());



		String sql = "update account set balance=? where id = ?";

		int count = template.update(sql,3000,3);
		
		System.out.println(count);
	}
}
