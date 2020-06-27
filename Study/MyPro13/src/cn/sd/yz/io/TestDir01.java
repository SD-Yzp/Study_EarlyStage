package cn.sd.yz.io;

import java.io.File;

/**
 * 测试mdkir、mdkirs
 * mkdir：创建目录，必须存在上级目录
 * mkdirs：同mkdir，如果上级目录不存在，同时创建
 * @author Yin
 *
 */
public class TestDir01 {
	public static void main(String[] args) {
		File dir = new File("D:/JAVA Code/workspace/MyPro13/dir/test1");
		
		//1、使用mkdir创建上级目录不存在的目录
		boolean flag = dir.mkdir();
		System.out.println(flag);
		
		//2、使用mkdirs创建上级目录不存在的目录   
		//注意：mkdirs也存在创建不成功的情况，比如文件夹的名称为IO之类
		flag = dir.mkdirs();
		System.out.println(flag);
		
		//1、使用mkdir创建上级目录不存在的目录
		dir = new File("D:/JAVA Code/workspace/MyPro13/dir/test2");
		flag = dir.mkdir();
		System.out.println(flag);
	}
}
