package cn.sd.yz.mycollection;

import java.util.Arrays;

/**
 * 实现get方法。通过key-value对获得
 * @author Y
 *
 */
public class MyHashMap03 {
	Node2[] table;  //位桶数组。 bucket array
	int size; //存放的键值对的个数
	
	public MyHashMap03() {
		super();
		table = new Node2[16];   //长度一般定义为2的整数幂
	}
	
	public Object get(Object key) {
		Node2 temp = null;
		Object value =null;
		int hash = myHash(key.hashCode(),table.length);

		if(table[hash]!=null) {
			temp=table[hash];
			
			while(temp!=null) {
				if(temp.key.equals(key)) {
					value=temp.value;
					break;
				}else {
					temp=temp.next;
				}
			}
		}
		
//		for(int i=0;i<table.length;i++) {
//			temp=table[i];
//			while(temp!=null) {
//				if(temp.key.equals(key)) {
//					value=temp.value;
//					break;
//				}
//				temp=temp.next;
//			}
//		}
		return value;
	}
	
	public void put(Object key,Object value) {
		//定义了新的节点对象
		Node2 newNode = new Node2();
		Node2 iterNode = new Node2();
		boolean keyRepeat=false;
		
		newNode.hash=myHash(key.hashCode(),table.length);
		newNode.key=key;
		newNode.value=value;
		newNode.next=null;
		
		Node2 temp = table[newNode.hash];
		
		if(temp==null) {
			//此处数组元素为空，则直接把新节点放进去
			table[newNode.hash]=newNode;
			size++;
		}else {
			//此处数组元素不为空，则遍历对应列表
			while(temp!=null) {
				if(temp.key.equals(key)) {
					keyRepeat=true;
					temp.value=value;
					break;
				}else {
					iterNode=temp;
					temp=temp.next;
				}
			}
			if(!keyRepeat) {				
				iterNode.next=newNode;
				size++;
			}
		}
		
	}
	
		
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("{");
		
		for(int i=0;i<table.length;i++) {
			Node2 temp = table[i];
			
			while(temp!=null) {
				sb.append(temp.key+":"+temp.value+" ");
				temp=temp.next;
			}
		}
		sb.setCharAt(sb.length()-1,'}');
		return sb.toString();
	}

	public static void main(String[] args) {
		MyHashMap03 m1=new MyHashMap03();
//		m1.put(10, "aa");
//		m1.put(20, "bb");
//		m1.put(30, "cc");
//		m1.put(20, "ss");
		
		
		m1.put(53, "hh");
		m1.put(69, "gg");
		m1.put(85, "aa");
		
		System.out.println(m1);
		System.out.println(m1.get(53));
	}
	
	
	
	
	public int myHash(int v,int length) {
//		System.out.println("length:"+length);
//		System.out.println("key.hashcode:"+v);
//		System.out.println("hash in myHash:"+(v&(length-1)));  //直接位运算，效率高
//		System.out.println("hash in myHash:"+(v%length));  //取模运算，效率低
		return v&(length-1);
	}
	
}
