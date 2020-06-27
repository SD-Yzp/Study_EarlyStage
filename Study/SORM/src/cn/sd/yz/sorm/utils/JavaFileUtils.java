package cn.sd.yz.sorm.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cn.sd.yz.sorm.bean.ColumnInfo;
import cn.sd.yz.sorm.bean.JavaFieldGetSet;
import cn.sd.yz.sorm.bean.TableInfo;
import cn.sd.yz.sorm.core.DBManager;
import cn.sd.yz.sorm.core.MySqlTypeConvertor;
import cn.sd.yz.sorm.core.TableContext;
import cn.sd.yz.sorm.core.TypeConvertor;

/**
 * 封装了生成Java文件(源代码)常用的操作
 * @author Yin
 *
 */
public class JavaFileUtils 
{

	
	public static JavaFieldGetSet createFieldGetSetSRC(ColumnInfo column,TypeConvertor convertor)
	{
		JavaFieldGetSet jfgs = new JavaFieldGetSet();
		
		String javaFieldType = convertor.databaseType2JavaType(column.getDataType());
		
		jfgs.setFieldInfo("\tprivate "+javaFieldType+" "+column.getName()+";\n");
		
		
		//public String getUsername(){return username;}
		//生成get方法的源代码
		StringBuilder getSrc = new StringBuilder();
		getSrc.append("\tpublic "+javaFieldType+" get"+StringUtils.firstChar2UpperCase(column.getName())+"()\n\t{\n");
		getSrc.append("\t\treturn "+column.getName()+";\n");
		getSrc.append("\t}\n");
		jfgs.setGetInfo(getSrc.toString());
		
		//public void setUsername(String username){this.username=username;}
		//生成set方法的源代码
		StringBuilder setSrc = new StringBuilder();
		setSrc.append("\tpublic void set"+StringUtils.firstChar2UpperCase(column.getName())+"(");
		setSrc.append(javaFieldType+" "+column.getName()+")\n");
		setSrc.append("\t{\n");
		setSrc.append("\t\tthis."+column.getName()+"="+column.getName()+";\n\t}\n");
		jfgs.setSetInfo(setSrc.toString());
		
		return jfgs;
		
	}
	
	
	public static String createJavaSrc(TableInfo tableInfo,TypeConvertor convertor)
	{
		Map<String,ColumnInfo> columns = tableInfo.getColumns();
		
		List<JavaFieldGetSet> javaFields = new ArrayList<JavaFieldGetSet>();
		
		for (ColumnInfo c : columns.values()) 
		{
			javaFields.add(createFieldGetSetSRC(c,convertor));
		}
		
		StringBuilder src = new StringBuilder();
		
		//生成package语句
		src.append("package "+DBManager.getConf().getPoPackage()+";\n\n");
		//生成import语句
		src.append("import java.sql.*;\n");
		src.append("import java.util.*;\n\n");
		//生成类声明语句
		src.append("public class "+StringUtils.firstChar2UpperCase(tableInfo.getTname())+" {\n\n");
		
		//生成属性列表
		for(JavaFieldGetSet f:javaFields)
		{
			src.append(f.getFieldInfo());
		}
		src.append("\n\n");
		
		//生成get方法列表
		for(JavaFieldGetSet f:javaFields)
		{
			src.append(f.getGetInfo());
		}
		
		//生成set方法列表
		for(JavaFieldGetSet f:javaFields)
		{
			src.append(f.getSetInfo());
		}
		
		//生成类结束
		src.append("}\n");
		System.out.println(src.toString());
		return src.toString();
	}
	
	public static void createJavaPOFile(TableInfo tableInfo,TypeConvertor convertor)
	{
		String src = createJavaSrc(tableInfo,convertor);
		
		String srcPath = DBManager.getConf().getSrcPath()+"\\";
		String packagePath = DBManager.getConf().getPoPackage().replace(".", "\\");   //注意正则与转义
		File f = new File(srcPath+packagePath);
		
		if(!f.exists())
		{
			f.mkdirs();
		}
		
		BufferedWriter bw = null;
		
		try
		{
			bw = new BufferedWriter(
					new FileWriter(
							f.getAbsoluteFile()+"/"+StringUtils.firstChar2UpperCase(tableInfo.getTname())+".java"));
			
			bw.write(src);
			System.out.println("建立表"+tableInfo.getTname()+"对应的java类："+StringUtils.firstChar2UpperCase(tableInfo.getTname())+".java");
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		finally
		{
		
			try 
			{
				if(bw!=null)
				{
					bw.close();
				}
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	public static void main(String[] args) 
	{
//		ColumnInfo ci = new ColumnInfo("id", "int", 0);
//		JavaFieldGetSet f = createFieldGetSetSRC(ci,new MySqlTypeConvertor());
//		System.out.println(f);
	 
		
		Map<String,TableInfo> map = TableContext.tables;
		TableInfo t = map.get("t_emp");
		createJavaPOFile(t, new MySqlTypeConvertor());
		
		
//		Map<String,TableInfo> map = TableContext.tables;		
//		for(TableInfo t:map.values())
//		{
//			createJavaPOFile(t,new MySqlTypeConvertor());
//		}
	
	
	
	}	
}
