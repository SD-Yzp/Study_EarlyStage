package cn.sd.yz.study;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args){
        int[] nums = {5,7,2,9,4,1,0,5,7};
        System.out.println(Arrays.toString(nums));
        selectSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void selectSort(int[] nums){
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            int max = Integer.MIN_VALUE;
            int index = 0;
            for (int j = 0; j < len - i; j++) {
                if(max < nums[j]){
                    max = nums[j];
                    index = j;
                }
            }
            swap(nums,index,len-i-1);
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
