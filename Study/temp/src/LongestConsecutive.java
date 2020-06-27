import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public static void main(String[] args){
        /*int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));*/
        Integer a1 = 53;
        Integer a2 = 53;
        Integer a5 = new Integer(53);
        Integer a3 = 153;
        Integer a4 = 153;
        System.out.println(a1==a2);
        System.out.println(a1==a5);
        System.out.println(a3==a4);
    }
    public static int longestConsecutive(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int res = 1;
        for (int num : nums) {
            if(!set.contains(num-1)){
                int count = 1;
                int temp = num;

                while(set.contains(temp+1)){
                    ++temp;
                    ++count;
                }
                res = Math.max(count,res);
            }
        }


        return res;
    }
}
