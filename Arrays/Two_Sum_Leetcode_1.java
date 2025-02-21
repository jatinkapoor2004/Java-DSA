package Arrays;

import java.util.*;

public class Two_Sum_Leetcode_1 
{
    public static void main(String[] args) {
        int a[]={3,3};
        System.out.println(Arrays.toString(twoSum(a, 6)));
    }
     static int[] twoSum(int a[], int target) {
        int b[] = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) 
        {
            int diff=target-a[i];
            if (hm.containsKey(diff)) 
            {
                b[0] = hm.get(diff);
                b[1] = i;
                return b;
            }            
          hm.put(a[i], i);            
        }
         return b;
    }
}
