package cn.sd.yz.Boss02;

import java.util.Scanner;

public class NCL {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		String s = in.nextLine();
		
		String letter = "";
		boolean flag = true;

		//拆分字符串
		String[] str = s.split("=");
		for(int i=0;i<2;i++)
		{
			if(str[i].contains("-"))
			{
				str[i] = str[i].replaceAll("-", "\\+-");
			}
		
		}
		
		
		String[] block1 = str[0].split("\\+");
		String[] block2 = str[1].split("\\+");
		int sum1 = 0;  //记录左边整数的加和
		int sum2 = 0;  //记录右边整数的加和
		
		int sum3 = 0;  //记录左边带字母系数的加和
		int sum4 = 0;  //记录右边带字母系数的加和
		
		double num1,num2;  //num1为整数  num2为系数
		
		
		String regex = ".*[a-z].*";
		
		for(int i=0;i<block1.length;i++)
		{
			if(!block1[i].equals(""))
			{					
				if(!block1[i].matches(regex))
				{
					sum1 += Integer.parseInt(block1[i]);
				}
				else
				{
					if(block1[i].substring(0, block1[i].length()-1).equals("-"))
					{
						sum3 += -1;
					}
					else if(block1[i].substring(0, block1[i].length()-1).equals(""))
					{
						sum3 += 1;
					}
					else
					{						
						sum3 += Integer.parseInt(block1[i].substring(0, block1[i].length()-1));
					}
					if(flag)
					{
						letter = block1[i].substring(block1[i].length()-1);
						flag = !flag;
					}
				}
			}
		}
		
		for(int i=0;i<block2.length;i++)
		{
			if(!block2[i].equals(""))
			{
				if(!block2[i].matches(regex))
				{
					sum2 += Integer.parseInt(block2[i]);					
				}
				else
				{
					if(block2[i].substring(0, block2[i].length()-1).equals("-"))
					{
						sum4 += -1;
					}
					else if(block2[i].substring(0, block2[i].length()-1).equals(""))
					{
						sum4 += 1;
					}
					else
					{						
						sum4 += Integer.parseInt(block2[i].substring(0, block2[i].length()-1));
					}
					
					if(flag)
					{
						letter = block2[i].substring(block2[i].length()-1);
						flag = !flag;
					}
				}
			}
		}
		

		
		
		num1 = sum2-sum1;
		num2 = sum3-sum4;
		if(num1 == 0)   //防止出现负0的效果
		{
			num2 = Math.abs(num2);
		}
		System.out.println(letter +"="+String.format("%.3f", num1/num2));
	}
}
