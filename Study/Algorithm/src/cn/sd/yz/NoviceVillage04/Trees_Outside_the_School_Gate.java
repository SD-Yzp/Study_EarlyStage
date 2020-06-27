package cn.sd.yz.NoviceVillage04;

import java.util.Scanner;

public class Trees_Outside_the_School_Gate {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int l = in.nextInt();
		int m = in.nextInt();
		
		int[] trees = new int[l+1];
		int[][] regions = new int[m][2];
		int count = 0;
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<2;j++) {
				regions[i][j] = in.nextInt();
			}
		}
				
		for(int i=0;i<=l;i++) {
			trees[i] = 1;
		}
		
		for(int i=0;i<m;i++) {
			for(int j=regions[i][0];j<=regions[i][1];j++) {
				trees[j] = 0;
			}
		}
		
		for(int i=0;i<=l;i++) {
			if(trees[i] == 1) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}
}
