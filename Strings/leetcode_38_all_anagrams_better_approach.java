package Strings;

import java.util.*;

public class leetcode_38_all_anagrams_better_approach 
{
    public static void main(String[] args) 
    {   
        System.out.println("abab");
        System.out.println("ab");
        System.out.println(findAnagrams("abab", "ab"));
    }
    public static List<Integer> findAnagrams(String s, String w) 
    {
            List<Integer> al=new ArrayList<>();
            HashMap<Character,Integer> hm=new HashMap<>();
            for(int i=0;i<w.length();i++)
            {
                if(hm.containsKey(w.charAt(i)))
                {
                    int val=hm.get(w.charAt(i));
                    val++;
                    hm.put(w.charAt(i), val);
                }
                else
                {
                    hm.put(w.charAt(i), 1);
                }
            }
            System.out.println("hashmap of w string "+hm);
            HashMap<Character,Integer> hm2=new HashMap<>();
            for(int i=0;i<w.length();i++)
            {
                if(hm2.containsKey(s.charAt(i)))
                {
                    int val=hm2.get(s.charAt(i));
                    val++;
                    hm2.put(s.charAt(i), val);
                }
                else
                {
                    hm2.put(s.charAt(i), 1);
                }
            }
            System.out.println("hashmap of first 3 letters of s string "+hm2);
            if(hm.equals(hm2))
                {
                    al.add(0);
                }
            for(int i=w.length();i<s.length();i++)
            {                
               char ch=s.charAt(i);
                System.out.println("character picked is ----> "+ ch);
               int old=hm2.get(s.charAt(i-w.length()));
                System.out.println("frequency of "+s.charAt(i-w.length())+" jo delete hona hai is  ---> "+old);
               old--;
                System.out.println("value of old is decresed ");
               if(old==0)
               {
                   hm2.remove(s.charAt(i-w.length()));
                   System.out.println("old is found 0 after decresed so "+s.charAt(i-w.length())+" is removed from hm2");
               }
               else
               {
                   hm2.put(s.charAt(i-w.length()), old);
               }
               if(hm2.containsKey(ch))
               {
                   int neww=hm2.get(ch);
                   System.out.println("hm2 already contain "+ch+" with value "+neww);
                   neww++;
                   System.out.println("neww is increased ");
                   hm2.put(ch, neww);
                   System.out.println(ch+" is added in hm2");
                   System.out.println("hashmap looks like this "+hm2);
               }
               else
               {
                   hm2.put(ch, 1);
                   System.out.println(ch+" is added first time in hm2");
                   System.out.println("hashmap looks like this "+hm2);
               }
               if(hm2.equals(hm))
               {
                   al.add(i-w.length()+1);
               }
                System.out.println();
            }
            return al;
    }       

//                if(!hm2.containsKey(ch))
//                {
//                    hm2.put(ch, 1);
//                    System.out.println(ch+" does not exist in HM2 so we add it");
//                }
////                int old_val=hm2.get(s.charAt(i-w.length()));
////                old_val=0;
////                hm2.remove(s.charAt(i-w.length()));
//
////              System.out.println(s.charAt(i-w.length())+" is removed from HM2");
//                //System.out.println(hm2);
//                else
//                {
//                    int new_val=hm2.get(ch);
//                    new_val++;
//                    System.out.println("New value of "+ch+" is "+new_val);
//                    hm2.put(ch, new_val);
//                    System.out.println("new val is added ");
//                    System.out.println(hm2);
//                    hm2.put(s.charAt(i-w.length()),0);
//                }        
//                if(hm.equals(hm2))
//                {
//                    al.add(i+1-w.length());
//                }
//            }                     
}
