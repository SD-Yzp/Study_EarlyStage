package cn.sd.yz.mycollection;

import javax.swing.text.StyledEditorKit.BoldAction;

/**
 *�Զ���ʵ��һ��ArrayList�����ײ�ԭ��
 *����remove����
 *����
 * @author Y
 *
 */
public class MyArrayList05<E> {

	private Object[] elementData;
	private int size;// Ĭ��Ϊ0
	
	private static final int DEFALT_CAPACITY=10;
	
	public MyArrayList05(){
		elementData = new Object[DEFALT_CAPACITY];
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0?true:false;
	}
	
	
	public MyArrayList05(int capacity) {
		if(capacity<0) {
			throw new RuntimeException("��������������Ϊ������");
		}else if(capacity==0){
			elementData = new Object[DEFALT_CAPACITY];
		}else {
			elementData = new Object[capacity];
		}
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
	
	public E get(int index) {
		checkRange(index);
		
		return (E)elementData[index];
	}
	
	public void set(E element,int index) {
		checkRange(index);
		
		elementData[index]=element;
	}
	
	public void checkRange(int index) {
		if(index<0||index>size-1) {
			throw new RuntimeException("�������Ϸ���"+index);
		}
	}
	
	public void remove(int index) {
		//a,b,c,d,e,f,g
		//a,b,c,e,f,g
		int numMoved = elementData.length-index-1;
		if(numMoved>0) {			
			System.arraycopy(elementData, index+1, elementData, index, numMoved);
		}
		elementData[--size]=null;
	}
	
	public void remove(E element) {
		for(int i=0;i<size;i++) {
			if(element.equals(elementData[i])) {
				remove(i);
				break;
			}
		}
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
		MyArrayList05<String> m1 = new MyArrayList05<>();
		
		for(int i=0;i<40;i++) {
			m1.add("i="+i);
		}
		
		m1.set("unknown",10);
		m1.remove(3);
		m1.remove("i=4");
		System.out.println(m1);
		System.out.println(m1.get(10));
		System.out.println(m1.isEmpty());
		System.out.println(m1.size);
	}
	
}
