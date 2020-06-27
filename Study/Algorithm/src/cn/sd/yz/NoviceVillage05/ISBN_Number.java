package cn.sd.yz.NoviceVillage05;

import java.util.Scanner;

public class ISBN_Number {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		int sum = 0;
		int k = 1;
		
		String[] strs = str.split("-");
		for(int i=0;i<strs.length-1;i++) {
			char[] datas = strs[i].toCharArray();
			for(int j=0;j<datas.length;j++) {
				sum += (int)(datas[j]-'0')*k;
				k++;
			}
		}
		
		int right = sum%11;
		String rightStr = ""; 
		if(right == 10) {
			rightStr += "X";
		}else {
			rightStr += right;
		}
		String temp = strs[strs.length-1];
		
		if(temp.equals(rightStr)) {
			System.out.println("Right");
		}else {
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<strs.length-1;i++) {
				sb.append(strs[i]+"-");
			}
			sb.append(rightStr);
			System.out.println(sb.toString());
		}
		
	}
}
