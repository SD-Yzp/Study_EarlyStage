package TestMagicCord;

public class MagicCord {
	public static void main(String[] args) {
		LinkList list = new LinkList();
		//������ֵΪ0
		for(int i=1;i<=13;i++) {
			list.add(0);
		}
		
		//����ħ��ʦ���Ƶ�˳��
		Node temp = list.getFirst();
		for(int i=1;i<=13;i++) {
			for(int j=1;j<i;j++) {
				temp=temp.next;
				if(!temp.element.equals(0)) {  //���ֵ��Ϊ0˵�����Ѿ��ó�ȥ��
					j--;
				}
			}
			temp.element=i;
			int flag = 0;   //����һ����¼���ݣ�ֹͣѭ��
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
