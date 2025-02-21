package Playing_with_number;
public class leetcode_278_first_bad_version 
{
    public static void main(String[] args) {
        System.out.println(firstBadVersion(3));
    }
    static boolean isBadVersion(int n)
    {
        return n==2 || n==3 ;
    }
    public static int firstBadVersion(int n) 
    {
        int b=1;
        int e=n;
        int m=(b+e)/2;
        int result =n;
        while(b<=e)
        {
            m=(b+e)/2;
            if(isBadVersion(m))
            {
                e=m-1;
                result=m;
            }
            else
            {
                b=m+1;
                
            }
        }
        return result;
    }
}
