/* Input n, X and an array of size n from user then print the number 
    of subsets of array whose LCM is equal to X . 
eg n=4 X=6 [2,3,4,6]
output 5 --> because subsets with LCM 6 are [2,3],[2,3,6],[2,6],[3,6],[6]

eg2 n=5 X=349 [1,1,1,1,349]
output 16 
*/
package Extra_Random_Questions;
import java.util.*;
public class subset_my_accenture_medium_question 
{
    static int count;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //System.out.println(gcd(48, 6));
        //System.out.println(lcm(6, 48));
        int a[]={1,1,1,1,349};
        int n=5;
        int x=349;
        //System.out.println(lcmofarray(a));
//        System.out.println("enter n");
//        int n= scan.nextInt();
//        System.out.println("enter x");
//        int x=scan.nextInt();
//        System.out.println("enter element of array ");
//        int a[]=new int[n];
//        for(int i=0;i<n;i++)
//            a[i]=scan.nextInt();
//        System.out.println(Arrays.toString(a));
          count=0;
          System.out.println(countsubsets(a, n, x));
    }
    public static int countsubsets(int a[],int n,int x)
    {
        mine(a, 0, x, "");
        return count;
    }
    public static void mine(int a[],int n,int x,String ans)
    {
        if(n==a.length)
        {
            //subset is ready convert to array and check 
            //System.out.println("base case hits");
            System.out.println(ans);
            int b[]=convertstringtoarray(ans);
            if( b.length>0 &&lcmofarray(b)==x)
                count++;
        }
        else
        {
            //include
            mine(a, n+1, x, ans+a[n]+" ");
            //don't include
            mine(a, n+1, x, ans);
        }
    }
    public static int [] convertstringtoarray(String s)
    {
        StringTokenizer st=new StringTokenizer(s);
        int n=st.countTokens();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(st.nextToken());
        }
        return a;
    }
    public static int gcd(int a,int b)
    {
        if(b==0)
            return a;
        else
            return gcd( b ,a%b);
    }
    public static int lcm(int a,int b)
    {
        return (a*b) / gcd(a, b);
    }
    public static int lcmofarray(int a[])
    {
        int LCM=a[0];
        for(int i=1;i<a.length;i++)
        {
            LCM = lcm(LCM, a[i]);
        }
        return LCM;
    }
}
