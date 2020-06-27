package cn.sd.yz.commons;

import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.IOUtils;

/**
 * 拷贝
 * @author Yin
 *
 */
public class CIOTest05 {
	public static void main(String[] args) throws IOException {
		//复制文件
//		FileUtils.copyFile(new File("desk.jpg"), new File("desk_copy.jpg"));
		//复制文件到目录
//		FileUtils.copyFileToDirectory(new File("desk.jpg"),new File("lib"));
		//复制目录到目录
//		FileUtils.copyDirectoryToDirectory(new File("lib"),new File("lib2"));
		//复制目录
//		FileUtils.copyDirectory(new File("lib"),new File("lib2"));
		//拷贝URL内容
//		String url = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1562952689285&di=3eb5308b37757d8fddc2c798148d3239&imgtype=0&src=http%3A%2F%2F06imgmini.eastday.com%2Fmobile%2F20180914%2F3cac32bed110f995d96773f6269b41c2_wmk.jpeg";
//		FileUtils.copyURLToFile(new URL(url),new File("marvel.jpg"));
		String datas = IOUtils.toString(new URL("http://www.163.com"), "gbk");
		System.out.println(datas);
	}
}
