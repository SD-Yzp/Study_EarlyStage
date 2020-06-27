package cn.sd.yz.study;

import java.util.Arrays;

/**
 * √∞≈›≈≈–Ú
 */
public class BubbleSort {
    public static void main(String[] args){
        int[] nums = {5,7,2,9,4,1,0,5,7};
        System.out.println(Arrays.toString(nums));
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void bubbleSort(int[] nums){
        int len = nums.length;
        boolean flag = true;
        for (int i = 0; i < len-1 && flag; i++) {
            flag = false;
            for (int j = 0; j < len-1; j++) {
                if(nums[j]>nums[j+1]){
                    swap(nums,j,j+1);
                    flag = true;
                }
            }
        }
    }

    /**
     * ΩªªªŒª÷√
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
