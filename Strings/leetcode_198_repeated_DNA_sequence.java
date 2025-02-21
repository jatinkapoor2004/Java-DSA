package Strings;

import java.util.*;
import java.util.List;

public class leetcode_198_repeated_DNA_sequence 
{
    public static void main(String[] args) 
    {
        System.out.println(findRepeatedDnaSequences("AAAAAAAAAAAAA"));
    }
    public static List<String> findRepeatedDnaSequences(String s) 
    {
        List<String> al=new ArrayList<>();
        
        StringBuilder sb=new StringBuilder(s.substring(0,10));
        HashSet<String> hs=new HashSet<>();
        hs.add(sb.toString());
        for(int i=10;i<s.length();i++)
        {
            StringBuilder sb2= sb.append(s.charAt(i));
            sb2.deleteCharAt(0);
            if(hs.contains(sb2.toString()) && !al.contains(sb2.toString()))
            {
                al.add(sb2.toString());
            }
            else
            {
                hs.add(sb2.toString());
            }
        }
        return al;
    }  
    // this is a better approach
//        HashSet<String> hs=new HashSet<>();
//        for(int i=0;i<=s.length()-10;i++)
//        {
//            String p=s.substring(i,i+10);
//            if(hs.contains(p))
//            {
//                if(!al.contains(p))//if we put this in line 39 then its more better
//                al.add(p);
//            }
//            else
//            {
//                hs.add(p);
//            }
//        }
//        
//        return al;
//    }
}
