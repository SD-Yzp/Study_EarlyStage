package Test1;

public class Test2 {
	String str = "abc";
	char[] a = {'a','b','c'};
	
	public static void main(String[] args) {		
		Test2 t = new Test2();
		test(t.str,t.a);
		System.out.println(t.str);
		for(char temp:t.a) {
			System.out.print(temp+"\t");
		}
	}
	
	


static void test(String str, char[] a){
	str = "good";
	char[] b = {'d','e','f'};
	a[1] = 'e';
	a = b;
}
}
