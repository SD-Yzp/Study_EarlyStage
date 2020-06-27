package cn.sd.yz.NoviceVillage05;

import java.util.Scanner;

public class CountWords 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		boolean flag = false;
		int count = 0;
		int record = -1;
		String target = in.nextLine();
		String article = in.nextLine();
		
		
		String lowerCase_Target = target.toLowerCase();
		String lowerCase_Article = article.toLowerCase();
		
		String[] words = lowerCase_Article.split(" ");
		
		for(int i=0;i<words.length;i++) 
		{
			if(lowerCase_Target.equals(words[i])) 
			{
				if(!flag) 
				{
					if(i==0)
					{						
						String str = lowerCase_Target+" ";
						record = lowerCase_Article.indexOf(str);
					}
					else if(i==words.length-1)
					{
						String str = " "+lowerCase_Target;
						record = lowerCase_Article.indexOf(str)+1;
					}
					else 
					{
						String str = " "+lowerCase_Target+" ";
						record = lowerCase_Article.indexOf(str)+1;
					}
				}
				flag = true;
				count++;
			}
		}
		
		if(record!=-1) 
		{	
			System.out.println(count+" "+record);
		}
		else
		{
			System.out.println(record);
		}
	}
}
