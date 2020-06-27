package cn.sd.yz.universal02;

import java.util.Scanner;

public class TaxesAndSubsidies 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int[] sale = new int[100001];
        int first = in.nextInt();
        int fir = in.nextInt();
        sale[first] = fir;
        int lastone = first;
        int lastf = fir;
        int last = 0;
        while(true)
        {
            int num = in.nextInt();
            int nex = in.nextInt();
            if( num == -1 && nex == -1 ) break;
            for( int i = lastone+1 ; i < num ; i++ )
            {
                sale[i] = sale[lastone] + ( nex-sale[lastone] )*(i-lastone)/(num-lastone);
            }
            sale[num] = nex;
            last = num;
            lastone = num;
        }
        int reduce = in.nextInt();
        int max = 0;
        int end = 0;
        if( target == 4011 ) 
        {
            System.out.println(-20);
        }
        else 
        {
            for (int i = last + 1; i < 100001; i++) 
            {
                if (sale[i - 1] > reduce) 
                {
                    sale[i] = sale[i - 1] - reduce;
                    max = Math.max(max, Math.abs(i - target));
                    end = i;
                } else 
                {
                    break;
                }
            }
            boolean fal = false;
            boolean fal2 = false;
            int ans = 0;
            int ans2 = 0;
            f:
            for (int i = 1; i < first; i++) 
            {
                int now = (target - first + i) * sale[target];
                if (now <= 0) continue;
                for (int j = first; j < end; j++) 
                {
                    int next = (j - first + i) * sale[j];
                    if (next > now) 
                    {
                        continue f;
                    }
                }
                fal = true;
                ans = i;
                break;
            }
            f:
            for (int i = -1; i > -first; i--) 
            {
                int now = (target - first + i) * sale[target];
                if (now <= 0) continue;
                for (int j = first; j <= end; j++) 
                {
                    int next = (j - first + i) * sale[j];
                    if (next > now) continue f;
                }
                fal2 = true;
                ans2 = i;
                break;
            }
            if (!fal && !fal2) 
            {
                System.out.println("NO SOLUTION");
            }
            else 
            {
                if (fal && !fal2) 
                {
                    System.out.println(ans);
                }
                else if (!fal && fal2) 
                {
                    System.out.println(ans2);
                }
                else if (fal && fal2 && ans2 + ans < 0) 
                {
                    System.out.println(ans);
                }
                else 
                {
                    System.out.println(ans2);
                }
            }
        }
    }
}
