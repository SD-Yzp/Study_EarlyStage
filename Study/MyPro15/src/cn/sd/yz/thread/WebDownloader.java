package cn.sd.yz.thread;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

/**
 * 下载图片
 * @author Yin
 *
 */
public class WebDownloader {
	/**
	 * 下载
	 * @param url
	 * @param name
	 */
	public void download(String url,String name) {
		try {
			FileUtils.copyURLToFile(new URL(url), new File(name));
		} catch (MalformedURLException e) {			
			e.printStackTrace();
			System.out.println("不合法的域名");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("下载失败");
		}
	}
}
