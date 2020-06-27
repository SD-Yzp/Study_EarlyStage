package cn.sd.yz.thread;

public class IDownloader implements Runnable {
	private String url;
	private String name;
	
	public IDownloader(String url, String name) {
		super();
		this.url = url;
		this.name = name;
	}

	@Override
	public void run() {
		WebDownloader wd = new WebDownloader();
		wd.download(url, name);
	}
	
	public static void main(String[] args) {
		IDownloader id1 = new  IDownloader("http://pic25.nipic.com/20121205/10197997_003647426000_2.jpg","1.jpg");
		IDownloader id2 = new  IDownloader("http://pic31.nipic.com/20130801/11604791_100539834000_2.jpg","2.jpg");
		IDownloader id3 = new  IDownloader("http://pic23.nipic.com/20120830/9686992_180336646144_2.jpg","3.jpg");
			
		new Thread(id1).start(); 
		new Thread(id2).start(); 
		new Thread(id3).start(); 
	}
}
