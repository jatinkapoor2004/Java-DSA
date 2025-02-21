package Matrix_Leetcode;

import java.util.ArrayList;
import java.util.List;
public class leetcode_118_pascal_triangle_1
{
    public static void main(String[] args) 
    {
        System.out.println(generate(5));
    
    }
    public static List<List<Integer>> generate(int rows) 
    {
        List<List<Integer>> mainlist=new ArrayList<>();
        int a[][]=new int[rows][rows];
        for(int i=0;i<a.length;i++)
        {
            List<Integer>al=new ArrayList<>();
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
            mainlist.add(al);
        }
       return mainlist;
    }
}

