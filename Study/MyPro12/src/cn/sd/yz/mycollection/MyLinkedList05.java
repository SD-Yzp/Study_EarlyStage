package cn.sd.yz.mycollection;

/**
 * 增加size、isEmpty方法
 * @author Y
 *
 */
public class MyLinkedList05 {
	private Node first;
	private Node last;
	
	private int size;

	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0?true:false;
	}
	
	public Object get(int index) {		
		Node temp =null;
		checkRange(index);
		
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
	
	public void add(int index,Object obj) {
		checkRange(index);
		
		Node node=new Node(obj);
		Node temp=null;
		
		if(index==0) {
			node.next=first;
			node.previous=null;			
			first.previous=node;
			first=node;
		}else if(index==size-1){
			node.previous=last;
			node.next=null;
			last.next=node;
			last=node;
		}else {
			temp=first;
			for(int i=0;i<index;i++) {
				temp=temp.next;				
			}
			node.previous=temp.previous;
			node.next=temp;
			temp.previous.next=node;
			temp.previous=node;
		}
		size++;
	}
	
	public void set(int index,Object obj) {
		checkRange(index);
		Node node = new Node(obj);
		Node temp = null;
		
		if(index==0) {
			node.next=first.next;
			node.previous=null;
			first.next.previous=node;
			first=node;
		}else if (index==size-1) {
			node.next=null;
			node.previous=last.previous;
			last.previous.next=node;
			last=node;
		}else {			
			temp=first;
			for(int i=0;i<index;i++) {
				temp=temp.next;
			}
			node.next=temp.next;
			node.previous=temp.previous;
			temp.next.previous=node;
			temp.previous.next=node;
			temp=null;
		}
		
	}
	
	public void remove(int index){
		//[a,b,c,d,e,f,g]
		checkRange(index);
		Node temp=null;		
		
		if(index==0) {
			temp=first.next;
			temp.next=first.next.next;
			first.next.next.previous=temp;
			temp.previous=null;
			first=temp;
		}else if(index==size-1) {
			temp=last.previous;
			temp.previous=last.previous.previous;
			last.previous.previous.next=temp;
			temp.next=null;
			last=temp;
		}else {
			if(index<(size>>1)) {// size>>1-->size/2
				temp=first;
				for(int i=0;i<index;i++) {
					temp=temp.next;
				}				
			} else {
				temp=last;
				for(int i=size-1;i>index;i--) {
					temp=temp.previous;
				}
			} 
			temp.previous.next=temp.next;
			temp.next.previous=temp.previous;			
		}
		size--;
	}
	
	public void remove(Object obj) {
		Node temp=first;
		
		for(int i=0;i<size;i++) {
			if(obj.equals(temp.element)) {
				remove(i);
				break;
			}else {
				temp=temp.next;
			}
			if(i==size-1) {
				System.out.println("要删除的元素未找到！");
			}
		}
	}
	
	public void checkRange(int index) {
		if(index<0||index>size-1) {
			throw new RuntimeException("索引不合法："+index);
		}
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
		MyLinkedList05 list1 = new MyLinkedList05();
		
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("e");
		list1.add("f");
		list1.add("g");
		
		
		System.out.println(list1);
		list1.add(1,"啊啊啊啊嗄");
		System.out.println(list1);
		list1.set(5,"嘤嘤嘤");
		System.out.println(list1);
		
		System.out.println(list1.size());
		System.out.println(list1.isEmpty());
	}
}
