package Recursion_leetcode;
import java.util.*;
public class leetcode_90_subsets_2 
{
    public static void main(String[] args) 
    {
        int a[]={1,2,2};
        System.out.println(subsetsWithDup(a));
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        List<List<Integer>> mainlist=new ArrayList<>();
        mine_subset(nums, 0, new ArrayList<>(), mainlist);
        return mainlist;
    }
    static void mine_subset(int a[],int index,ArrayList<Integer> curr,List<List<Integer>> mainlist)
    {
        mainlist.add(new ArrayList<>(curr));
            
            for(int i=index;i<a.length;i++)
            {
                if(i>index && a[i]==a[i-1])continue;
                
                curr.add(a[i]);
                mine_subset(a,i+1,curr,mainlist);
                curr.remove(curr.size()-1);
            }
    }    
}
