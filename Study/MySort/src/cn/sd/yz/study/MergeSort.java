package cn.sd.yz.study;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] nums = {5,7,2,9,4,1,0,5,7};
        System.out.println(Arrays.toString(nums));
        mergeSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void mergeSort(int[] nums,int low,int high){
        int middle = (low+high) / 2;
        if(low<high){
            mergeSort(nums,low,middle);
            mergeSort(nums,middle+1,high);
            merge(nums,low,middle,high);
        }
    }


    public static void merge(int[] nums,int low,int middle,int high){
        int[] temp = new int[high-low+1];
        int a = low;
        int b = middle+1;
        int index = 0;
        while(a<=middle&&b<=high){
            if(nums[a]>nums[b]){
                temp[index] = nums[b];
                b++;
            }else{
                temp[index] = nums[a];
                a++;
            }
            index++;
        }
        while(a<=middle){
            temp[index] = nums[a];
            a++;
            index++;
        }
        while(b<=high){
            temp[index] = nums[b];
            b++;
            index++;
        }

        System.arraycopy(temp, 0, nums, low, index);
    }
}
