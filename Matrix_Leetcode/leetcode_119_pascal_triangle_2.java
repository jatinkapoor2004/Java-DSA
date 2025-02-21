package Matrix_Leetcode;

import java.util.ArrayList;
import java.util.List;
public class leetcode_119_pascal_triangle_2
{
    public static void main(String[] args) 
    {
        System.out.println(getRow(3));
    
    }
    public static List<Integer> getRow(int rows) 
    {
        List<Integer>al=new ArrayList<>();
        int a[][]=new int[rows+1][rows+1];
        for(int i=0;i<a.length;i++)
        {
            al.clear();
            for(int j=0;j<a[i].length;j++)
            {
                if(i==j || j==0)
                {
                    a[i][j]=1;
                    al.add(1);
                }
                else if(i<j)
                {
                    a[i][j]=0;
                }
                else
                {
                    a[i][j]=a[i-1][j]+a[i-1][j-1];
                    al.add(a[i][j]);
                }
            }
        }
        return al;
       
    }
}

