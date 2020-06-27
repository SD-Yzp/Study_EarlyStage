package cd.sd.yz.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ����try-catch-finally
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
				
		} catch (FileNotFoundException e) {  //FileNotFoundExceptionΪIOException�����࣬�����쳣�ڸ����쳣ǰ��
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
