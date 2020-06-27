package cn.sd.yzp.test;

/**
 * ���Իص�
 * @author Yin
 *
 */
public class TestCallBack {
	public static void main(String[] args) {
		Gao gao = new Gao();
		Liu liu = new Liu(gao);
		//С��������
		liu.askQuestion("Where are you?");
	}
}

/**
 * �ص��ӿ�
*/
interface CallBack{
	/**
	 * С��֪���𰸺����С��ʱ��Ҫ���õķ��������ص�����
	 * @param result ������Ĵ�
	 */
	public void answer (String result);
}


class Liu implements CallBack {
	private Gao gao;
	
	public Liu(Gao gao) {
		this.gao = gao;
	}
	
	public void askQuestion(String question) {
		//С����С������
		gao.execute(Liu.this,question);
	}
	
	public void answer(String result) {
		System.out.println("С�߸���С���Ĵ��ǣ�"+result);
	}
}


class Gao{
	public void execute(CallBack callBack,String question){
		System.out.println("С���ʵ������ǣ�"+question);
		//ģ��С�߹ҵ���Ȱ��Լ������黨�˺ܳ�ʱ��
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		//С�߰����Լ���������뵽�˴�
		String result = "Qingdao";
		//С�ߴ�绰�Ѵ𰸸���С�����൱��class B����������class A��D����
		callBack.answer(result);
	}
}
