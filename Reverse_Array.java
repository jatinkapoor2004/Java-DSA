
import java.util.*;

public class Reverse_Array 
{
    public static void main(String[] args)
    {
        int a[]={10,50,4,8,5,36,85,89};
        System.out.println(Arrays.toString(a));
        reverse(a);
        System.out.print("Reversed array is ----->");
        System.out.println(Arrays.toString(a));
    }
    public static int[] reverse(int a[])
    {
        for(int i=0;i<(a.length)/2;i++)
        {
            int temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
        return a;
    }
}
