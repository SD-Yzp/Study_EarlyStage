package cn.sd.yz.study;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args){
        int[] nums = {5,7,2,9,4,1,0,5,7};
        System.out.println(Arrays.toString(nums));
        insertSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void insertSort(int[] nums){
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            for (int j = i-1; j >= 0; j--) {
                if(nums[i]<nums[j]){
                    swap(nums,i,j);
                    i--;
                }else{
                    break;
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
