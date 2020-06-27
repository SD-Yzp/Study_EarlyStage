package TestLatin;

public class Latin {
	public static void main(String[] args) {
		int size = 9;
		Node node =createLink(size);
		printLatin(node,size);
	}
	
	public static void printLatin(Node node,int size) {
		Node head = node;
		for(int i=1;i<=size;i++) {
			Node temp = head;
			for(int j=1;j<=size;j++) {
				System.out.print(temp.element+"\t");
				temp=temp.next;
			}
			System.out.println();
			head=head.next;
		}
	}
	
	public static Node createLink(int size) {
		LinkList list = new LinkList();
		for(int i=1;i<=size;i++) {
			list.add(i);
		}
		return list.getFirst();
	}
}
