package cn.sd.yz.mycollection;

/**
 *自定义实现一个ArrayList，体会底层原理
 *增加set和get方法
 *增加索引越界判断
 * @author Y
 *
 */
public class MyArrayList04<E> {

	private Object[] elementData;
	private int size;// 默认为0
	
	private static final int DEFALT_CAPACITY=10;
	
	public MyArrayList04(){
		elementData = new Object[DEFALT_CAPACITY];
	}
	
	public MyArrayList04(int capacity) {
		if(capacity<0) {
			throw new RuntimeException("容器的容量不能为负数！");
		}else if(capacity==0){
			elementData = new Object[DEFALT_CAPACITY];
		}else {
			elementData = new Object[capacity];
		}
	}
	
	public void add(E obj) {
		//什么时候扩容？
		if(size==elementData.length) {
			//如何扩容？
			Object[] temp_obj = new Object[elementData.length+(elementData.length>>1)]; // 10-->10+10/2注意优先级
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
			throw new RuntimeException("索引不合法："+index);
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
		MyArrayList04<String> m1 = new MyArrayList04<>();
		
		for(int i=0;i<40;i++) {
			m1.add("i="+i);
		}
		
		m1.set("unknown",10);
		System.out.println(m1);
		System.out.println(m1.get(10));
	}
	
}
