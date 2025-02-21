package Arrays;

import java.util.Arrays;

public class Leetcode_27_Remove_Element 
{
    public static void main(String[] args) {
        int a[]={3,3};
        System.out.println(Arrays.toString(a));
        System.out.println(removeElement(a, 3));
    }
    public static int removeElement(int[] a, int val) 
    {
        int count=0,j=a.length-1;
        for(int i=0;i<a.length-1 && i<j;i++)
        {
           System.out.println(i+"th iteration ");
           if(a[i]==val)
           {
               while(a[j]==val && j>i)
               {
                   j--;
               }
               
               System.out.println(a[i]+ " is replaced with "+a[j]);
               int temp=a[i];
               a[i]=a[j];
               a[j]=temp;
               System.out.println("after replacement "+Arrays.toString(a));
           }
            System.out.println("---------------------------------------------");

        }  
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=val)
            {
                count++;
            }
            else
                break;
        }
        return count;
    }
}
