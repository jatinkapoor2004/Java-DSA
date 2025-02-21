
import java.util.ArrayList;

public class leetcode_1823_Josephus_problem
{
    public static void main(String[] args) {
        System.out.println(findTheWinner(6, 5));
    }
    public static int findTheWinner(int n, int k) 
    {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            al.add(i);
        }
        System.out.println(al);
        int i=-1;
        while(al.size()!=1)
        {
            i=(i+k)%al.size();
            al.remove(i);
            i--;
            
        }
        return al.get(0);
    }
}
