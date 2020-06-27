package day13;

import java.util.stream.Stream;

/**
 * 测试limit方法
 * @author Yin
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		String[] arr = {"美羊羊","慢羊羊","沸羊羊","喜羊羊","懒羊羊"};
		
		Stream<String> stream = Stream.of(arr);
		
//		Stream<String> stream2 = stream.limit(2);
		
		stream.limit(2).forEach(name->System.out.println(name));   //stream流只能用一次
		
//		stream2.forEach(name->System.out.println(name));
	}
}
