package cn.sd.yz.mycollection;

/**
 * 增加remove方法
 * @author Y
 *
 */
public class MyLinkedList03 {
	private Node first;
	private Node last;
	
	private int size;
	
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
		MyLinkedList03 list1 = new MyLinkedList03();
		
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("e");
		list1.add("f");
		list1.add("g");
		
		
		System.out.println(list1);
		list1.remove("ad");
		System.out.println(list1);
	}
}
