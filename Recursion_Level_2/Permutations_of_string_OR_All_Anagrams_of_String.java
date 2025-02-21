package Recursion_Level_2;
public class Permutations_of_string_OR_All_Anagrams_of_String 
{
    public static void main(String[] args)
    {
        combinations("ABC", "");
    }
    static void combinations(String s,String ans)
    {
        if(s.equals("") )
        {
            System.out.println(ans);
        }
        else
        {
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                String rem=s.substring(0,i)+s.substring(i+1);
                combinations(rem, ans+ch);
            }
        }
    }
}
