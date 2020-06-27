package cn.sd.yz.thread;

/**
 * 测试多线程下载图片
 * @author Yin
 *
 */
public class TDownloader extends Thread{
	private String url;
	private String name;
	
	public TDownloader(String url,String name) {
		this.url = url;
		this.name = name;		
	}
	
	@Override
	public void run() {
		WebDownloader wd = new WebDownloader();
		wd.download(url, name);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		TDownloader td1 = new  TDownloader("http://pic25.nipic.com/20121205/10197997_003647426000_2.jpg","1.jpg");
		TDownloader td2 = new  TDownloader("http://pic31.nipic.com/20130801/11604791_100539834000_2.jpg","2.jpg");
		TDownloader td3 = new  TDownloader("http://pic23.nipic.com/20120830/9686992_180336646144_2.jpg","3.jpg");
		
		//启动三个线程
		td1.start();
		td2.start();
		td3.start();
	}
}
