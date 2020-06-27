package Test1;

import java.util.Scanner;

/**
 * 打印一圈数字
 * @author Yin
 *
 */
public class Circle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[][] a = new int[n][n];
		
		int min = 0;
		int max = n-1;
		int num = 1;
		while(min<max) {
			int i = min;
			int j = min;
			for(;j<max;j++) {
				a[i][j]=num;
				num++;
				num = checkNum(num);
			}
			for(;i<max;i++) {
				a[i][j]=num;
				num++;
				num = checkNum(num);
			}
			for(;j>min;j--) {
				a[i][j]=num;
				num++;
				num = checkNum(num);
			}
			for(;i>min;i--) {
				a[i][j]=num;
				num++;
				num = checkNum(num);
			}
			min++;
			max--;
		}
		if(min==max) {
			a[min][max]=num;
		}
		for(int k=0;k<n;k++) {
			for(int l=0;l<n;l++) {
				System.out.print(a[k][l]+" ");
			}
			System.out.println();
		}
	}
	
	public static int checkNum(int num) {
		if(num>9) {
			num-=9;
			return num;
		}
		return num;
	}
}
