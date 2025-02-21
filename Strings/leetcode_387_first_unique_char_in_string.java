package Strings;

//import java.util.LinkedHashMap;

import java.util.Arrays;


public class leetcode_387_first_unique_char_in_string 
{
    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabb"));
    }
    public static int firstUniqChar(String s)
    {
        int a[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)-'a']++;
        }
        //System.out.println(Arrays.toString(a));
        
        for(int i=0;i<s.length();i++)
        {
            if(a[s.charAt(i)-'a']==1)
            {
                return i;
            }
        }
        return -1;
    }
        /*LinkedHashMap<Character,Integer> hm=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++)
        {            
            if(hm.containsKey(s.charAt(i)))
            {
                int count=hm.get(s.charAt(i));
                count++;
                hm.put(s.charAt(i), count);
            }
            else
            {
                hm.put(s.charAt(i),1);
            }
        }
        //System.out.println(hm);
        char index=' ';
        for(char p:hm.keySet())
        {
            if(hm.get(p)==1)
            {
                index=p;
                break;
            }
        }
        //System.out.println(index);
        for(int i=0;i<s.length();i++)
        {
            if(index==s.charAt(i))
            {
                return i;
            }
        }
        return -1;
    }*/
}
