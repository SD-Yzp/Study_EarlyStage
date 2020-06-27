import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositive {
    public static void main(String[] args){
        int[] nums = {0,2,3};
        System.out.println(firstMissingPositive_better(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        if(nums==null||nums.length==0){
            return 1;
        }
        int len = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for (int i = 1; i < len+1; i++) {
            if(!set.contains(i)){
                return i;
            }
        }

        return len+1;
    }


    public static int firstMissingPositive_better(int[] nums) {
        if(nums==null||nums.length==0){
            return 1;
        }
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            while(nums[i]>0 && nums[i]<len+1 && nums[nums[i]-1] != nums[i]){
                swap(nums,i,nums[i]-1);
            }
        }

        for (int i = 0; i < len; i++) {
            if(nums[i]!=i+1){
                return i+1;
            }
        }


        return len+1;
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[b];
        nums[b] = nums[a];
        nums[a] = temp;
    }
}
