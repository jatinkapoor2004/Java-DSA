package Recursion_Level_2;
public class ways_to_score 
{
    public static void main(String[] args)
    {
        int score[]={1,3,5};
        ways(score, 15, "");
    }
    static void ways(int score[],int target,String ans)
    {
        if(target==0)
            System.out.println(ans);
        else if(target<0){}
        else
        {
            for(int i=0;i<score.length;i++)
            {
                ways(score, target-score[i], ans+score[i]+" ");
            }
        }
    }
}
