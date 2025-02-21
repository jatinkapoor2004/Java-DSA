package Matrix_Leetcode;
public class leetcode_1672_richest_customer_wealth 
{
    public static void main(String[] args) 
    {
        int a[][]={{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(a));
    }
    public static int maximumWealth(int[][] a) 
    {
        int max=0;
        for(int i=0;i<a.length;i++)
        {
            int sum=0;
            for(int j=0;j<a[i].length;j++)
            {
                sum+=a[i][j];
            }
            max=Math.max(max, sum);
        }
        return max;
    }
}
