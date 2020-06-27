package cn.sd.yz.test;

public interface Demo04 {
	public static void main(String[] args) throws Exception {
		//测试取反操作
		int a = 3; //0000 0011
		System.out.println(Integer.toBinaryString(a^0xff));
		
		//可以使用取反操作加密class文件，正常的类加载器无法加载
//		FileSystemClassLoader loader = new FileSystemClassLoader("f:/myjava/temp");
//		Class<?> c = loader.loadClass("HelloWorld");
//		System.out.println(c);
	
		DecrptClassLoader loader = new DecrptClassLoader("f:/myjava/temp");
		Class<?> c = loader.loadClass("HelloWorld");
		System.out.println(c);
	}
}
