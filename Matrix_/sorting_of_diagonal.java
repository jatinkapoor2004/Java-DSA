package Matrix_;
import java.util.*;
public class sorting_of_diagonal 
{
    public static void main(String[] args) 
    {
        int a[][]={{9,8,7},{6,5,4},{3,2,1}};
        System.out.println("before");
        print(a);
        sort(a);
        System.out.println("after");
        print(a);
    }
    public static void sort(int a[][])
    {
        
        int b[]=new int[3];
        int n=a.length;
        for(int i=0;i<=n-1;i++)
        {
            b[i]=a[i][i];
        }
        Arrays.sort(b);
        
        for(int i=0;i<=n-1;i++)
        {
            a[i][i]=b[i];
        }
    }
    static void print(int a[][])
    {
        for(int i=0;i<=a.length-1;i++)
        {
            for(int j=0;j<=a[i].length-1;j++)
            {
                System.out.print(a[i][j]+"");
            }
            System.out.println();
        }
    }
}
