package cn.sd.yz.sorm.bean;

import java.util.List;
import java.util.Map;

/**
 * 存储表结构的信息
 * @author Yin
 *
 */
@SuppressWarnings("all")
public class TableInfo 
{
	/**
	 * 表名
	 */
	private String tname;
	/**
	 * 所有字段的信息
	 */
	private Map<String, ColumnInfo> columns;
	/**
	 * 唯一主键
	 */
	private ColumnInfo onlyPriKey;
	/**
	 * 如果联合主键，则在这里存储
	 */
	private List<ColumnInfo> priKeys;  
	
	
	public String getTname() 
	{
		return tname;
	}


	public void setTname(String tname) 
	{
		this.tname = tname;
	}


	public Map<String, ColumnInfo> getColumns() 
	{
		return columns;
	}


	public void setColumns(Map<String, ColumnInfo> columns) 
	{
		this.columns = columns;
	}


	


	

	public List<ColumnInfo> getPriKeys() 
	{
		return priKeys;
	}


	public void setPriKeys(List<ColumnInfo> priKeys) 
	{
		this.priKeys = priKeys;
	}
	

	public ColumnInfo getOnlyPriKey() {
		return onlyPriKey;
	}


	public void setOnlyPriKey(ColumnInfo onlyPriKey) {
		this.onlyPriKey = onlyPriKey;
	}


	public TableInfo(String tname, Map<String, ColumnInfo> columns, ColumnInfo onlyPriKey) 
	{
		super();
		this.tname = tname;
		this.columns = columns;
		this.onlyPriKey = onlyPriKey;
	}


	public TableInfo() 
	{
		super();
		// TODO Auto-generated constructor stub
	}


	public TableInfo(String tname, List<ColumnInfo> priKeys, Map<String, ColumnInfo> columns) 
	{
		super();
		this.tname = tname;
		this.priKeys = priKeys;
		this.columns = columns;
	}
	
	
	
}
