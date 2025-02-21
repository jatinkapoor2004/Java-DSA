package Matrix_Leetcode;

import java.util.*;

public class leetcode_54_Spiral_Matrix 
{
    public static void main(String[] args) {
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        print(a);
        System.out.println(spiralOrder(a));
    }
    public static List<Integer> spiralOrder(int[][] a) 
    {
        List<Integer>al=new ArrayList<>();
        int rows=a.length,cols=a[0].length;
        int x1=0,x2=cols-1,y1=0,y2=rows-1;
        //System.out.println(x1+"  "+x2+"  "+y1+"  "+y2);
        int n=rows*cols;
        int k=0;
        while(k<n)
        {
            //go right
            for(int i=x1;i<=x2 && k < n;i++)
            {
                al.add(a[y1][i]);
                k++;
            }
            y1++;
            
            //go down 
            for(int i=y1;i<=y2 && k < n;i++)
            {
                al.add(a[i][x2]);
                k++;
            }
            x2--;
            //go left
            for(int i=x2;i>=x1 && k < n;i--)
            {
                al.add(a[y2][i]);
                k++;
            }
            y2--;
            //go up
            for(int i=y2;i>=y1 && k < n;i--)
            {
                al.add(a[i][x1]);
                k++;
            }
            x1++;
        }
        return al;
    }
     static void print(int a[][])
    {
        for(int i=0;i<=a.length-1;i++)
        {
            for(int j=0;j<=a[i].length-1;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
