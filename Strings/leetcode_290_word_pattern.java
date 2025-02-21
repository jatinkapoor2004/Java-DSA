package Strings;
import java.util.*;
public class leetcode_290_word_pattern 
{
    public static void main(String[] args) {
        System.out.println("dog cat cat dog\n");
        System.out.println("abba\n\n");
        System.out.println(wordPattern("abba","dog cat cat dog"));
    }
    public static  boolean wordPattern(String pattern, String s) 
    {
        HashMap<String,Character> hm=new HashMap<>();
        StringTokenizer st=new StringTokenizer(s);
        int count=st.countTokens();
        if(count!=pattern.length())
        {
            System.out.println("it hits");
            return false;
        }
        for(int i=0;i<pattern.length();i++)
        {
            String p=st.nextToken();
            System.out.println(p +" is the word from pattern ");
            char ch= pattern.charAt(i);
            System.out.println(ch+" is the charcter used to store that word");
            if(hm.containsKey(p))
            {
                if(!hm.get(p).equals(ch))
                {
                    System.out.println("as "+hm.get(p)+" is not equal to "+ch+" so returning false");
                    return false;
                }
            }
            else
            {
                if(hm.containsValue(ch))
                {
                    System.out.println("as hm doesnt contain "+ch+" as value so returning false");
                    return false;
                }    
                else
                hm.put( p,ch);
            }
            
        }
        System.out.println(hm);
        return true;
    }
}
