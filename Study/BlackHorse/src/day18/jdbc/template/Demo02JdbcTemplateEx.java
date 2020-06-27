package day18.jdbc.template;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;

import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import day18.jdbc.ds.JDBCUtils;

public class Demo02JdbcTemplateEx {
	
	
	//Junit单元测试，可以让方法独立运行
	
	@Test
	public void test1()
	{
		//1.获取JdbcTemplate对象
		JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
		//2.创建sql
		/**
		 * 修改1001号的数据salary为10000
		 */
		String sql = "update emp set salary=? where id=?";
		//3.执行sql
		template.update(sql, 10000,1001);
	
		
	
	}
	
	@Test
	public void test2()  // Junit测试一个方法需要将光标放在方法名上
	{
		//1.获取JdbcTemplate对象
		JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
		//2.创建sql
		/**
		 * 添加一条记录
		 */	
		String sql = "insert into emp(id,ename,dept_id) values(?,?,?)";
		//3.执行sql
		template.update(sql, 1015,"郭靖",10);
		
		
	}
	
	@Test
	public void test3()
	{
		//1.获取JdbcTemplate对象
		JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
		
		//2.创建sql
		/**
		 * 删除刚来添加的语句
		 */
		String sql = "delete from emp where id=?";
		
		//3.执行sql
		template.update(sql, 1015);
	}
	
	
	@Test
	public void test4()
	{
		//1.获取JdbcTemplate对象
		JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
		//2.创建sql
		/**
		 * 查询id为1001的记录，将其封装到Map集合
		 * 注意：这个方法查询的结果集长度只能是1
		 */
		String sql = "select * from emp where id=?";
		
		//3.处理sql
		Map<String,Object> map = template.queryForMap(sql, 1001);
		System.out.println(map);
	}
	
	@Test
	public void test5()
	{
		//1.获取JdbcTemplate对象
		JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
		//2.创建sql
		/**
		 * 获取id>1001的所有记录，将每条记录封装到Map中，所有记录封装到List中
		 */
		String sql = "select * from emp where id>?";
		
		//3.处理sql
		List<Map<String,Object>> list = template.queryForList(sql, 1001);
		for (Map<String, Object> map : list) {
			System.out.println(map);
		}
		
	}
	
	
	
	@Test
	public void test6()
	{
		//1.创建JdbcTemplate对象
		JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
		
		//2.创建sql
		/**
		 * 查询所有记录将记录封装到Emp对象的List集合
		 */
		String sql = "select * from emp";
		
		//3.执行sql
		List<Emp> list = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
		for (Emp emp : list) {
			System.out.println(emp);
		}
		
	}
	
	/**
	 * 7.查询总记录数
	 */
	@Test
	public void test7()
	{
		JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
		String sql = "select count(id) from emp";
		Long count = template.queryForObject(sql, Long.class);
		System.out.println(count);
		
	}
	
	
}
