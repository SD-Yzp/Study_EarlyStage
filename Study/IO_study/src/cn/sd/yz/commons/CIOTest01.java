package cn.sd.yz.commons;

import java.io.File;

import org.apache.commons.io.FileUtils;

/**
 * ��С
 * @author Yin
 *
 */
public class CIOTest01 {
	public static void main(String[] args) {
		//�ļ���С
		long len = FileUtils.sizeOf(new File("src/cn/sd/yz/commons/CIOTest01.java"));
		System.out.println(len);
		//Ŀ¼��С
		len = FileUtils.sizeOf(new File("D:/JAVA Code/workspace/IO_study"));
		System.out.println(len);
	}
}
