import java.util.Arrays;

public class MaxSlidingWindow {
    public static void main(String[] args){
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int[] res = maxSlidingWindow(nums,3);
        System.out.println(Arrays.toString(res));
    }

    /**
     * ±©Á¦½â·¨
     * @param nums
     * @param k
     * @return
     */
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(k==1){
            return nums;
        }
        int len = nums.length - k + 1;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i+k; j++) {
                max = Math.max(nums[j],max);
            }
            res[i] = max;
        }

        return res;
    }
}
