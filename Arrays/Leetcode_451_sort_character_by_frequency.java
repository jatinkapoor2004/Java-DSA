package Arrays;
import java.util.*;
public class Leetcode_451_sort_character_by_frequency 
{
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));   
    }
     public static String frequencySort(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
                int val=hm.get(s.charAt(i));
                val++;
                hm.put(s.charAt(i), val);
            }
            else
            {
                hm.put(s.charAt(i),1);
            }
        }
         System.out.println(hm);
         ArrayList<Character> al=new ArrayList<>(hm.keySet());
         System.out.println(al);
         
         Collections.sort(al, (a,b) -> {
             if(hm.get(a)>hm.get(b))
             {
                 //return hm.get(b)-hm.get(a);
                 return -1;
             }
             else
             {
                 //return hm.get(a)-hm.get(b);
                 return 1;
             }
         });
         System.out.println("after sorting "+ al);
         String p="";
         for(Character k:al)
         {
             for(int i=0;i< hm.get(k);i++)
             {
                 p=p+k;
             }
         }
         
         return p;
        
    }
     
}
