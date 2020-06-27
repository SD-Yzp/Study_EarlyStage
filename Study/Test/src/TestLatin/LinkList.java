package TestLatin;

/**
 * 创建循环链表
 * @author Yin
 *
 */
public class LinkList {
	private Node first;
	private int size;
	
	public Node getFirst() {
		return first;
	}
	
	
	public void setFirst(Node first) {
		this.first = first;
	}
	
	public void add(Object element) {
		Node newNode = new Node(element);
		
		Node temp = first;
		if(first==null) {
			newNode.next=first;
			first=newNode;
		}else {
			newNode.next=first;
			for(int i=0;i<size-1;i++) {				
				temp=temp.next;
			}
			temp.next=newNode;
		}
		
		size++;
	}

	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		
		Node temp=first;
		for(int i=0;i<size;i++) {
			sb.append(temp.element+",");
			temp=temp.next;
		}
		sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
	}

}
