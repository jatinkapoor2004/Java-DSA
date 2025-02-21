package DP_Leetcode_2;
public class leetcode_72_Edit_Distance 
{
    public static void main(String[] args) 
    {
        System.out.println(minDistance("dinitrophenylhydrazine", "benzalphenylhydrazone"));
    }
    public static int minDistance(String word1, String word2) 
    {
        int m=word1.length();
        int n=word2.length();
        return mine(word1, word2, m, n);
    }
    public static int mine(String s1,String s2,int m,int n)
    {
        if(m==0)
        {
            return n;
        }
        else if(n==0)
        {
            return m;
        }
        else
        {
            int index1=m-1,index2=n-1;
            if(s1.charAt(index1)==s2.charAt(index2))
            {
                return 0+mine(s1, s2, m-1, n-1);
            }
            else
            {
                int delete=1 + mine(s1, s2, m-1, n);
                int replace=1 + mine(s1, s2, m-1, n-1);
                int insert=1 + mine(s1, s2, m, n-1);
                return Math.min(delete, Math.min(replace,insert));
            }
        }
    }
}
