package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class leetcode_448_multiple_missing_numbers_in_array 
{
    public static void main(String[] args) 
    {
        int a[]={1,1};
        System.out.println(findDisappearedNumbers(a));       
    }
    public static List<Integer> findDisappearedNumbers(int[] a)
    {
        List<Integer> al=new ArrayList<>();
        boolean b[]=new boolean[a.length+1];
        b[0]=true;
        for(int i=0;i<a.length;i++)
        {
            b[a[i]]=true;
        }        
        System.out.println(Arrays.toString(b));
        for(int i=0;i<b.length;i++)
        {
            if(b[i]==false)
            {
            al.add(i);
            }
        }
        return al;
    }
}
