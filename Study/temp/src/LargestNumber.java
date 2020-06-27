import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNumber {
    public static void main(String[] args){
        /*List<String> list = new ArrayList<>();
        list.add("989");
        list.add("919");
        list.add("979");
        list.add("929");
        list.add("959");
        list.add("939");
        list.add("999");

        for (String s : list) {
            System.out.print(s+" ");
        }

        System.out.println("===========");

        Collections.sort(list,(o1, o2) -> o2.charAt(1)-o1.charAt(1));

        for (String s : list) {
            System.out.print(s+" ");
        }*/
        int[] nums = {3,30,34,5,9};
        System.out.println(largestNumber_right(nums));
    }


    /**
     * 错误的排序
     *
     * 没有考虑第二位大于第一位的情况
     * @param nums
     * @return
     */
    public static String largestNumber(int[] nums) {
        if(nums==null||nums.length==0){
            return "0";
        }
        int len = nums.length;
        StringBuilder sb = new StringBuilder();
        String[][] strs = new String[10][len];
        int[] count = new int[10];
        List<String> list;
        for (int num : nums) {
            int start = (num+"").charAt(0)-'0';
            strs[start][count[start]] = num+"";
            count[start]++;
        }

        for (int i = 9; i >= 0; i--) {
            list = new ArrayList<>(Arrays.asList(strs[i]).subList(0, count[i]));

            int index = 1;
            do{
                for (int j = 0; j < list.size(); j++) {
                    if(list.get(j).length()==index){
                        sb.append(list.get(j));
                        list.remove(j);
                        j--;
                    }
                }
                if(!list.isEmpty()){
                    int finalIndex = index;
                    Collections.sort(list,(o1, o2) -> o2.charAt(finalIndex)-o1.charAt(finalIndex));
                    index++;
                }
            }while (list.size()>0);
        }



        return sb.toString();
    }


    public static String largestNumber_right(int[] nums) {
        if(nums==null||nums.length==0){
            return "0";
        }
        int len = nums.length;
        StringBuilder sb = new StringBuilder();
        String[] strs = new String[len];
        for (int i = 0; i < len; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        // 降序
        Arrays.sort(strs,(o1, o2) -> (o2+o1).compareTo(o1+o2));

        if("0".equals(strs[0])){
            return "0";
        }


        for (String str : strs) {
            sb.append(str);
        }


        return sb.toString();
    }
}
