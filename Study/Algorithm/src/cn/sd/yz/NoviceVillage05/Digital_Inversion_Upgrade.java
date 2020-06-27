package cn.sd.yz.NoviceVillage05;

import java.util.Scanner;

public class Digital_Inversion_Upgrade 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		String[] strs = new String[10];
		char[] datas;
		int count = 0;
		StringBuilder sb = new StringBuilder();
		
		
		if(str.contains("%"))
		{
			String s = str.substring(0, str.length()-1);
			datas = s.toCharArray();
			if(s.length()==1&&s.equals("0")) 
			{
				sb.append("0");
			}
			else
			{				
				//统计末尾0的数量
				for(int i=s.length()-1;i>=0;i--)
				{
					if(datas[i]=='0') 
					{
						count++;
					}
					else
					{
						break;
					}
				}
				
				for(int i=s.length()-1-count;i>=0;i--)
				{
					sb.append(datas[i]);
				}
			}			
			
			sb.append("%");
		}
		else if(str.contains("/"))
		{
			strs = str.split("/");
			for(int j=0;j<strs.length;j++)
			{
				datas = strs[j].toCharArray();
				if(strs[j].length()==1&&strs[j].equals("0"))
				{
					sb.append("0");
				}
				else
				{					
					//统计末尾0的数量
					for(int i=strs[j].length()-1;i>=0;i--)
					{
						if(datas[i]=='0') 
						{
							count++;
						}
						else
						{
							break;
						}
					}
					
					for(int i=strs[j].length()-1-count;i>=0;i--)
					{
						sb.append(datas[i]);
					}
				}
				
				sb.append("/");
				count=0;
			}
			sb.deleteCharAt(sb.length()-1);
		}
		else if(str.contains("."))
		{
			strs = str.split("\\.");    //java中小数点是一个特殊符号，所以编译会出错，所以用\\把小数点转义成单纯的小数点

			datas = strs[0].toCharArray();
			if(strs[0].length()==1&&strs[0].equals("0"))
			{
				sb.append("0");
			}
			else
			{				
				//统计末尾0的数量
				for(int i=strs[0].length()-1;i>=0;i--)
				{
					if(datas[i]=='0') 
					{
						count++;
					}
					else
					{
						break;
					}
				}
				
				for(int i=strs[0].length()-1-count;i>=0;i--)
				{
					sb.append(datas[i]);
				}
			}
			
			sb.append(".");
			count = 0;
			
			
			if(strs[1].length()==1||Long.parseLong(strs[1])==0)
			{
				sb.append(strs[1].charAt(0));
			}
			else
			{
				datas = strs[1].toCharArray();
				//统计小数开头0的数量
				for(int i=0;i<strs[1].length();i++)
				{
					if(datas[i]=='0') 
					{
						count++;
					}
					else
					{
						break;
					}
				}
				
				for(int i=strs[1].length()-1;i>=count;i--)
				{
					sb.append(datas[i]);
				}
			}
		}
		else
		{
			
			datas = str.toCharArray();
			
			if(str.length()==1&&str.equals("0")) 
			{
				sb.append("0");
			}
			else
			{				
				//统计末尾0的数量
				for(int i=str.length()-1;i>=0;i--)
				{
					if(datas[i]=='0') 
					{
						count++;
					}
					else
					{
						break;
					}
				}
				
				for(int i=str.length()-1-count;i>=0;i--)
				{
					sb.append(datas[i]);
				}
			}
		}
			
		
		System.out.println(sb.toString());
	}
}