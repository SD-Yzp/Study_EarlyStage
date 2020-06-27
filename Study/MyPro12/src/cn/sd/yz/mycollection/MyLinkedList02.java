package cn.sd.yz.mycollection;

/**
 * 增加get方法
 * @author Y
 *
 */
public class MyLinkedList02 {
	private Node first;
	private Node last;
	
	private int size;
	
	public Object get(int index) {
		
		System.out.println(size);
		Node temp =null;
		
		if(index<0||index>size-1) {
			throw new RuntimeException("索引不合法："+index);
		}
		
		if(index<(size>>1)) {    //size>>1-->size/2
			temp=first;
			for(int i=0;i<index;i++) {
				temp=temp.next;
			}
		}else {
			temp=last;
			for(int i=size-1;i>index;i--) {
				temp=temp.previous;
			}
		}
		
		return temp.element;
		
	}
	
	public void add(Object obj) {
		Node node = new Node(obj);
		
		if(first==null) {
			node.previous=null;
			node.next=null;
			first=node;
			last=node;
		}else {
			node.previous=last;
			node.next=null;
			
			last.next=node;
			last=node;
		}
		size++;
	}
	
	
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		Node temp = first;
		
		while(temp!=null) {
			sb.append(temp.element+",");
			temp=temp.next;
		}
		
		sb.setCharAt(sb.length()-1, ']');  //注意第二个形参是char
		return sb.toString();
	}




	public static void main(String[] args) {
		MyLinkedList02 list1 = new MyLinkedList02();
		
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("e");
		list1.add("f");
		list1.add("g");
		
		
		System.out.println(list1.get(6));
	}
}
