package cn.sd.yz.singleton;

public class Demo01 
{	
	public static void main(String[] args) 
	{		
		SingleTon04 singleTon1 = SingleTon04.getInstance();
		SingleTon04 singleTon2 = SingleTon04.getInstance();

		System.out.println(singleTon1);
		System.out.println(singleTon2);
	}
}
