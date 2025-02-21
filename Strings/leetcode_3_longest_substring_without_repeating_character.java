package Strings;

import java.util.HashSet;

public class leetcode_3_longest_substring_without_repeating_character 
{
    public static void main(String[] args) {
        //System.out.println("aab");
        System.out.println(lengthOfLongestSubstring("bbbb"));
    }
    public static int lengthOfLongestSubstring(String s)
    {
        int l=0,r=0,max=0;
        HashSet<Character> hs=new HashSet<>();
        while(r<s.length())
        {           
            char ch=s.charAt(r);
            if(hs.add(ch))
            {              
                max=Math.max(max, r-l+1);
                r++;
                //System.out.println("r is incremented");
            }
             else if(hs.contains(ch))
            {
                while(s.charAt(l)!=ch)
                {
                    hs.remove(s.charAt(l));
                    //System.out.println(s.charAt(l)+" is removed from hashset");
                    l++;
                }
                hs.remove(ch);
                l++;
                //by writing following two lines one step i.e to add character and update r in next step is decresed hence complexity improve 
                hs.add(ch);
                r++;
            }
            //System.out.println(r);
        }
        return max;
    }
}
