package Recursion_leetcode;
import java.util.*;
//GIVEN :- HERE ALL NUMBERS ARE UNIQUE IN ARRAYS
public class leetcode_78_subsets 
{
    public static void main(String[] args) 
    {
        int a[]={1,2,3};
        System.out.println(subsets(a));
    }
    public static List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> mainlist=new ArrayList<>();
        mine_subset(nums, 0,new ArrayList<>(), mainlist);
        return mainlist;
    }
    static void mine_subset(int a[],int i,ArrayList<Integer> curr,List<List<Integer>> mainlist)
    {
            mainlist.add(new ArrayList<>(curr));
            
            for(int j=i;j<a.length;j++)
            {
                curr.add(a[j]);
                mine_subset(a,j+1,curr,mainlist);
                curr.remove(curr.size()-1);
            }
        
    }
}

