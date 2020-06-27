package TestJoseph;

/**
 * 创建单链表（add方法，尾插法）
 * 由于JAVA取消了指针，所以不需要头指针
 * @author Yin
 *
 */
public class LinkList01 {
	private Node first;
	private Node last;
	private int size;
	
	
	
	public void add(Object obj) {
		Node node = new Node(obj);
		
		
		if(first==null) {
			node.next=first;
			first=node;
			last=node;
		}else {
			node.next=first;
			last.next=node;
			last=node;
			
		}
		size++;
	}
		
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		
		Node temp = first;		
		for(int i=0;i<size;i++) {
			sb.append(temp.element+",");
			temp=temp.next;
		}
		
		sb.setCharAt(sb.length()-1, ']');
		
		return sb.toString();
	}





	public static void main(String[] args) {
		LinkList01 list = new LinkList01();
		
		list.add("aa");
		list.add("bb");
		list.add("cc");
		
		System.out.println(list);
	}
	
}
