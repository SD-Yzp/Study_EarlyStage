package cn.sd.yz.commons;

import java.io.File;

import org.apache.commons.io.FileUtils;

/**
 * 大小
 * @author Yin
 *
 */
public class CIOTest01 {
	public static void main(String[] args) {
		//文件大小
		long len = FileUtils.sizeOf(new File("src/cn/sd/yz/commons/CIOTest01.java"));
		System.out.println(len);
		//目录大小
		len = FileUtils.sizeOf(new File("D:/JAVA Code/workspace/IO_study"));
		System.out.println(len);
	}
}
