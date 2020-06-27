package cn.sd.yz.NoviceVillage05;

import java.util.Scanner;

public class YourRideIsHere 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		String comet = in.next();
		String team = in.next();
		
		char[] comets = comet.toCharArray();
		char[] teams = team.toCharArray();
		int proComet = 1;
		int proTeam = 1;
		int resultComet,resultTeam;
		
		for(int i=0;i<comets.length;i++) 
		{
			proComet *= (int)(comets[i]-'A')+1;
		}
		resultComet = proComet%47;
		
		for(int i=0;i<teams.length;i++) 
		{
			proTeam *= (int)(teams[i]-'A')+1;
		}
		resultTeam = proTeam%47;
		
		if(resultComet == resultTeam) 
		{
			System.out.println("GO");
		}
		else 
		{
			System.out.println("STAY");
		}
	}
}
