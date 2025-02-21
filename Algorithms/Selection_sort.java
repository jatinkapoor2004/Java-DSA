package Algorithms;

import java.util.Arrays;

public class Selection_sort 
{
    public static void main(String[] args) 
    {
        int a[]={10,-1,0,9,5};    
        System.out.println(Arrays.toString(a));
        System.out.println("after");
        System.out.println(Arrays.toString(selection(a)));
    }
    static int[] selection(int a[])
    {
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            int min_index = i;
            for(int j=i;j<n;j++)
            {
               if(a[j]< a[min_index])
               {
                   min_index = j;
               }
            }
            int temp=a[min_index];
            a[min_index]=a[i];
            a[i]=temp;
        }
        
        return a;
    }
}
