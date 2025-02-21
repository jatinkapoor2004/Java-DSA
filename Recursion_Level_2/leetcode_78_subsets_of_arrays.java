package Recursion_Level_2;

import java.util.*;

public class leetcode_78_subsets_of_arrays 
{
    public static void main(String[] args) {
        int a[]={1,2,-2};
        System.out.println(subsets(a));
    }
    public static List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> mainlist=new ArrayList<>();
        mine_subset(nums, 0, "", mainlist);
        return mainlist;
    }
    static void mine_subset(int a[],int i,String ans,List<List<Integer>> mainlist)
    {
        if(i==a.length)
        {
            ArrayList<Integer> al=new ArrayList<>();
            //System.out.println(ans);
            StringTokenizer st=new StringTokenizer(ans);
            int count=st.countTokens();
            for(int j=0;j<count;j++)
            {
                al.add(Integer.valueOf(st.nextToken()));
            }
            mainlist.add(al);
        }
        else
        {
            mine_subset(a, i+1, ans+a[i]+" ", mainlist);
            mine_subset(a, i+1, ans, mainlist);
        }
    }
    
}
