package Strings;
import java.util.*;
public class leetcode_205_Isomorphic_Strings 
{
    public static void main(String[] args) 
    {
        System.out.println(isIsomorphic("badc", "baba"));
    }
    public static boolean isIsomorphic(String s, String t) 
    {
        if(s.length()!=t.length())
        return false;

        HashMap<Character,Character> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            
            if(hm.containsKey(ch1))
            {
                char ch=hm.get(ch1);
                if(ch!=ch2)
                return false;
            }
            else
            {
                if(hm.containsValue(ch2))
                return false;
                
                hm.put(ch1,ch2);
            }
        }
        System.out.println(hm);
        return true;
    }
}
