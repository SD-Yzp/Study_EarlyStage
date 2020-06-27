package cd.sd.yz.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 测试try-catch-finally
 * @author Y
 *
 */
public class Test01 {
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("c:\\1\\b.txt");
			System.out.println("step1");
			
			char c1;
			
			c1 = (char)reader.read();
			System.out.println(c1);
				
		} catch (FileNotFoundException e) {  //FileNotFoundException为IOException的子类，子类异常在父类异常前面
			System.out.println("step2");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("step3");
			try {
				if(reader!=null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
