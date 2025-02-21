package DP_Leetcode_2;
public class leetcode_1014_max_pair_sightseen 
{
    public static void main(String[] args) {
        int a[]={8,1,5,2,6};
        System.out.println(bestpair(a));
    }
    /*Brute force is a TLE solution 
    static int bestpair(int a[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {    
            for(int j=i+1;j<a.length;j++)
            {
                int diff= a[i] + a[j] + i - j;
                max=Math.max(max, diff);
            }
        }
        return max;
    }*/
    //this is a greedy approach 
    // watch this https://www.youtube.com/watch?v=9nZp3fnctkY
    public static int bestpair(int[] a) 
    {            //First    //second
        //ans is (a[i]+i) + (a[j]-j)
        //both 1st and 2nd need to be maxed 
        int max=Integer.MIN_VALUE;
        int first=a[0];
        for(int j=1;j<a.length;j++)
        {
            int second=a[j]-j;
            max=Math.max(max,first+second);
            first=Math.max(first,a[j]+j);
        }
        return max;
    }
}
