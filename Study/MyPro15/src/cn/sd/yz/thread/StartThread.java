package cn.sd.yz.thread;

/**
 * �����̷߳�ʽһ��
 * 1���������̳�Thread+��дrun
 * 2�������������������+start
 * @author Yin
 *
 */
public class StartThread extends Thread{
	/**
	 * �߳���ڵ�
	 */
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("һ������");
		}
	}
	
	
	public static void main(String[] args) {
		//�����������
		StartThread st = new StartThread();
		//������ע��start������ʱ����
		st.start();   //����֤�������У�CPU����
		//ʹ��run�����Ļ���ֻ��һ��·������start�����Ƕ��߳�ͬʱ����
//		st.run();  
		for(int i=0;i<20;i++) {
			System.out.println("һ��coding");
		}
	}
}
