package cn.sd.yz.study;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args){
        int[] nums = {5,7,2,9,4,1,0,5,7};
        System.out.println(Arrays.toString(nums));
        shellSort(nums);
        System.out.println(Arrays.toString(nums));
    }


    public static void shellSort(int[] nums){
        int len = nums.length;

        for (int d = len/2; d > 0 ; d /= 2) {
            for (int i = d; i < len; i++) {
                for (int j = i-d; j >= 0; j-=d) {
                    if(nums[j]>nums[i]){
                        swap(nums,i,j);
                        i -= d;
                    }else{
                        break;
                    }
                }
            }
        }
    }

    /**
     * ½»»»Î»ÖÃ
     * @param nums
     * @param a
     * @param b
     */
    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
