package Recursion_Level_2;
public class subsets_of_string 
{
    public static void main(String[] args) {
        subsets("abc","",0);
    }
    static void subsets(String s,String ans,int i)
    {
        if(i==s.length())
            System.out.println(ans);
        else
        {
            char ch=s.charAt(i);
            subsets(s, ans, i+1);
            subsets(s, ans+ch, i+1);

        }
    }
}
