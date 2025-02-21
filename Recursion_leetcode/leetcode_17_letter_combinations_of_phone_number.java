package Recursion_leetcode;

import java.util.*;

public class leetcode_17_letter_combinations_of_phone_number 
{
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
    public static List<String> letterCombinations(String s)
    {
        List<String> al=new ArrayList<>();
        HashMap<String,String> hm=new HashMap<>();
        hm.put("2","abc");
        hm.put("3", "def");
        hm.put("4", "ghi");
        hm.put("5", "jkl");
        hm.put("6", "mno");
        hm.put("7", "pqrs");
        hm.put("8", "tuv");
        hm.put("9", "wxyz");
        if(s.equals(""))
            return al;
        mine(s, "", 0, al,hm);
        return al;
    }
    static void mine(String s,String ans,int i,List<String> al,HashMap<String,String> hm)
    {
       if(ans.length()==s.length())
       {
           al.add(ans);
       }
       else
       {
          for(char c: hm.get(s.charAt(i)+"").toCharArray())
          {
              mine(s, ans+c, i+1, al, hm);
          }
       }
    }
}
