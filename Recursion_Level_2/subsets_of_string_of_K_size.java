package Recursion_Level_2;
public class subsets_of_string_of_K_size 
{
    public static void main(String[] args) {
        subsets("1234", 2, 0, "");
    }
    static void subsets(String s,int k,int i,String ans)
    {
        if( i==s.length())
        {
            if(ans.length()==k)
            System.out.println(ans);
        }
        else
        {
            subsets(s, k, i+1, ans+s.charAt(i));
            subsets(s, k, i+1, ans);

        }
    }
}
