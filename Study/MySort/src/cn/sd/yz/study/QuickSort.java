package cn.sd.yz.study;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args){
        int[] nums = {5,7,2,9,4,1,0,5,7};
        System.out.println(Arrays.toString(nums));
        quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int[] nums,int start,int end){
        if(start>=end){
            return;
        }
        int standard = nums[start];
        int left = start;
        int right = end;
        while(left<right){
            while(left<right&&nums[right]>=standard){
                right--;
            }
            nums[left] = nums[right];
            while (left<right&&nums[left]<=standard){
                left++;
            }
            nums[right] = nums[left];
        }
        nums[left] = standard;
        quickSort(nums,start,left);
        quickSort(nums,right+1,end);
    }

}
