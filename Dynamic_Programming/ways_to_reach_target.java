package Dynamic_Programming;
public class ways_to_reach_target 
{
    public static void main(String[] args) {
        int a[]={1,2,7,8,10, 11,12,17,18,20, 21,22,27,28,30, 31,32,37,38,40, 111,112,117,118,1110, 1111,122,127,128,220, 213,232,237,283,330, 431,342,437,438,440 };
        int n=a.length;
        System.out.println(ways(a, 1000, n));
    }
    static int ways( int a[],int target,int n) 
    {
        if(target==0)
        {
            return 1;
        }
        else if(n==0)
        {
            return 0;
        }
        else
        {
            int ans1=0,ans2=0,index=n-1;
            if(target-a[index]>=0)
            {
                ans1=ways(a, target-a[index], n-1);
            }
            ans2=ways(a, target, n-1);
            return ans1+ans2;
        }
    }
}
