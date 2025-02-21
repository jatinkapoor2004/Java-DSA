package Algorithms;

import java.util.Arrays;

public class Insertion_Sort 
{
    public static void main(String[] args) 
    {
        int a[]={26,17,9,3,2,8,10};    
        System.out.println(Arrays.toString(a));
        System.out.println("after");
        System.out.println(Arrays.toString(insertion(a)));
    }
    static int[] insertion(int a[])
    {
        int n=a.length;
        //number of passes are 1 to n-1 index i.e last element 
        for(int i=1;i<n;i++)
        {
            /* in each pass we store the i-th element in temp
             and then find element that are larger than temp 
             and move them. When find element smaller than temp
             it mean no need to swap and place temp there  
             because all the element to its left are small 
             if further small element is found that will also 
             repeat the same process and move it */
            int temp = a[i];
            int j;
            for(j=i-1;j>=0;j--)
            {
                if(a[j]>temp)
                {
                    a[j+1]=a[j];
                }
                else
                {
                    break;
                }
            }
            a[j+1]=temp;
            //System.out.println(Arrays.toString(a));
        }
        //0th index is automatically sorted so we don't run loop on it 
        return a;
    }
}
