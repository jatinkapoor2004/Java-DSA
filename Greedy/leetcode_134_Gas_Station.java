package Greedy;

import java.util.Arrays;

public class leetcode_134_Gas_Station 
{    
    public static void main(String[] args) 
    {
        int gas[]={1,1,3};
        int cost[]={2,2,1};
        System.out.println(canCompleteCircuit(gas, cost));
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) 
    {
        if( Arrays.stream(gas).sum()< Arrays.stream(cost).sum())
        {
            return -1;
        }
        else
        {
            int start=0;
            int current_gas=0;
            for(int i=0;i<gas.length;i++)
            {
                current_gas += gas[i] - cost[i];
                
                
                if(current_gas < 0)
                {                    
                    current_gas=0;
                    start = i+1;
                }
                else
                {
                    //do nothing
                }
                
            }
            return start;
        }
    }
}
