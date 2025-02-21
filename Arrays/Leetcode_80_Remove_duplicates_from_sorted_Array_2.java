package Arrays;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class Leetcode_80_Remove_duplicates_from_sorted_Array_2 
{
    public static void main(String[] args) 
    {
        int a[]={0,0,1,1,1,1,2,3,3};
        //System.out.println("before "+ Arrays.toString(a));
        System.out.println(removeDuplicates(a));
        //System.out.println("after"+ Arrays.toString(a));
    }
    
    public static int removeDuplicates(int[] a) 
    {
        int k=0;
        LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(hm.containsKey(a[i]))
            {
                hm.put(a[i], 1+hm.get(a[i]));
            }
            else
            {
                hm.put(a[i], 1);
            }
        }
        //System.out.println(hm);
        for(int p:hm.keySet())
        {
            int len=1;
            if(hm.get(p)>=2)
                len=2;
            for(int i=1;i<=len;i++)
            {
                a[k++]=p;
            }
        }
        return k;
    }
}
