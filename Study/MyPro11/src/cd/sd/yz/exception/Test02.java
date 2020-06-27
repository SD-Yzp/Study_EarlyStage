package cd.sd.yz.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ≤‚ ‘Throws
 * @author Y
 *
 */
public class Test02 {
	public static void main(String[] args) throws IOException {
		FileReader reader = null;
			reader = new FileReader("c:\\1\\a.txt");
			
			char c1;
			
			c1 = (char)reader.read();
			System.out.println(c1);
				

				
	}
}
