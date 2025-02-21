package Recursion;

import java.util.StringTokenizer;

public class max_product 
{
    public static void main(String[] args) {
        int n =8;
/*here we make max number in array because max has to remain constant 
or same throught all the copies of recursion and this max value will be 
compared with product that we will calculate each time when base case hits.*/ 
        int max[]={0};
        maxproduct(n, "",max);
        System.out.println(max[0]);
    }
    static void maxproduct(int n,String ans,int max[])
    {
        if(n==0)
        {
            StringTokenizer st=new StringTokenizer(ans);
            int num=st.countTokens();
            int product=1;
            for(int j=0;j<num;j++)
            {
                int p=Integer.parseInt(st.nextToken());
                product=product*p;
            }
            //System.out.println(product);
            max[0]=Math.max(max[0], product);
            
        }
        else
        {
            for(int i=1;i<=n;i++)
            maxproduct(n-i, ans+i+" ",max);
        }
    }
}
