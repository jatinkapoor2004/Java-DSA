package DP_Leetcode;
public class coin_tower_game_gfg 
{
    public static void main(String[] args) {
        System.out.println(steps(100, 3, 4));
    }
    public static int steps(int n, int x, int y)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n==x || n==y || n==1)
        {
            return 1;
        }
        else
        {
            int ans1=10000,ans2=10000,ans3=10000;
            if(n-1>=0)
                ans1=1+steps(n-1, x, y);
            
            if(n-x>=0)
                ans2=1+steps(n-x, x, y);
            
            if(n-y>=0)
                ans3=1+steps(n-y, x, y);
            
            return Math.min(ans1, Math.min(ans2, ans3));
        }
    }
}
