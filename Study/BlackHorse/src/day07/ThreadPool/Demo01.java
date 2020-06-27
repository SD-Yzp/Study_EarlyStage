package day07.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 测试线程池
 * @author Yin
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(3);
		
		for(int i=0;i<5;i++)
		{
			es.submit(new MyImplements());
			System.out.println("-----------");
		}
	}
}
