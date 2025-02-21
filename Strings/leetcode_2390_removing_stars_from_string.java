package Strings;
public class leetcode_2390_removing_stars_from_string 
{
    public static void main(String[] args) 
    {
        System.out.println(removeStars("erase*****"));
    }
    public static String removeStars(String s)
    {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
            {
                sb.deleteCharAt(sb.length()-1);
            }
            else
            {
                sb.append(s.charAt(i));
            }
            //System.out.println(sb);
        }
        return sb.toString();
    }
}
