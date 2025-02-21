package Recursion_Level_2;
public class cut_string_into_various_combinations 
{
    public static void main(String[] args) {
        cut_combinations("ABCD", 0, "");
    }
    static void cut_combinations(String s,int i,String ans)
    {
        if(i==s.length())
        {
            System.out.println(ans);
        }
        else
        {
            char ch=s.charAt(i);
            if(i<s.length()-1) 
            {
                //cut_combinations(s, i+1, ans+ch);
                cut_combinations(s, i+1, ans+ch+"_");  
            }
            //else
            cut_combinations(s, i+1, ans+ch);            
        }
    }
}
