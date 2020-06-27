package cn.sd.yz.NoviceVillage03;

import java.util.Scanner;

/**
 * 无敌九循环！
 * @author Yin
 *
 */
public class ThreeStrikes {
	public static void main(String[] args) {		
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		
		int[] num = new int[10];
		int[] result = new int[3];
		
		boolean flag = false;
		
		for(int i=1;i<=9;i++) {
			num[i]=i;
		}
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=9;j++) {
				if(j==i) {
					continue;
				}else {
					for(int k=1;k<=9;k++) {
						if(k==i||k==j) {
							continue;
						}else {
							result[0]=num[i]*100+num[j]*10+num[k];
							
							

							
							for(int l=2;l<=6;l++) {
								if(l==i||l==j||l==k) {
									continue;
								}else {
									for(int m=1;m<=9;m++) {
										if(m==i||m==j||m==k||m==l) {
											continue;
										}else {
											for(int n=1;n<=9;n++) {
												if(n==i||n==j||n==k||n==l||n==m) {
													continue;
												}else {
													result[1]=num[l]*100+num[m]*10+num[n];
													
													
													
													
													for(int o=3;o<=9;o++) {
														if(o==i||o==j||o==k||o==l||o==m||o==n) {
															continue;
														}else {
															for(int p=1;p<=9;p++) {
																if(p==i||p==j||p==k||p==l||p==m||p==n||p==o) {
																	continue;
																}else {
																	for(int q=1;q<=9;q++) {
																		if(q==i||q==j||q==k||q==l||q==m||q==n||q==o||q==p) {
																			continue;
																		}else {
																			result[2]=num[o]*100+num[p]*10+num[q];
																			if(a*result[2]==c*result[0]&&a*result[1]==b*result[0]) {
																				flag = true;
																				System.out.println(result[0]+" "+result[1]+" "+result[2]);
																			}
																		}
																	}
																}
															}
														}
													}
													
													
													
													
												}
											}						
										}
									}
								}
							}
							
							
							
							
							
							
						}
					}
				}
			}
		}
	
		if(!flag)
		{
			System.out.println("No!!!");
		}
	
	}
}