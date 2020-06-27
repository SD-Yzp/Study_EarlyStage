package cn.sd.yz.strategy;

/**
 * 实现起来很容易，符合一般开发人员的思路
 * 假如类型特别多，算法很复杂时，整个条件语句的代码就变得很长，难于维护。
 * 如果有新增类型，就需要频繁的修改此处的代码！
 * 不符合开闭原则！
 * @author Yin
 *
 */
public class TestStrategy {
	public double getPrice(String type, double standardPrince) {
		if(type.equals("NewCustomerFew")) {
			return standardPrince;
		}else if(type.equals("NewCustomerMany")) {
			return standardPrince*0.9;
		}else if(type.equals("OldCustomerFew")) {
			return standardPrince*0.85;
		}else if(type.equals("OldCustomerMany")) {
			return standardPrince*0.8;
		}
		
		System.out.println("输入类型错误，原价！");
		return standardPrince;
	}
}
