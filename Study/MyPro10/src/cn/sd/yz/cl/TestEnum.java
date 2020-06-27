package cn.sd.yz.cl;

import java.util.Random;

/**
 * ����ö��
 * @author Y
 *
 */
public class TestEnum {
	public static void main(String[] args) {
		//ö�ٱ���
		for(Week k:Week.values()) {
			System.out.println(k);
		}
		//switch���ʹ��ö��
		Season se = Season.AUTUMN;
		int a = new Random().nextInt(4); //生成0-4的之间（不包括4）随机整数
		switch(Season.values()[a]) {
		case SPRING:
			System.out.println("春天");
			break;
		case SUMMER:
			System.out.println("夏天");
			break;
		case AUTUMN:
			System.out.println("秋天");
			break;
		case WINTER:
			System.out.println("冬天");
			break;
		}
		
		
	}
	
	
	enum Season{
		SPRING,SUMMER,AUTUMN,WINTER
	}
	
	enum Week{
		星期一,星期二,星期三,星期四,星期五,星期六,星期日
	}
}
