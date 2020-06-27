package cn.sd.yz.iterator;

/**
 * 测试迭代器模式
 * @author Yin
 *
 */
public class Client {
	public static void main(String[] args) {
		ConcreteMyAggregate cma = new ConcreteMyAggregate();
		cma.addObject("aa");
		cma.addObject("bb");
		cma.addObject("cc");
		
		MyIterator iterator = cma.createIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.getCurrentObject());
			iterator.next();
		}
	}
}
