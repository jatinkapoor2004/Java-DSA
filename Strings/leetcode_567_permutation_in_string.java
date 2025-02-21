package Strings;
import java.util.*;
public class leetcode_567_permutation_in_string 
{
    public static void main(String[] args) {
        System.out.println(checkInclusion("adc","dcda"));
    }
    public static boolean checkInclusion(String s1, String s2) 
    {
        if(s1.length()>s2.length())
        return false;
        
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            if(hm.containsKey(s1.charAt(i)))
            {
                int val=hm.get(s1.charAt(i));
                val++;
                hm.put(s1.charAt(i), val);
            }
            else
            {
                hm.put(s1.charAt(i), 1);
            }
        }
        //System.out.println(hm);
        
        HashMap<Character,Integer> hm2=new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            if(hm2.containsKey(s2.charAt(i)))
            {
                int val=hm2.get(s2.charAt(i));
                val++;
                hm2.put(s2.charAt(i), val);
            }
            else
            {
                hm2.put(s2.charAt(i), 1);
            }
        }
        //System.out.println(hm2);
        if(hm.equals(hm2))
            return true;
        
        for(int i=s1.length();i<s2.length();i++)
        {
            char ch=s2.charAt(i);
            int oldvalue=hm2.get(s2.charAt(i-s1.length()));
            oldvalue--;
            //System.out.println("after decreseing old value is "+oldvalue);
            if(oldvalue<=0)
            {
                hm2.remove(s2.charAt(i-s1.length()));
                //System.out.println("character is removed");
            }
            else
            {
                hm2.put(s2.charAt(i-s1.length()), oldvalue);
            }
            if(hm2.containsKey(ch))
            {
                hm2.put(ch, hm2.get(ch)+1);
            }
            else
            {
                hm2.put(ch, 1);
            }
            
            //System.out.println("after loop end this is hm2"+hm2);
            if(hm.equals(hm2))
                return true;
        }
        return false;
    }
}
