package Test1;

/**
 * 回调机制
 * @author Yin
 *
 */
public class CallBack {
	public static void main(String[] args) {
		Liu liu = new Liu();
		Gao gao = new Gao(liu);
		gao.askQuestion(liu, "2222");
	}
}

interface Call{
	void answer(String result);
}

class Gao implements Call{
	private Liu liu;
	
	
	public Gao(Liu liu) {
		super();
		this.liu = liu;
	}

	public void askQuestion(Liu liu,String question) {
		liu.excute(Gao.this,question);
	}
	
	@Override
	public void answer(String result) {
		System.out.println(result);
	}	
}

class Liu{
	public void excute(Call call,String question) {
		System.out.println(question);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String result = "111";
		call.answer(result);
	}
}