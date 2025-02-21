package Algorithms;

import java.util.Arrays;

public class Quick_Sort 
{
    public static void main(String[] args) 
    {
        int a[]={7,6,2,10,8,4,1,3,9,5};    
        System.out.println(Arrays.toString(a));
        System.out.println("after");
        quick(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    
    static int partition(int a[],int L,int U)
    {
        int i=L-1;
        int j;
        int pivot = a[U];
        for(j=L;j<U;j++)
        {
            if(a[j] < pivot)
            {
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[i+1];
        a[i+1]=a[U];
        a[U]=temp;
        //System.out.println(Arrays.toString(a));
        //System.out.println("pos returned is " + (i+1) );
        //System.out.println("-----------------");
        return i+1;
    }
    static void quick(int a[],int L,int U)
    {
        if(L>=U)
        {
            //do nothing as only 1 element left
        }
        else
        {
            int pos = partition(a,L,U);
            quick(a, L, pos-1);
            quick(a, pos+1, U);
        }
    }
}
