package cn.sd.yz.sorm.core;

/**
 * mysql数据类型和java数据类型的转换
 * @author Yin
 *
 */
public class MySqlTypeConvertor implements TypeConvertor 
{

	//数据库里英文一般都是大写
	@Override
	public String databaseType2JavaType(String columnType) 
	{
		//VARCHAR--->String
		if("VARCHAR".equals(columnType)||"CHAR".equals(columnType))
		{
			return "String";
		}
		else if("INT".equals(columnType)
				||"tinyint".equals(columnType)
				||"smallint".equals(columnType)
				||"integer".equals(columnType))
		{
			return "Integer";
		}
		else if("BIGINT".equals(columnType))
		{
			return "Long";
		}
		else if("DOUBLE".equals(columnType)
				||"float".equals(columnType))
		{
			return "Double";
		}
		else if("CLOB".equals(columnType))
		{
			return "java.sql.Clob";
		}
		else if("BLOB".equals(columnType))
		{
			return "java.sql.Blob";
		}
		else if("DATA".equals(columnType))
		{
			return "java.sql.Data";
		}
		else if("TIME".equals(columnType))
		{
			return "java.sql.Time";
		}
		else if("TIMESTAMP".equals(columnType))
		{
			return "java.sql.Timestamp";
		}
	
		return null;
	}

	
	
	
	
	@Override
	public String javaType2DatabaseType(String javaType) 
	{
		// TODO Auto-generated method stub
		return null;
	}

}
