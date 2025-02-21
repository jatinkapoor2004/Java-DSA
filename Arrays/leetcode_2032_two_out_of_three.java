package Arrays;

import java.util.*;

public class leetcode_2032_two_out_of_three 
{
    public static void main(String[] args) 
    {
        int nums1[]={3,1};
        int nums2[]={2,3};
        int nums3[]={1,2};
        System.out.println(twoOutOfThree(nums1, nums2, nums3));
    }
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3)
    {
        ArrayList<Integer> al=new ArrayList<>();
        int a[]=new int[101];
        int b[]=new int[101];
        int c[]=new int[101];

        for(int i=0;i<nums1.length;i++)
        {
            a[nums1[i]]++;
        }
        for(int i=0;i<nums2.length;i++)
        {
            b[nums2[i]]++;
        }
        for(int i=0;i<nums2.length;i++)
        {
            c[nums3[i]]++;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        for(int i=1;i<a.length;i++)
        {
            int count=0;
            if(a[i]>0)
            count++;

            if(b[i]>0)
            count++;

            if(c[i]>0)
            count++;

            if(count>1)
            al.add(i);
        }
        return al;
    }
}
