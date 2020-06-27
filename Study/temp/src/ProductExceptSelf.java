import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        int[] res = productExceptSelf_better(nums);
        System.out.println(Arrays.toString(res));
    }

    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] left = new int[len];
        int[] right = new int[len];
        int[] res = new int[len];
        left[0] = 1;
        right[0] = 1;
        for (int i = 1; i < len; i++) {
            left[i] = left[i-1] * nums[i-1];
            right[i] = right[i-1] * nums[len-i];
        }
        for (int i = 0; i < len; i++) {
            res[i] = left[i] * right[len-1-i];
        }

        return res;
    }

    public static int[] productExceptSelf_better(int[] nums) {
        int len = nums.length;

        int[] res = new int[len];
        res[0] = 1;
        for (int i = 1; i < len; i++) {
            res[i] = res[i-1] * nums[i-1];
        }
        int temp = 1;
        for (int i = len-2; i >= 0; i--) {
            temp *= nums[i+1];
            res[i] *= temp;
        }

        return res;
    }
}
