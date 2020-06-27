package cn.sd.yz.arr;

/**
 * 测试数组拷贝
 * @author Yin
 *
 */
public class TestArrayCopy {
	public static void main(String[] args) {
		String[] s1 = {"aa","bb","cc","dd","ee"};
		String[] s2;
//		s2 = testDelete(s1, 2);
//		
//		for(int i=0;i<s2.length;i++) {
//			System.out.println(s2[i]);
//		}
//		
//		System.out.println("--------------");
//		
//		s2=extendRange(s1);
//		for(String temp:s2) {
//			System.out.print(temp+" ");
//		}
		
		System.out.println("--------------");

		s2=textInsert(s1,"insert",2);
		for(String temp:s2) {
			System.out.print(temp+" ");
		}
		System.out.println();
		String[] insert01= {"11","22","33"};
		s2=textInsert(s1, insert01, 2);
		for(String temp:s2) {
			System.out.print(temp+" ");
		}
	}
	
	public static void testBasicCopy() {
		String[] s1 = {"aa","bb","cc","dd","ee"};
		String[] s2 = new String[10];
		System.arraycopy(s1, 2, s2, 6, 3);
		
		for(int i=0;i<10;i++) {
			System.out.print(s2[i]+" ");
		}
	}
	
	
	
	//测试从数组中删除某个元素，本质上还是元素的复制
	public static void testBasicCopy2() {
		String[] s1 = {"aa","bb","cc","dd","ee"};
//		String[] s2 = new String[10];
		
		System.arraycopy(s1, 3, s1, 2, 2);
		
		s1[s1.length-1]=null;
		
		for(int i=0;i<s1.length;i++) {
			System.out.print(s1[i]+" ");
		}
	}
	
	
	//删除数组中指定索引位置的元素，并将原数组返回
	public static String[] testDelete(String[] s,int index) {
		System.arraycopy(s, index+1, s, index, s.length-index-1);
		s[s.length-1]=null;
		return s;
	}
	
	
	//数组的扩容（本质上是建立一个更大的数组，将原数组拷贝过去）
	public static String[] extendRange(String[] s) {
		String[] strExtend = new String[s.length+10];
		System.arraycopy(s, 0, strExtend, 0, s.length); // 拷贝
		return strExtend;
	}
	
	
	//使用拷贝让数组插入数据
	public static String[] textInsert(String[] s1,String s,int index) {
		String[] strExtend=new String[s1.length+1];
		
		strExtend[index]=s;
		
		System.arraycopy(s1, 0, strExtend, 0, index);
		System.arraycopy(s1, index, strExtend, index+1, s1.length-index);
		
		return strExtend;
	}
	
	
	public static String[] textInsert(String[] s1,String[] s,int index) {
		String[] strExtend=new String[s1.length+s.length];
		
		
		System.arraycopy(s1, 0, strExtend, 0, index);
		System.arraycopy(s, 0, strExtend, index, s.length);
		System.arraycopy(s1, index, strExtend, index+s.length, s1.length-index);
		
		return strExtend;
	}
}
