package Recursion_leetcode;
import java.util.*;
public class leetcode_47_permutations_2 
{
    public static void main(String[] args) {
        int a[]={1,1,2};
        Arrays.sort(a);
        System.out.println(permuteUnique(a));
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
