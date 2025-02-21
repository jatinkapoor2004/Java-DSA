package Recursion_leetcode;
import java.util.*;
public class leetcode_46_permutations 
{
    public static void main(String[] args) {
        int a[]={1,2,3};
        System.out.println(permute(a));
    }
    public static List<List<Integer>> permute(int[] nums)
    {
        List<List<Integer>> mainlist=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        permute(nums,new ArrayList<>(), mainlist,new boolean[nums.length]);
        return mainlist;
    }
    public static void permutations(int a[],List<Integer> curr,List<List<Integer>>mainlist)
    {
        if(curr.size()==a.length)
        {
            mainlist.add(new ArrayList<>(curr));
        }
        else
        {
            for(int i=0;i<a.length;i++)
            {
                if(curr.contains(a[i]))
                continue;
                
                curr.add(a[i]);
                permutations(a, curr, mainlist);
                curr.remove(curr.size()-1);
            }
        }
    }
    
    public static List<List<Integer>> permuteUnique(int[] nums)
    {
        List<List<Integer>> mainlist=new ArrayList<>();
        permute(nums,new ArrayList<>(), mainlist,new boolean[nums.length]);
        return mainlist;
    }
    static void permute(int a[],ArrayList<Integer> curr,List<List<Integer>> mainlist, boolean used[])
    {
       if(curr.size()==a.length && !mainlist.contains(curr))
        {
            mainlist.add(new ArrayList<>(curr));
        }
        else
        {
            for(int i=0;i<a.length;i++)
            {
                if(used[i])continue;
                //number is not used before so we used it and make it true
                curr.add(a[i]);
                used[i]=true;
                permute(a, curr, mainlist,used);
                //while returning delete the number and make it unused
                curr.remove(curr.size()-1);
                used[i]=false;
            }
        }
    }
}
