package cn.sd.yz.mycollection;

/**
 * add方法和toString方法
 * @author Y
 *
 */
public class MyLinkedList01 {
	private Node first;
	private Node last;
	
	private int size;
	
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
		MyLinkedList01 list1 = new MyLinkedList01();
		
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		System.out.println(list1);
	}
}
