package TestMagicCord;

public class MagicCord {
	public static void main(String[] args) {
		LinkList list = new LinkList();
		//将链表赋值为0
		for(int i=1;i<=13;i++) {
			list.add(0);
		}
		
		//换成魔术师发牌的顺序
		Node temp = list.getFirst();
		for(int i=1;i<=13;i++) {
			for(int j=1;j<i;j++) {
				temp=temp.next;
				if(!temp.element.equals(0)) {  //如果值不为0说明牌已经拿出去了
					j--;
				}
			}
			temp.element=i;
			int flag = 0;   //设置一个记录数据，停止循环
			while(!temp.element.equals(0)) {
				temp=temp.next;
				flag++;
				if(flag==13){
					break;
				}
			}
		}
		
		System.out.println(list);
	}
}
