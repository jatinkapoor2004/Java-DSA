package Greedy;

import Strings.count_anagrams_of_W_in_string_S;
import java.util.Arrays;

public class Leetcode_322_Coin_Change_Greedy_Approach 
{
    public static void main(String[] args) 
    {
        int coins[]={1,2,5};
        int amount=11;
        System.out.println(coinChange(coins, amount));
    }
    public static int coinChange(int[] a, int target) 
    {
        Arrays.sort(a);
        int count=0;
        for(int i=a.length-1;i>=0;i--)
        {
            int diff = target - a[i];
            if(diff > 0)
            {
                count++;
            }
            else if(diff==0)
            {
                count++;
                break;
            }
        }
    }
}
