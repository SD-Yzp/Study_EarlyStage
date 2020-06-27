package cn.sd.yz.seven;

import java.util.Scanner;

/**
 * 分解质因数
 * @author Yin
 *
 */
public class Split {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.print(num+"=");
		split(num);
		
	}
	
	public static int split(int num){
		for(int i=2;i<=num;i++) 
		{
			if(num%i==0) 
			{
				System.out.print(i);
				num/=i;
				if(num == 1)
				{
					return 1;
				}
				else
				{
					System.out.print("x");
					return split(num);
				}
			}
		}
		return 1;
	}
}
