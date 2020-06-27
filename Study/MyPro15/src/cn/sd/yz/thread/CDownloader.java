package cn.sd.yz.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 
 * @author Yin
 *
 */

public class CDownloader implements Callable {
	private String url;
	private String dest;	
	
	public CDownloader(String url, String dest) {
		super();
		this.url = url;
		this.dest = dest;
	}

	@Override
	public Boolean call() throws Exception {
		WebDownloader wd = new WebDownloader();
		wd.download(url, dest);
		return true;
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CDownloader cd1 = new  CDownloader("http://pic25.nipic.com/20121205/10197997_003647426000_2.jpg","1.jpg");
		CDownloader cd2 = new  CDownloader("http://pic31.nipic.com/20130801/11604791_100539834000_2.jpg","2.jpg");
		CDownloader cd3 = new  CDownloader("http://pic23.nipic.com/20120830/9686992_180336646144_2.jpg","3.jpg");
		
		//创建执行服务
		ExecutorService ser = Executors.newFixedThreadPool(3);
		//提交服务
		Future<Boolean> result1 = ser.submit(cd1);
		Future<Boolean> result2 = ser.submit(cd2);
		Future<Boolean> result3 = ser.submit(cd3);
		//获取结果
		boolean r1 = result1.get();		
		boolean r2 = result2.get();
		boolean r3 = result3.get();
		//关闭服务
		ser.shutdown();

	}
	
}
