package cd.sd.yz.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 测试表格数据的存储
 * ORM思想的简单实验：map表示一行数据，多行数据是多个map；将多个map放到list中
 * @author Y
 *
 */
public class TestStoreData02 {
	public static void main(String[] args) {
		Map<String,Object> map1 = new HashMap<>();
		
		map1.put("id", 1001);
		map1.put("姓名", "K");
		map1.put("薪水", 20000);
		map1.put("入职日期", "2018-5-20");
		
		Map<String,Object> map2 = new HashMap<>();
		
		map2.put("id", 1002);
		map2.put("姓名", "J");
		map2.put("薪水", 23000);
		map2.put("入职日期", "2018-4-5");
		
		Map<String,Object> map3 = new HashMap<>();
		
		map3.put("id", 1003);
		map3.put("姓名", "G");
		map3.put("薪水", 25000);
		map3.put("入职日期", "2018-3-14");
		
		List<Map<String,Object>> table1 = new ArrayList<>();
		
		table1.add(map1);
		table1.add(map2);
		table1.add(map3);
		
		
		for(Map<String,Object> m:table1) {
			Set<String> s = m.keySet();
			
			for(Iterator<String> iter = s.iterator();iter.hasNext();) {
				String key = iter.next();
				System.out.print(key+":"+m.get(key)+"\t");
			}
			System.out.println();
		}
		
	}
}
