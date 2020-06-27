package cn.sd.yz.thread;

/**
 * 测试多线程
 * @author Yin
 *
 */
public class Demo01 
{
	public static void main(String[] args) 
	{
		Web12306 web = new Web12306();
		
		new Thread(web,"苏三").start();
		new Thread(web,"王五").start();
		new Thread(web,"赵六").start();
	}
}
