package Recursion_leetcode;
import java.util.*;
public class leetcode_39_combination_sum 
{
    public static void main(String[] args) {
        int candidates[]={ 2,3,6,7};
        System.out.println(combinationSum(candidates, 7));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>> mainlist=new ArrayList<>();
        ArrayList<Integer> al=new ArrayList<>();
        backtrack(candidates, target,0,mainlist,al);
        return mainlist;
    }
    static void backtrack(int a[],int target,int start,List<List<Integer>> mainlist,ArrayList<Integer>al)
    {
        if(target==0)
        {
           // System.out.println("base case hits");
            //System.out.println(al);
            mainlist.add(new ArrayList<>(al));
        }
        if(target<0)
        {
            return;
        }
            for(int i=start;i<a.length;i++)
            {
                al.add(a[i]);
                backtrack(a, target-a[i], i, mainlist, al);
                al.remove(al.size()-1);
                //System.out.println(al);
            }                       
        
    }
}
