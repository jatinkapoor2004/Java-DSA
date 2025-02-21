package Arrays;

import java.util.*;

public class leetcode_128_longest_consecutive_sequence 
{
    public static void main(String[] args) {
        int a[]={9,1,-3,2,4,8,3,-1,6,-2,-4,7};
        System.out.println(longestConsecutive(a));
    }
    
    public static int longestConsecutive(int[] a) 
    {
        TreeSet<Integer> hs=new TreeSet<>();
        for(int p:a)
        {
            hs.add(p);
        }
        //System.out.println(hs);
        int max=1;
        int i=0;
        int prev=0;
        int count=0;
        for(int p:hs)
        {
            //System.out.println("number from hs is "+p);
            if(i==0)
            {
                prev=p;
                count++;
                i++;
                continue;
            }    
            if(prev+1==p)
            {
                //System.out.println("previous is "+prev+" and num "+p+" is equal to previous + 1");
                count++;
                prev=p;
                //System.out.println("now count is "+count);
                max=Math.max(max, count);
                //System.out.println("max is updated to "+max);
            }
            else
            {
                //System.out.println("number is not +1 than previous i.e "+prev);
                prev=p;
                count=1;
                
                //System.out.println("previous is updated to "+prev);
                //System.out.println("count is updated to "+count);
                
            }
            //System.out.println("---------------------------");
        }
        return max;
    }

    /*
    public static int longestConsecutive(int[] a) 
    {
        LinkedHashSet<Integer> hs=new LinkedHashSet<>();
        int min=a[0];
        for(int p:a)
        {
            min=Math.min(min, p);
        }
        System.out.println("minimum is "+min);
        hs.add(min);
        for(int p:a)
        {
            if(p!=min)
            hs.add(p);
        }
        System.out.println(hs);
        
        
        int max=1;
        int prev=0;
        int count=0;
        for(int p:hs)
        {
            System.out.println("number from hs is "+p);
            if(p==min)
            {
                prev=p;
                count++;
                
                continue;
            }    
            if(hs.contains(prev+1))
            {
                count++;
                prev=prev+1;
                System.out.println("now count is "+count);
                max=Math.max(max, count);
                System.out.println("max is updated to "+max);
            }
            else
            {
                prev++;
                count=1;
                System.out.println("previous is updated to "+prev);
                System.out.println("count is updated to "+count);
                
            }
            System.out.println("---------------------------");
        }
        return max;
    }
    */
    
}
