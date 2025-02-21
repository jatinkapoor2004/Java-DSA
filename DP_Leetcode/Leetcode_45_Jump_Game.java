package DP_Leetcode;
//TLE
public class Leetcode_45_Jump_Game 
{
    public static void main(String[] args) {
        int a[]={2,0,0};
        System.out.println(canJump(a));
    }
    public static boolean canJump(int[] nums) {
        return mine(nums, 0);
    }
    public static boolean mine(int a[],int i)
    {
        if(i==a.length-1)
        {
            return true;
        }
        else
        {
            int limit=a[i];
            for(int j=1;j<=limit;j++)
            {
                if(i+j < a.length)
                {
                    if (mine(a, i + j)) 
                    {
                        return true;
                    }
                }
                
            }
            return false;
        }
    }
}
