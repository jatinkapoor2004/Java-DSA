package Recursion_leetcode;
import java.util.*;
public class leetcode_77_combinations_of_K_size_from_N_numbers 
{
    public static void main(String[] args) {
        System.out.println(combine(1, 1));
    }
    public static List<List<Integer>> combine(int n, int k) 
    {
        List<List<Integer>> mainlist=new ArrayList<>();
        mine_combine(n, k,1, new ArrayList<>(), mainlist);
        return mainlist;
    }
    static void mine_combine(int n,int k,int index,ArrayList<Integer>curr,List<List<Integer>>mainlist)
    {
        if(curr.size()==k)
        {
            mainlist.add(new ArrayList<>(curr));
        }
        
        if(curr.size()>k)return;
        
        for(int i=index;i<=n;i++)
        {
            curr.add(i);
            mine_combine(n, k, i+1, curr, mainlist);
            curr.remove(curr.size()-1);
        }
    }
}
