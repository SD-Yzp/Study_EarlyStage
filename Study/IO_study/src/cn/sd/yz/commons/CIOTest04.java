package cn.sd.yz.commons;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * 写出内容
 * @author Yin
 *
 */
public class CIOTest04 {
	public static void main(String[] args) throws IOException {
		//write和writeStringToFile的作用是一样的
		FileUtils.write(new File("happy.txt"), "学习是一件伟大的事业\r\n","GBK");
		FileUtils.writeStringToFile(new File("happy.txt"), "学习是一件辛苦的事业\r\n","GBK",true); //true指在文件内容后继续追加内容
		FileUtils.writeByteArrayToFile(new File("happy.txt"), "学习是一件幸福的事业\r\n".getBytes("GBK"),true);
	
		//写出列表
		List<String> data = new ArrayList();
		data.add("马云");
		data.add("马化腾");
		data.add("弼马温");
		FileUtils.writeLines(new File("happy.txt"), data, "----",true);   //第三个参数为连接符
	}
}
