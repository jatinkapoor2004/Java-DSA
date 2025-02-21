package Strings;
public class leetcode_28_index_of_first_occurance_of_string 
{
    public static void main(String[] args) 
    {
        System.out.println(strStr("leetcode", "leeto"));
    }
    public static int strStr(String a, String b)
    {
        if(b.length()>a.length())
        {
            return -1;
        }
        for(int i=0;i<=a.length()-b.length();i++)
        {
            String st=a.substring(i,i+b.length());
            if(st.equals(b))
            {
                return i;
            }
        }
        return -1;
    }
}
