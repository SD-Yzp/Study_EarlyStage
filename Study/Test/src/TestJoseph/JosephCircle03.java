package TestJoseph;

/**
 * 约瑟夫环第三版，打印出每次删除的节点的element
 * 循环链表增加get方法
 * @author Yin
 *
 */
public class JosephCircle03 {
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
		
	
	public String get(int index) {
		Node temp=first;
		for(int i=0;i<index;i++) {
			temp=temp.next;
		}
		return (String) temp.element;
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


	public void remove(int index) {
		if(index<0||index>=size) {
			throw new RuntimeException("下标越界！");
		}
		
		Node temp1 = first;
		Node temp2 = last;
		if(index==0) {    //必须判断是否为第一个节点和最后一个节点，不然删除会出问题，因为并没有改变list中的first和last的节点
			last.next=first.next;
			first=first.next;
		}else if(index==size-1){
			for(int i=0;i<index;i++) {
				temp1=temp1.next;   //要删除的节点
				temp2=temp2.next;   //要删除节点的上一个节点
			}	
			temp2.next=temp1.next;
			last=temp2;
		}else{			
			for(int i=0;i<index;i++) {
				temp1=temp1.next;   //要删除的节点
				temp2=temp2.next;   //要删除节点的上一个节点
			}	
			temp2.next=temp1.next;
		}
		
		size--;
	}
	
	
	public int getSize() {
		return size;
	}


	public static void main(String[] args) {
		JosephCircle03 list = new JosephCircle03();
		
		//增加四十一个人，用数字表示
		for(int i=1;i<=41;i++) {
			list.add(""+i);  //将数字转换为字符串
		} 
			
		int sum=-1;  //初始为-1，因为下标开始为0
		while(list.getSize()>2) {
			for(int i=0;i<3;i++) {
				sum++;
			}
			//保证每次移除的数据在链表中
			if(sum>list.getSize()-1) {
				sum-=list.getSize();
			}
			
			System.out.println("本次要移除的数据为："+list.get(sum));
			list.remove(sum);
			sum--;  //每次移除数据后-1，因为链表中删除数据后所有后边的节点下标-1
		}
		System.out.println("最终剩余的数据为："+list);
	}	
}
