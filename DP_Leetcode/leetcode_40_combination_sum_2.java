package DP_Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_40_combination_sum_2 
{
    public static void main(String[] args) {
        int candidates[]={10,1,2,7,6,1,5};
        int target=8;
        System.out.println(combinationSum(candidates, target));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        Arrays.sort(candidates);
        System.out.println(Arrays.toString(candidates));
        int n=candidates.length;
        List<List<Integer>> mainlist=new ArrayList<>();
        List<Integer>al=new ArrayList<>();
        mine(candidates, target,n,mainlist,"",al);
        return mainlist;
    }
    public static void mine(int a[],int target,int n,List<List<Integer>>mainlist,String ans,List<Integer>al)
    {
        
        if(target==0)
        {
            //System.out.println(ans);
            System.out.println(al);
            if(!mainlist.contains(al))
            mainlist.add(new ArrayList<>(al));
            
        }
        else if(n==0)
        {
            //doing nothing
        }
        else
        {
            int index=n-1;
            if(index==n-1 || a[index]!=a[index+1])
            {
                if(target-a[index]>=0)
                {
                    al.add(a[index]);
                    mine(a, target-a[index], n-1, mainlist,ans+" "+a[index],al);
                    al.remove(al.size()-1);
                }
                mine(a, target, n-1, mainlist,ans+" ",al);
            }
            
            
        }
    }
}
