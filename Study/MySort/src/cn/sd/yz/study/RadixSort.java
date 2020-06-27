package cn.sd.yz.study;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args){
        int[] arr = new int[] {23,6,189,45,9,287,56,1,798,34,65,652,5};
        System.out.println(Arrays.toString(arr));
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void radixSort(int[] nums){
        int max = Integer.MIN_VALUE;
        int len = nums.length;
        for (int num : nums) {
            max = Math.max(num, max);
        }
        int maxLen = (max+"").length();
        int[][] temp = new int[10][len];
        int[] count = new int[10];
        for (int i = 0, n = 1; i < maxLen; i++,n*=10) {
            for (int num : nums) {
                int ys = num/n%10;
                temp[ys][count[ys]++] = num;
            }
            
            int index = 0;
            // È¡³ö
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < count[j]; k++) {
                    nums[index++] = temp[j][k];
                }
                // ÖØÖÃ
                count[j] = 0;
            }
        }
    }
}
