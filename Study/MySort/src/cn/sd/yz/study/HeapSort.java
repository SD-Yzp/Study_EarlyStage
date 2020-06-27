package cn.sd.yz.study;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args){
        int[] arr = new int[] {9,6,8,7,0,1,10,4,2};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int[] nums){
        int start = (nums.length-1)/2;
        for (int i = start; i >= 0; i--) {
            maxHeap(nums,nums.length,i);
        }

        //将顶放到最后,遍历处理
        for (int i = nums.length-1; i > 0 ; i--) {
            swap(nums,0,i);
            maxHeap(nums,i,0);
        }
    }

    public static void maxHeap(int[] nums,int size,int index){
        int left = 2*index+1;
        int right = 2*index+2;

        int max = index;
        if(left<size&&nums[left]>nums[max]){
            max = left;
        }
        if(right<size&&nums[right]>nums[max]){
            max = right;
        }
        if(index!=max){
            swap(nums,index,max);
            // 可能打乱顺序
            maxHeap(nums,size,max);
        }
    }

    /**
     * 交换位置
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
