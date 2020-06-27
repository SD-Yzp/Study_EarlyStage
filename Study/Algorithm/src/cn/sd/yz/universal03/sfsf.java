package cn.sd.yz.universal03;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class sfsf
{
    static Scanner in=new Scanner(System.in);
    static int n=in.nextInt();
    static long[] a=new long[n+5];
    
    public static void main(String[] args) 
    {
       
        int i=0,j=n-1;
        for(int t=0;t<n;t++)
        {
            a[t]=in.nextInt();
        }
        
        sort(i,j);
        
        for(int t=0;t<n;t++)
        {
            System.out.print(a[t]+" ");
        }
    }
 
 
    
    static void sort(int left,int right)
    {
        int l=left;
        int r=right;
        long pivot=a[(left+right)/2];//找中间值
        long temp=0;
        while(l<r)
        {
        	while(a[l]<pivot) 
        	{        		
        		l++;
        	}
        	
        	while(a[r]>pivot) 
        	{        		
        		r--;
        	}
        	
        	if(l>=r) 
        	{        		
        		break;
        	}
        	
        	temp=a[l];
        	a[l]=a[r];
        	a[r]=temp;
        	
        	if(a[l]==pivot) 
        	{	
        		--r;
        	}
        	
        	if(a[r]==pivot) 
        	{
        		++l;      		
        	}
        }
        if(l==r)
        {
        	l++;
        	r--;
        }
        if(left<r) 
        {        	
        	sort(left,r);
        } 
        if(right>l) 
        {        	
        	sort(l,right);
        }
    }
        
     
    
}
