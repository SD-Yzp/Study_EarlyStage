package cd.sd.yz.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ����Collections�������ʹ��
 * Collection�ǽӿڣ�Collections�ǹ�����
 * @author Y
 *
 */
public class TestCollections {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			list.add("y"+i);
		}
		
		System.out.println(list);
		
		Collections.shuffle(list);  //����˳������
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);   //���մӴ�С��������
		
		Collections.shuffle(list);  //����˳������
		Collections.reverse(list);  //ֱ�ӽ�������������
		System.out.println(list);
		
		System.out.println(Collections.binarySearch(list, "y2"));  //���ַ�����Ԫ�أ�Ҫ�������Ѿ��ǵ�������
		
	}
}
