package cn.sd.yz.mycollection;

/**
 *�Զ���ʵ��һ��ArrayList�����ײ�ԭ��
 *���ݲ���
 * @author Y
 *
 */
public class MyArrayList03<E> {

	private Object[] elementData;
	private int size;// Ĭ��Ϊ0
	
	private static final int DEFALT_CAPACITY=10;
	
	public MyArrayList03(){
		elementData = new Object[DEFALT_CAPACITY];
	}
	
	public MyArrayList03(int capacity) {
		elementData = new Object[capacity];
	}
	
	public void add(E obj) {
		//ʲôʱ�����ݣ�
		if(size==elementData.length) {
			//������ݣ�
			Object[] temp_obj = new Object[elementData.length+(elementData.length>>1)]; // 10-->10+10/2ע�����ȼ�
			System.arraycopy(elementData, 0, temp_obj, 0, elementData.length);
			elementData=temp_obj;
		}
		
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
		MyArrayList03<String> m1 = new MyArrayList03<>();
		m1.add("11");
		m1.add("22");
		
		for(int i=0;i<40;i++) {
			m1.add("i="+i);
		}
		
		System.out.println(m1);
	}
	
}
