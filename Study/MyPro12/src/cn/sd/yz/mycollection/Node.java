package cn.sd.yz.mycollection;

/**
 * 自定义节点
 * @author Y
 *
 */
public class Node {
	Node previous;
	Node next;
	Object element;
	
	

	public Node(Node previos, Node next, Object element) {
		super();
		this.previous = previos;
		this.next = next;
		this.element = element;
	}



	public Node(Object element) {
		super();
		this.element = element;
	}
	
	
}
