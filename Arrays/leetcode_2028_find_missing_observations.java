package Arrays;

import java.util.Arrays;

public class leetcode_2028_find_missing_observations 
{
    public static void main(String[] args) {
        int rolls[]={4,2,2,5,4,5,4,5,3,3,6,1,2,4,2,1,6,5,4,2,3,4,2,3,3,5,4,1,4,4,5,3,6,1,5,2,3,3,6,1,6,4,1,3};
        int mean=2;
        int n=53;
        System.out.println(Arrays.toString(missingRolls(rolls, mean, n)));
    }
    public static int[] missingRolls(int[] a, int mean, int n) 
    {
        int current_sum= Arrays.stream(a).sum();
        int target= (a.length+n)*mean;
        int remaining=target-current_sum;
        System.out.println(remaining);
        
        if(remaining<0 || remaining> n*6 || n>remaining)
            return new int[0];
        int ans[]=new int[n];
        int i=0;
        while(remaining>0)
        {
            ans[i]++;
            i++;
            remaining--;
            i=i%n;
        }
        return ans;
    }
}
