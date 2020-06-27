package cn.sd.yz.universal02;

import java.util.Scanner;

public class StringExpansion 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int p1 = in.nextInt();
		int p2 = in.nextInt();
		int p3 = in.nextInt();
		String str = in.next();
		StringBuilder sb = new StringBuilder();
		
		boolean flag = false;
		
		
		//如果开头为-，直接加上
		if(str.startsWith("-"))
		{
			sb.append("-");
			str = str.substring(1);
		}
		
		//如果末尾为-
		if(str.endsWith("-"))
		{
			str = str.substring(0,str.length());
			flag = true;
		}
		
		if(str.indexOf("-")!=-1)
		{
			String[] s = str.split("-");
			
			for(int i=0;i<s.length-1;i++)
			{
				
				sb.append(s[i]);
				if(s[i].equals("")||s[i+1].equals(""))
				{
					sb.append("-");
					continue;
				}
				
				char data1 = s[i].charAt(s[i].length()-1);   //得到字符串的最后一个字母
				char data2 = s[i+1].charAt(0);   //得到下个字符串的最后一个字母
				
				
				
				if(data2<=data1||data2-data1>26)
				{
					sb.append("-");
				}
				else
				{					
					//当p1为1正序时
					if(p1==1&&p3==1)   
					{	
						while(data2>data1+1)
						{
							data1 = (char)(data1+1);
							for(int j=0;j<p2;j++)
							{							
								sb.append(data1);					
							}
						}	
					}
					
					//当p1为1，逆序时
					if(p1==1&&p3==2)   
					{	
						while(data2>data1+1)
						{
							data2 = (char)(data2-1);
							for(int j=0;j<p2;j++)
							{							
								sb.append(data2);					
							}
						}	
					}
					
					//当p1为2正序时
					if(p1==2&&p3==1)   
					{	
						while(data2>data1+1)
						{
							data1 = (char)(data1+1);
							for(int j=0;j<p2;j++)
							{							
								sb.append((char)(data1-32));					
							}
						}	
					}
					
					//当p1为2，逆序时
					if(p1==2&&p3==2)   
					{	
						while(data2>data1+1)
						{
							if(data2>='0'&&data2<='9')
							{								
								data2 = (char)(data2-1);
								for(int j=0;j<p2;j++)
								{							
									sb.append((char)(data2));					
								}
							}
							else
							{
								data2 = (char)(data2-1);
								for(int j=0;j<p2;j++)
								{							
									sb.append((char)(data2-32));					
								}
							}
						}	
					}
					
					
					//当p1为3时
					if(p1==3)   
					{	
						while(data2>data1+1)
						{		
							data2 = (char)(data2-1);
							for(int j=0;j<p2;j++)
							{							
								sb.append("*");					
							}
						}	
					}
					
					
					
					
				}
				
				
				
				
				
			}
			sb.append(s[s.length-1]);
			
			//如果末尾有-
			if(flag)
			{
				sb.append("-");
			}
			
			System.out.println(sb.toString());
		}
		else
		{
			System.out.println(str);
		}
		
		
	}
}
