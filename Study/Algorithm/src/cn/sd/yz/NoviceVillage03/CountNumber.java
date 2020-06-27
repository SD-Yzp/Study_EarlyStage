package cn.sd.yz.NoviceVillage03;

import java.util.Scanner;

public class CountNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();  //1<=n<=1000000
		int x = in.nextInt();  //0<=x<=9
		
		int count = 0;
		
		
//		String str = String.valueOf(n);
//		char[] datas = str.toCharArray();
//		
//		for(int i=0;i<str.length();i++) {
//			
//		}
//		int max = (int)Math.pow(10, str.length()-1);
//		for(int i=0;i<str.length();i++) {
//			for(int j=(int)Math.pow(10, i);j<(int)Math.pow(10, i+1);j++) {
//				if(j%(int)Math.pow(10, i)==x) {
//					count++;
//				}
//			}
//		}
		
		
		if(n<10) {
			for(int i=1;i<=n;i++) {
				if(x==i) {
					count++;
				}
			}
			
			
		}else if(n<100&&n>9){
			for(int i=1;i<10;i++) {
				if(x==i) {
					count++;
				}
			}
			for(int i=10;i<=n;i++) {
				if(i/10==x) {
					count++;
				}
				if(i%10==x) {
					count++;
				}
			}
			
			
		}else if(n>99&&n<1000){
			for(int i=1;i<10;i++) {
				if(x==i) {
					count++;
				}
			}
			for(int i=10;i<100;i++) {
				if(i/10==x) {
					count++;
				}
				if(i%10==x) {
					count++;
				}
			}
			for(int i=100;i<=n;i++) {
				if(i/100==x) {
					count++;
				}
				if(i%100/10==x) {
					count++;
				}
				if(i%10==x) {
					count++;
				}
			}
			
			
		}else if(n<10000&n>999){
			for(int i=1;i<10;i++) {
				if(x==i) {
					count++;
				}
			}
			
			for(int i=10;i<100;i++) {
				if(i/10==x) {
					count++;
				}
				if(i%10==x) {
					count++;
				}
			}
			
			for(int i=100;i<1000;i++) {
				if(i/100==x) {
					count++;
				}
				if(i%100/10==x) {
					count++;
				}
				if(i%10==x) {
					count++;
				}
			}
			
			for(int i=1000;i<=n;i++) {
				if(i/1000==x) {
					count++;
				}
				if(i%1000/100==x) {
					count++;
				}
				if(i%100/10==x) {
					count++;
				}
				if(i%10==x) {
					count++;
				}
			}
			
			
		}else if(n<100000&&n>9999){
			for(int i=1;i<10;i++) {
				if(x==i) {
					count++;
				}
			}
			
			for(int i=10;i<100;i++) {
				if(i/10==x) {
					count++;
				}
				if(i%10==x) {
					count++;
				}
			}
			
			for(int i=100;i<1000;i++) {
				if(i/100==x) {
					count++;
				}
				if(i%100/10==x) {
					count++;
				}
				if(i%10==x) {
					count++;
				}
			}
			
			for(int i=1000;i<10000;i++) {
				if(i/1000==x) {
					count++;
				}
				if(i%1000/100==x) {
					count++;
				}
				if(i%100/10==x) {
					count++;
				}
				if(i%10==x) {
					count++;
				}
			}
			
			for(int i=10000;i<=n;i++) {
				if(i/10000==x) {
					count++;
				}
				if(i%10000/1000==x) {
					count++;
				}
				if(i%1000/100==x) {
					count++;
				}
				if(i%100/10==x) {
					count++;
				}
				if(i%10==x) {
					count++;
				}
			}
			
			
		}else if(n<1000000&&n>99999){
			for(int i=1;i<10;i++) {
				if(x==i) {
					count++;
				}
			}
			
			for(int i=10;i<100;i++) {
				if(i/10==x) {
					count++;
				}
				if(i%10==x) {
					count++;
				}
			}
			
			for(int i=100;i<1000;i++) {
				if(i/100==x) {
					count++;
				}
				if(i%100/10==x) {
					count++;
				}
				if(i%10==x) {
					count++;
				}
			}
			
			for(int i=1000;i<10000;i++) {
				if(i/1000==x) {
					count++;
				}
				if(i%1000/100==x) {
					count++;
				}
				if(i%100/10==x) {
					count++;
				}
				if(i%10==x) {
					count++;
				}
			}
			
			for(int i=10000;i<100000;i++) {
				if(i/10000==x) {
					count++;
				}
				if(i%10000/1000==x) {
					count++;
				}
				if(i%1000/100==x) {
					count++;
				}
				if(i%100/10==x) {
					count++;
				}
				if(i%10==x) {
					count++;
				}
			}	
			
			for(int i=100000;i<=n;i++) {
				if(i/100000==x) {
					count++;
				}
				if(i%100000/10000==x) {
					count++;
				}
				if(i%10000/1000==x) {
					count++;
				}
				if(i%1000/100==x) {
					count++;
				}
				if(i%100/10==x) {
					count++;
				}
				if(i%10==x) {
					count++;
				}
			}
			
			
		}else {
			for(int i=1;i<10;i++) {
				if(x==i) {
					count++;
				}
			}
			
			for(int i=10;i<100;i++) {
				if(i/10==x) {
					count++;
				}
				if(i%10==x) {
					count++;
				}
			}
			
			for(int i=100;i<1000;i++) {
				if(i/100==x) {
					count++;
				}
				if(i%100/10==x) {
					count++;
				}
				if(i%10==x) {
					count++;
				}
			}
			
			for(int i=1000;i<10000;i++) {
				if(i/1000==x) {
					count++;
				}
				if(i%1000/100==x) {
					count++;
				}
				if(i%100/10==x) {
					count++;
				}
				if(i%10==x) {
					count++;
				}
			}
			
			for(int i=10000;i<100000;i++) {
				if(i/10000==x) {
					count++;
				}
				if(i%10000/1000==x) {
					count++;
				}
				if(i%1000/100==x) {
					count++;
				}
				if(i%100/10==x) {
					count++;
				}
				if(i%10==x) {
					count++;
				}
			}	
			
			for(int i=100000;i<=n;i++) {
				if(i/100000==x) {
					count++;
				}
				if(i%100000/10000==x) {
					count++;
				}
				if(i%10000/1000==x) {
					count++;
				}
				if(i%1000/100==x) {
					count++;
				}
				if(i%100/10==x) {
					count++;
				}
				if(i%10==x) {
					count++;
				}
			}
			
			if(n==1000000&&(x==0||x==1)) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
	}
}
