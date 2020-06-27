package cn.sd.yz.NoviceVillage04;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Temperature_Record2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n=reader.read();
        
        reader.readLine();
        String[] split = reader.readLine().split(" ");
        
        int res=0;
        int max=0;
        for (int i = 1; i < split.length; i++) {
            int c = Integer.parseInt(split[i]);
            int d = Integer.parseInt(split[i-1]);
            if((c-d)>0) {
                res++;
            }else {
                max=Math.max(max, res);
                res=0;
            }
        }
        System.out.println(max+1);
    }

}
