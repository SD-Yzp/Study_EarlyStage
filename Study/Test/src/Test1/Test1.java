package Test1;


public class Test1 {
	public static void main(String[] args) {
		int i=99;
		System.out.println(i--);
		System.out.println(--i);
		
//		for(int j=2;j<3;j++) 
//		{
//			System.out.println("11111111");	
//		}
		
//		int[][] a = new int[2][100];
//		
//		for(int i=0;i<2;i++) 
//		{
//			a[0][i]=1;
//		}
//		for(int i=0;i<a[0].length;i++) 
//		{
//			System.out.println(a[0][i]);
//		}
		
//		int i = Integer.parseInt("22");
//		System.out.println(i);
		
//		int a = 4;
//		System.out.println(a);
//		System.out.println(a*a++);
		
//		int a = 3;
//		double b = a;   //�Զ�����ת��
//		System.out.println(b);
		
		
//		String str1 = "abc";
//		String str2 = new String("def");
//		String str3 = "abc";
//		String str4 = str2.intern();
//		String str5 = "def";
//		System.out.println(str1 == str3);// true
//		System.out.println(str2 == str4);// false
//		System.out.println(str4 == str5);// true
		
//		String str = "abcdefg";
//		char a = str.charAt(2);
//		System.out.println(a);
//		String str2 = str.substring(0, str.length()-1);
//		System.out.println(str2);
	
//		Integer k = new Integer(100);
//		Integer i = Integer.valueOf(128);
//		Integer j = Integer.valueOf(128);
//		System.out.println(i==j);
//		System.out.println(i==k);
//		System.out.println(i);
		
		
//		double num = Math.pow(1.01, 260);
//		num *= Math.pow(0.99, 365-260);
//		System.out.println(num);
		
//		SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd");
//		String time = s1.format(new Date());
//		System.out.println(time);
//		time = "1998-10-7";
//		Date date = null;
//		try {
//			date = s1.parse(time);
//		} catch (ParseException e) {
//			
//		}
//		System.out.println(date);
	
		
//		byte[] b = "abcdefg".getBytes();
//		System.out.println(b.length);

		String str = "abc";
		char[] a = {'a','b','c'};
		test(str,a);
		System.out.println(str);
		for(char temp:a) {
			System.out.print(temp+"\t");
		}

		System.out.println(getString());
	
		
	}
	
	static void test(String str, char[] a){
		str = "good";   //等价于str= new String("good");
		char[] b = {'d','e','f'};
		a[1] = 'e';
		a = b;
	}

	public static String getString() {
		String str = "A";
		String s = "D";
		try {
			str = "B";
			return str;
		} finally {
			System.out.println("finally change return string to C");
			str = "C";
			return s;
		}
	}
	
}
