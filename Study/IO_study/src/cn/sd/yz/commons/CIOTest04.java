package cn.sd.yz.commons;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * д������
 * @author Yin
 *
 */
public class CIOTest04 {
	public static void main(String[] args) throws IOException {
		//write��writeStringToFile��������һ����
		FileUtils.write(new File("happy.txt"), "ѧϰ��һ��ΰ�����ҵ\r\n","GBK");
		FileUtils.writeStringToFile(new File("happy.txt"), "ѧϰ��һ���������ҵ\r\n","GBK",true); //trueָ���ļ����ݺ����׷������
		FileUtils.writeByteArrayToFile(new File("happy.txt"), "ѧϰ��һ���Ҹ�����ҵ\r\n".getBytes("GBK"),true);
	
		//д���б�
		List<String> data = new ArrayList();
		data.add("����");
		data.add("����");
		data.add("������");
		FileUtils.writeLines(new File("happy.txt"), data, "----",true);   //����������Ϊ���ӷ�
	}
}
