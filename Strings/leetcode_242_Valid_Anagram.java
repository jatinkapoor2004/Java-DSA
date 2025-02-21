package Strings;

import java.util.*;

public class leetcode_242_Valid_Anagram 
{
    public static void main(String[] args)
    {
        System.out.println(isAnagram("rat", "tar"));
    }
    public static boolean isAnagram(String s, String t)
     {  
         char[] a=s.toCharArray();
         char[] b=t.toCharArray();
         Arrays.sort(a);
         Arrays.sort(b);
         return(Arrays.equals(a, b));
         
         
         
         
         
         
//        HashMap<Character,Integer> hm=new HashMap<>();
//        HashMap<Character,Integer> hm2=new HashMap<>();
//        for(int i=0;i<s.length();i++)
//        {
//            if(hm.containsKey(s.charAt(i)))
//            {
//                int n=hm.get(s.charAt(i));
//                n++;
//                hm.put(s.charAt(i), n);
//            }
//            else{
//                hm.put(s.charAt(i), 1);
//            }
//        }
//        
//        for(int i=0;i<t.length();i++)
//        {
//            if(hm2.containsKey(t.charAt(i)))
//            {
//                int n=hm2.get(t.charAt(i));
//                n++;
//                hm2.put(t.charAt(i), n);
//            }
//            else{
//                hm2.put(t.charAt(i), 1);
//            }
//        }
//        return hm.equals(hm2);
            
    }
}
