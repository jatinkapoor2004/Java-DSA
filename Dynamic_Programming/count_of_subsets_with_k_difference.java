package Dynamic_Programming;
import java.util.Arrays;
public class count_of_subsets_with_k_difference 
{
    public static void main(String[] args)
    {
        int a[]={1,5,2,2,7};
        int k=3;
        int total=Arrays.stream(a).sum();
        int sum1=(total+k)/2;
        int sum2=(total-k)/2;
        System.out.println("two required sums are "+sum1+" and "+sum2);
        System.out.println(countways(a, sum1,a.length));
    }
    //ways to reach any 1 of the two partion sums we need i.e sum1 and sum2
    static int countways(int a[],int target,int n)
    {
        if(target==0)
        {
            return 1;
        }
        if(n==0)
        {
            return 0;
        }
        else 
        {
            int ans1=0,ans2=0,index=n-1;
            if(target-a[index]>=0)
            {
                ans1=countways(a, target-a[index], n-1);
            }
            ans2=countways(a, target, n-1);
            return ans1+ ans2;
        }
    }
    
}
