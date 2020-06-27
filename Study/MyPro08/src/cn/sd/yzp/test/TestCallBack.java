package cn.sd.yzp.test;

/**
 * 测试回调
 * @author Yin
 *
 */
public class TestCallBack {
	public static void main(String[] args) {
		Gao gao = new Gao();
		Liu liu = new Liu(gao);
		//小刘问问题
		liu.askQuestion("Where are you?");
	}
}

/**
 * 回调接口
*/
interface CallBack{
	/**
	 * 小高知道答案后告诉小刘时需要调用的方法，即回调方法
	 * @param result 是问题的答案
	 */
	public void answer (String result);
}


class Liu implements CallBack {
	private Gao gao;
	
	public Liu(Gao gao) {
		this.gao = gao;
	}
	
	public void askQuestion(String question) {
		//小刘问小高问题
		gao.execute(Liu.this,question);
	}
	
	public void answer(String result) {
		System.out.println("小高告诉小刘的答案是："+result);
	}
}


class Gao{
	public void execute(CallBack callBack,String question){
		System.out.println("小刘问的问题是："+question);
		//模拟小高挂点后先办自己的事情花了很长时间
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		//小高办完自己的事情后想到了答案
		String result = "Qingdao";
		//小高打电话把答案告诉小刘，相当于class B反过来调用class A的D方法
		callBack.answer(result);
	}
}
