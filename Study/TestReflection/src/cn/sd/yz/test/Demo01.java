package cn.sd.yz.test;

/**
 * 测试各种类型(class,interface,enum,annotation,primitive type,void)对应的java.lang.Class对象的获取方式
 * @author Yin
 *
 */
@SuppressWarnings("all")
public class Demo01 {
	public static void main(String[] args) {
		String path = "cn.sd.yz.test.bean.User";
		
		try {
			Class clazz = Class.forName(path);
			//对象是表示或封装一些数据。一个类被加载后，JVM会创建一个对应类的Class对象，类的整个结构信息会被放到对应的Class对象中。
			//这个Class对象就像一面镜子一样，通过这面镜子可以看到对应类的全部信息。
			System.out.println(clazz.hashCode());
			
			Class clazz2 = Class.forName(path);  //一个类只有一个Class对象
			System.out.println(clazz2.hashCode());
			
			Class strClazz1 = String.class;
			Class strClazz2 = path.getClass();
			System.out.println(strClazz1==strClazz2);

			int[] arr01 = new int[10];
			int[] arr02 = new int[30];
			int[][] arr03 = new int[30][];
			double[] arr04 = new double[10];
			System.out.println(arr01.getClass().hashCode());
			System.out.println(arr02.getClass().hashCode());
			System.out.println(arr03.getClass().hashCode());
			System.out.println(arr04.getClass().hashCode());
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
