package cd.sd.yz.collection;

/**
 * ���Է���
 * @author Y
 *
 */
public class TestGeneric {
	public static void main(String[] args) {
		MyCollection<String> mc = new MyCollection<String>();
		
		mc.set("aa", 0);
		
		String b = mc.get(0);
	}
}

class MyCollection<E>{
	Object[] objs = new Object[5];
	
	public void set(E e,int index) {
		objs[index] = e;
	}
	
	public E get(int index) {
		return (E)objs[index];
	}
	
}
