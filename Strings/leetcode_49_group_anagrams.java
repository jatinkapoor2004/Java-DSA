package Strings;

import java.util.*;

public class leetcode_49_group_anagrams 
{
    public static void main(String[] args) 
    {
        String str[]={"eat","tea","tan","ate","nat","bat"};
        System.out.println(Arrays.toString(str));
        System.out.println(groupAnagrams(str));
    }
     public static List<List<String>> groupAnagrams(String[] strs) 
    {
        List<List<String>> mainlist=new ArrayList<>();
        HashMap<String,List<String>> hm=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            String copy=strs[i];
            char ch[]=strs[i].toCharArray();
            Arrays.sort(ch);
            strs[i]="";
            strs[i]=new String(ch);
//            for(char p:ch)
//            {
//                strs[i]+=p;
//            }
            List<String> al=new ArrayList<>();
            if(hm.containsKey(strs[i]))
            {
                al=hm.get(strs[i]);
                al.add(copy);
                hm.put(strs[i], al);
            }
            else
            {
                al.add(copy);
                hm.put(strs[i],al );
            }
        }
        for(String k:hm.keySet())
        {
            mainlist.add(hm.get(k));
        }
        return mainlist;
    }
}
