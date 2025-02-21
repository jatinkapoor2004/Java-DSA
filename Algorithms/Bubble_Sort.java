package Algorithms;

import java.util.Arrays;

public class Bubble_Sort 
{
    public static void main(String[] args) 
    {
        int a[]={10,-1,0,9,5};    
        System.out.println(Arrays.toString(a));
        bubble(a);
        System.out.println("after");
        System.out.println(Arrays.toString(a));
    }
    static void bubble(int a[])
    {
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(a[j+1] < a[j])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
}
