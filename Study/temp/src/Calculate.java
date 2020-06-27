import java.util.ArrayList;
import java.util.List;

/**
 * 基本计算器 II
 */
public class Calculate {
    public static void main(String[] args){
        String s = "2*3+4";
        System.out.println(calculate(s));
    }


    public static int calculate(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        char[] chars = s.toCharArray();
        List<Integer> list = new ArrayList<>();
        List<Character> list_c = new ArrayList<>();
        // 遇到 + - 加1
        int count = 0;
        for (int i = 0; i < chars.length; ) {
            if(chars[i]<='9'&&chars[i]>='0'){
                int start = i;
                while(i<chars.length&&chars[i]<='9'&&chars[i]>='0'){
                    i++;
                }
                int end = i;
                list.add(Integer.valueOf(s.substring(start,end)));
            }else if(chars[i]=='+'||chars[i]=='-'){
                ++count;
                list_c.add(chars[i]);
                if(count==2){
                    Integer a = list.remove(list.size() - 1);
                    Integer b = list.remove(list.size() - 1);
                    Character c = list_c.remove(list_c.size() - 2);
                    if(c.equals('+')){
                        list.add(b+a);
                    }else{
                        list.add(b-a);
                    }
                    --count;
                }
                ++i;
            }else if(chars[i]=='/'||chars[i]=='*'){
                char c = chars[i];
                Integer b = list.remove(list.size() - 1);
                // 直接读入下一个数
                ++i;
                while(chars[i]==' '){
                    ++i;
                }
                int start = i;
                while(i<chars.length&&chars[i]<='9'&&chars[i]>='0'){
                    ++i;
                }
                int end = i;
                int a = Integer.parseInt(s.substring(start,end));

                if(c=='*'){
                    list.add(b*a);
                }else{
                    list.add(b/a);
                }
            }else{
                ++i;
            }
        }


        if(count==1){
            Integer a = list.remove(0);
            Integer b = list.remove(0);
            Character c = list_c.remove(0);
            if(c.equals('+')){
                list.add(a+b);
            }else{
                list.add(a-b);
            }
        }

        return list.get(0);
    }
}