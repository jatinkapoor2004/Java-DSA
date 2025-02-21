package Recursion_leetcode;
import java.util.*;
public class leetcode_40_combination_sum_2 
{
    public static void main(String[] args) {
        int candidates[]={1,1,1,1};
        System.out.println(combinationSum2(candidates, 2));
    }
     public static List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        Arrays.sort(candidates);
        List<List<Integer>> mainlist=new ArrayList<>();
        mine_combinations(candidates,target,new ArrayList<>(),0,mainlist);
        return mainlist;
    }
    public static void mine_combinations(int a[],int target,ArrayList<Integer> curr,int index,List<List<Integer>> mainlist)
    {
        System.out.println("function is called with target left "+target+ "and value of index "+index);
       if(target==0)
       {
           //if(!mainlist.contains(new ArrayList<>(curr)))
           System.out.println("base case hit"+ curr +"is added ");
           mainlist.add(new ArrayList<>(curr));
       }
       if(target<0)
       {
            System.out.println("negative target");
           return;
       }
       for(int i=index;i<a.length;i++)
       {
           if(i>index && a[i]==a[i-1])
           {
               //System.out.print(i+ "is the i and "+index +" is the index  ");
               //System.out.print(a[i]==a[i-1] );
               System.out.println("inner condition hits");
               continue;
           }
           curr.add(a[i]);
           System.out.println(a[i]+" is added to the curr i.e "+curr);
           mine_combinations(a, target-a[i], curr, i+1, mainlist);
           System.out.println("while returing "+curr.get(curr.size()-1)+" is removed");
           curr.remove(curr.size()-1);
       }
    }
}
