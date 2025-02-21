package Arrays;
import java.util.*;
public class leetcode_1207_unique_number_of_occurances 
{
    public static void main(String[] args) {
        int arr[]={-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] a) 
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(hm.containsKey(a[i]))
            {
                hm.put(a[i], hm.get(a[i])+1);
            }
            else
            {
                hm.put(a[i], 1);
            }
        }
        //System.out.println(hm);
        HashSet<Integer> hs=new HashSet<>();
        for(int p:hm.values())
        {
            if(hs.contains(p))
                return false;
            else
                hs.add(p);
        }
        return true;
    }
}
