package Strings;
public class leetcode_1768_merge_strings_alternately 
{
    public static void main(String[] args) 
    {
        String s1="abcd";
        String s2="pq";
        System.out.println(mergeAlternately(s1, s2));
    }
    public static String mergeAlternately(String s1, String s2) 
    {
        StringBuffer sb= new StringBuffer("");
        int i=0;
        while(sb.length()<s1.length()+s2.length())
        {
            if(i<s1.length())
            {
                char ch=s1.charAt(i);
                sb.append(ch);
            }
            if(i<s2.length())
            {
                char ch=s2.charAt(i);
                sb.append(ch);
            }
            i++;
        }
        return sb.toString();
    }
}
