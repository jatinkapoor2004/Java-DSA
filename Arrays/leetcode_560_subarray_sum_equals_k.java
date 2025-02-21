package Arrays;

import java.util.*;

public class leetcode_560_subarray_sum_equals_k 
{
    public static void main(String[] args) {
        int a[]={-1,-1,1};
        System.out.println(Arrays.toString(a));
        System.out.println(subarraySum(a, 0));
    }
    public static int subarraySum(int[] a, int k) 
        {
        int count=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int prefix_sum=0;
        hm.put(prefix_sum, 1);
        
        for(int i=0;i<a.length;i++)
        {
            prefix_sum = prefix_sum + a[i];
            if(hm.containsKey(prefix_sum - k))
            {
                count = count+ hm.get(prefix_sum - k);
                //hm.put(prefix_sum-k, hm.get(prefix_sum-k)+1);
            }
            
            if (hm.containsKey(prefix_sum))
            {
                hm.put(prefix_sum, hm.get(prefix_sum) + 1);
            } 
            else 
            {
                hm.put(prefix_sum, 1);
            }
        }
        return count;
    }
//    public static int subarraySum(int[] a, int k) 
//    {
//        int count=0;
//        int l=0,r,sum=0;
//        for(r=0 ; r<a.length ; r++)
//        {
//            System.out.println(r+"th iteration when "+a[r]+" is added to "+sum);
//            sum=sum+a[r];
//            System.out.println("sum is "+sum);
//            if(sum==k)
//            {
//                System.out.println("sum is equal to k ");
//                count++;
//                sum=sum-a[l];
//                l++;
//            }
//            else if(sum<k)
//            {
//                //do nothing
//                System.out.println("sum is less than k do nothing ");
//            }
//            else
//            {
//                System.out.println("sum is greater than k ");
//                while(l<r)
//                {
//                    sum=sum-a[l];
//                    l++;
//                    if(sum==k)
//                    {
//                        count++;
//                    }
//                    if(sum<k)
//                    {
//                        break;
//                    }
//                }
//            }
//            System.out.println("------------------\n");
//        }
//        return count;
//    }
}
