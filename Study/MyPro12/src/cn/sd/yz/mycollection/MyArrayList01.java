package cn.sd.yz.mycollection;

/**
 *自定义实现一个ArrayList，体会底层原理
 * @author Y
 *
 */
public class MyArrayList01 {

	private Object[] elementData;
	private int size;// 默认为0
	
	private static final int DEFALT_CAPACITY=10;
	
	public MyArrayList01(){
		elementData = new Object[DEFALT_CAPACITY];
	}
	
	public MyArrayList01(int capacity) {
		elementData = new Object[capacity];
	}
	
	public void add(Object obj) {
		elementData[size++]=obj;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i=0;i<size;i++) {
			sb.append(elementData[i]+",");			
		}
		sb.setCharAt(sb.length()-1, ']');

		return sb.toString();
	}
	
	public static void main(String[] args) {
		MyArrayList01 m1 = new MyArrayList01();
		m1.add("11");
		m1.add("22");
		
		System.out.println(m1);
	}
	
}
